package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
//		checkID메서드
		memberVO.setMemberEmail("ss03056");
		memberVO.setMemberPassword("1234");
		
//		join메서드
		memberVO.setMemberEmail("hong1234");
		memberVO.setMemberPassword("1234");
		memberVO.setMemberName("홍길동");
		memberVO.setMemberAge(15);
		memberVO.setMemberAddress("서울시 강남구");
		
		if(memberDAO.checkId(memberVO.getMemberEmail())) {
			System.out.println("사용이 가능한 아이디");
			memberDAO.join(memberVO);
		} else {
			System.out.println("중복된 아이디");
		}
		
//		login메서드
		memberVO.setMemberEmail("ss03056");
		memberVO.setMemberPassword("1234");
		if(memberDAO.login(memberVO)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
