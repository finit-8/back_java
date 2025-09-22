package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import vo.MemberVO;

public class MemberDAO_Correct {
//   1. 연결 
   Connection connection;
   
//   2. 쿼리 실행
   PreparedStatement preparedStatement;
   
//   3. 결과
   ResultSet resultSet;
   
//   4. 로그인시 공용 저장소 세션
   public static Long session;
   
//   1) 아이디 중복검사
   public boolean checkId(String memberEmail) {
//      -  연결
      connection = DBConnecter.getConnect();
      
//      -  쿼리를 작성한다
//      String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = \'"+ memberEmail +"\'";
      
//      preparedStatement (상위 호환)
      String query = "SELECT ID, MEMBER_NAME FROM TBL_MEMBER WHERE MEMBER_EMAIL = ?";
      boolean check = false;
      
//      -  쿼리를 보낸다
//      query는 try ~ catch를 강제한다.
      try {
         preparedStatement = connection.prepareStatement(query);
         
         preparedStatement.setString(1, memberEmail);
//         -  데이터를 받는다. (VO)
//         결과가 있으면 .executeQuery()
//         결과가 없으면 .executeUpdate()
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
         Long id = resultSet.getLong(1);
         String memberName = resultSet.getString(2); 
         System.out.println(id);
         System.out.println(memberName);
         
      } catch (SQLException e) {
//         못찾았으면 
         check = true;
         System.out.println("checkId(String) Query문 오류");
         e.printStackTrace();
      } finally {
         try {
//            열었던 순서 반대로
            if(resultSet != null) {
               resultSet.close();
            }
            
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            System.out.println("리소스 해제 시 오류");
            e.printStackTrace();
         }
      }
//      -  리턴 
      return check;
   }
   
//   회원가입
   public void join(MemberVO memberVO) {
//      연결
      connection = DBConnecter.getConnect();
//      쿼리 작성
      String query = "INSERT INTO TBL_MEMBER "
            + "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?)";
      
//      쿼리 담고
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         preparedStatement.setString(3, memberVO.getMemberName());
         preparedStatement.setInt(4, memberVO.getMemberAge());
         preparedStatement.setString(5, memberVO.getMemberAddress());
         
//         쿼리 실행
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("join(memberVO) query문 오류");
         e.printStackTrace();
      } finally {
//         리턴 없으면 리소스 해제
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            System.out.println("리소스 해제 오류");
            e.printStackTrace();
         }
      }
   }
   
//   로그인, 테스트
   public boolean login(MemberVO memberVO) {
      String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
      connection = DBConnecter.getConnect();
      boolean isLogin = true;
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberPassword());

         resultSet = preparedStatement.executeQuery();
         resultSet.next();
         
//         서버 저장소
         session = resultSet.getLong(1);
         
      } catch (SQLException e) {
         isLogin = false;
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      return isLogin;
   }
   
//   마이페이지
   public Optional<MemberVO> findById() {
      String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_ADDRESS "
            + "FROM TBL_MEMBER WHERE ID = ?";
      connection = DBConnecter.getConnect();
      MemberVO memberVO = new MemberVO();
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         
         resultSet = preparedStatement.executeQuery();
         
//         행
         resultSet.next();
         memberVO.setId(resultSet.getLong("ID"));
         memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
         memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
         memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
         memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
         memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      return Optional.ofNullable(memberVO);
      
   }
   
//   비밀번호 변경
//   로그인 전 비밀번호 변경
   public boolean changePassword(MemberVO memberVO, String memberNewPassword) {
      String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
      String updateQuery = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
      boolean check = true;
      
      connection = DBConnecter.getConnect();
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         
         resultSet = preparedStatement.executeQuery();
         resultSet.next();
         Long foundId = resultSet.getLong("ID");
         
         preparedStatement = connection.prepareStatement(updateQuery);
         preparedStatement.setString(1, memberNewPassword);
         preparedStatement.setLong(2, foundId);
//         실행
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         check = false;
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      return check;
   }
   
//   로그인 후 비밀번호 변경
//   session - id
   public boolean changePassword(String memberNewPassword) {
      String updateQuery = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
      boolean check = true;
      
      connection = DBConnecter.getConnect();
      
      try {
         preparedStatement = connection.prepareStatement(updateQuery);
         preparedStatement.setString(1, memberNewPassword);
         preparedStatement.setLong(2, session);
//         실행
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         check = false;
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      return check;
   }
   
//   로그아웃
   public void logout() {
      session = null;
   }
   
//   로그인이 된 상태
//   회원정보 수정
	
   
   
   
}



















