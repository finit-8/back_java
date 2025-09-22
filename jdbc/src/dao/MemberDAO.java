package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import vo.MemberVO;

public class MemberDAO {
	// 1. 연결
	Connection connection;
	// 2. 쿼리 실행
	PreparedStatement preparedStatement;			// 왜 preparedStatement를 클래스가 아니라 인터페이스 객체로 쓰냐?
													// --> 인터페이스 - 확장성의 특성을 갖고있다. 
													//   왜 확장성이냐면, 인터페이스는 개발자에게 재정의 하라는 강제성을 부여하고, 넘치는 건 되지만 부족하면 안된다.
													//   그런데 쿼리가 부족해서 메모리 할당이 안되므로 개발자한테 재정의해서 부족한 걸 채우라고 강제성을 부여한 것.
	// 3. 결과
	ResultSet resultSet;
	// 4. 로그인시 공용 저장소 세션
	public static Long session;
	
	
	public void closeResources() {
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
			System.out.println("리소스 해제 중 오류 발생");
			e.printStackTrace();
		}
	}
	
	
	// 1) 아이디 중복검사
	public boolean checkId(String memberEmail) {
//	 	연결
		connection = DBConnecter.getConnect();	
//		쿼리 작성
//		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = \'" + memberEmail + "\'";     preparedStatement 쿼리 작성
		String query = "SELECT ID, MEMBER_NAME FROM TBL_MEMBER WHERE MEMBER_EMAIL = ?"; 		  // preparedStatement (상위호환)
		boolean check = false;
		
//		쿼리 전송
		try {													// 외부장치를 연결하는 경우(DB 연결) try ~ catch를 강제한다.
			preparedStatement = connection.prepareStatement(query);				
			preparedStatement.setString(1, memberEmail);		// 사용자 입력값을 String query문의 파라미터에 바인딩 == ?에 memberEmail 넣음
			
//		쿼리 실행
			resultSet = preparedStatement.executeQuery(); 		// 실행코드 [결과가 있으면 .executeQuery(), 결과가 없으면 .executeUpdate()]
//		VO타입의 데이터를 받음
			resultSet.next();									// db 행에 접근							
			Long id = resultSet.getLong(1);						
			String memberName = resultSet.getString(2);
			System.out.println(id);
			System.out.println(memberName);
			
		} catch (SQLException e) {
			check = true;										// db에서 데이터를 못찾았으면 check = true
			System.out.println("checkId(String) Query문 오류");
			e.printStackTrace();
		} finally {												// 열었던 순 반대로 클로즈
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
				System.out.println("리소스 해제 시 오류");
				e.printStackTrace();
			}
		}
		return check;											// db에서 데이터를 찾았으면 check 리턴
	}
	
	// 회원가입
	public void join(MemberVO memberVO1) {
		connection = DBConnecter.getConnect();
		String query = "INSERT INTO TBL_MEMBER"
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?)";	
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO1.getMemberEmail());
			preparedStatement.setString(2, memberVO1.getMemberPassword());
			preparedStatement.setString(3, memberVO1.getMemberName());
			preparedStatement.setInt(4, memberVO1.getMemberAge());
			preparedStatement.setString(5, memberVO1.getMemberAddress());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("join(memberVO1) query문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("자원해제 중 오류 발생");
				e.printStackTrace();
			}
		}
	}
	
	// 로그인 테스트
	public boolean login(MemberVO memberVO2) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
		boolean isLogin = true;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO2.getMemberEmail());
			preparedStatement.setString(2, memberVO2.getMemberPassword());
			
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			session = resultSet.getLong(1);
			
		} catch (SQLException e) { 
			isLogin = false;
			System.out.println("login(memberVO2) query문 오류 발생");
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
				System.out.println("자원해제 중 오류 발생");
				e.printStackTrace();
			}
		}
		return isLogin;
	}
	

    // 마이페이지
  	public Optional<MemberVO> findById(MemberVO memberVO) {
  		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_ADDRESS "
  				+ "FROM TBL_MEMBER WHERE ID = ?";
  		connection = DBConnecter.getConnect();
  		MemberVO memberVO2 = new MemberVO();
  		
  		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			resultSet = preparedStatement.executeQuery();
			
		  	// 행
	  		resultSet.next();
	  		memberVO2.setId(resultSet.getLong("ID"));				// 인덱스번호가 헷갈릴 거 같으면 컬럼의 이름(레이블)을 넣어도 됨
	  		memberVO2.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
	  		memberVO2.setMemberPassword(resultSet.getString("MEMBER_Password"));
	  		memberVO2.setMemberName(resultSet.getString("MEMBER_NAME"));
	  		memberVO2.setMemberAge(resultSet.getInt("MEMBER_AGE"));
	  		memberVO2.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
  		return Optional.ofNullable(memberVO);					// 단일객체는 옵셔널로 리턴
  		
//  		Optional<MemberVO> foundMember = memberDAO.findById();				
//  		foundMember.ifPresent(System.out::println);
//  		MemberVO member = foundMember.orElseThrow(MemberNotFoundException::new);
  	}

  	// 비밀번호 찾기
  	public void findPassword(MemberVO memberVO) {
  		// API로 처리하는 트렌트
  	}
  	
  	// 비밀번호 변경 (로그인 전 비밀번호 변경 - 세션사용 x / 로그인 후 비밀번호 변경 - 세션사용 o)
  	public void changePassword() {
  		String updateQuery = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
  		connection = DBConnecter.getConnect();
  		boolean isChange = true;
  		
//  	vo는 db에서 받아오는 행
  		
  		try {
			preparedStatement = connection.prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
  	}

  	// 로그아웃
  	
  	// 회원정보 수정
  	public boolean changeProfil(MemberVO memberVO) {
  		String updateQuery = "UPDATE TBL_MEMBER "
  				+ "SET MEMBER_EMAIL = ? AND MEMBER_NAME = ? AND MEMBER_AGE = ? AND MEMBER_ADDRESS = ? "
  				+ "WHERE ID = ?";
  		connection = DBConnecter.getConnect();
  		boolean isUpdate = true;
  		
  		try {
  			preparedStatement = connection.prepareStatement(updateQuery);
//  			preparedStatement.setObject(memberVO);
  	        preparedStatement.setString(1, memberVO.getMemberEmail());
  	        preparedStatement.setString(2, memberVO.getMemberName());
  	        preparedStatement.setInt(3, memberVO.getMemberAge());
  	        preparedStatement.setString(4, memberVO.getMemberAddress());
  	        preparedStatement.setLong(5, session);

  	        preparedStatement.executeUpdate();
  	        
//			preparedStatement.executeQuery();
//			resultSet = 
		} catch (SQLException e) {
			isUpdate = false;
			e.printStackTrace();
		} finally {
			this.closeResources();
		} 
  		return isUpdate;
  	}
  	
  							// 이미 세션에 있으니까 ↓ memberVO가 필요없는데, 왜 ↑ 위에는 해야하나?
  						
  	
  	// 회원탈퇴 ==> 이미 로그인 되어있는 상태
  	public void deleteUser() {
  		// 연결
  		// 쿼리 작성
  		connection = DBConnecter.getConnect();
  		String query = "DELETE FROM TBL_MEMBER "
  				+ "WHERE ID = ?";
  		
  		// 쿼리 담고
  		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			System.out.println("이용해주셔서 감사합니다.");
		// 쿼리 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
  		
  		
  	}

  	
}

  	
  	












