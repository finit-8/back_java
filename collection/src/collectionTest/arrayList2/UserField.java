package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
//   DB
   public ArrayList<User> users = DBconnecter.users; 	// ArrayList<User>타입의 변수 users에 스태틱 변수DBconnecter.users를 저장하여 참조 (객체화 X)
   public static String userId;							// 세션(웹 내에 어떤 페이지에서도 로그인정보를 유지하기 위한 static 전역변수)
   final int KEY = 100;									// 사용자 암호화 위한 상수
   
//      아이디 검사
   public User checkId(String id) {
//      id를 받아서 db에 아이디가 있는지 아닌지를 검사한다.
      for(User user: users) {
         if(user.getId().equals(id)) {	// users 순회 중 하나의 user가 매개변수로 받은 id와 같을 때
            return user;				// true를 return하면 아이디검사, 회원가입, 로그인 뭐 할 때 마다 검사해야돼서 
										// user 데이터 전체를 조기리턴해서 필요한 때에 checkId 메서드 사용
         }
      }
      return null;						// 값이 같지 않으면 null 리턴
      
   }
   
//      회원 가입
   public void join(User user) { 			 // 외부에서 받은 User클래스타입의 user객체데이터를
      User userInDb = checkId(user.getId()); // checkId 메서드로 검사해서 User클래스타입의 유저Db 변수에 저장
      if(userInDb == null) {				 // checkId 메서드로 검사한 결과 null인 경우(유저Db 변수에 같은 값이 없어서 null 반환한 경우)라면 
         users.add(user);					 // User클래스 타입의 어레이리스트 users(즉, user 목록)에 join 메서드의 매개변수 user 추가
      }
      
   }
   
//      로그인
   public boolean login(User user) {		 						// 외부에서 받은 User클래스타입의 user객체데이터를
      User userInDb = checkId(user.getId()); 						// checkId 메서드로 검사해서 User클래스타입의 유저Db 변수에 저장
      if(userInDb != null) {				 						// checkId 메서드로 검사한 결과 null이 아닌 경우(유저Db 변수에 같은 값이 있는 경우)라면
         if(userInDb.getPassword().equals(user.getPassword())) {	// 유저Db 변수와 login 메서드의 의 매개변수 user의 값을 비교하여
            userId = userInDb.getId();								// - true면 static 전역변수에 해당 아이디를 등록한다. (웹 내에 어떤 페이지에서도 로그인정보를 유지하기 위함)
            return true;											// - 로그인 상태 true로 조기반환
         }
      }
      return false;													// - false면 로그인 상태 false로 login 메서드 반환
   }
   
//      로그아웃
   public void logout() {											
      userId = null;												// static 전역변수를 null값으로 전환 끝.
   }
   
//      암호화
// 알고리즘 : 패스워드 받으면, 캐릭터로 바꿔 아스키로 전환(아스키 범위를 넘어서는 값을 곱해주면 암호화 됨.)
   public String buildSecure(String password) {
	   String resultOfBuiildSecure = "";
	   for(char c : password.toCharArray()) {
//		   System.out.println(c * KEY);
		   resultOfBuiildSecure += (char)(c * KEY);						// 암호화한 문자열 비밀번호는 값이 변하면 안되기에 상수KEY를 곱함
	   }
	   return resultOfBuiildSecure;
   }
   
//      비밀번호 변경(마이페이지)
// 알고리즘 : for문으로 특정 인덱스 비밀번호 get해서 set / 바로 변경하면 또 예외뜨나?
   public String changePassword(String password) {
	   String resultOfChangePassword = "";
	   for(User user : users) {
		  user.setPassword(password);
		  resultOfChangePassword = user.getPassword();
	   }
	   return resultOfChangePassword;
   }
   
//      비밀번호 변경(비밀번호 변경 30일)
// 알고리즘 : 
   
//      인증번호 생성
// 알고리즘 : 랜덤수로 인증번호 생성해서 문자열 반환하는 메서드
   
//      인증번호 전송
// 알고리즘 : 매개변수로 인증번호 생성 메서드로 생성한 문자열 받고
// 			for문으로 ArrayList<User>타입의 users 순회
//			조건문으로 user.getPhone일 때 인증번호 전송하는 메서드 선언
   
//      인증번호 확인
// 알고리즘 : 사용자가 입력한 값이 인증번호 전송메서드로 전송한 문자열과 같을 때, 인증완료
//														다를 때, 인증실패
   
   public static void main(String[] args) {
	   UserField user = new UserField();
	   
	   // buildSecure 메서드 사용
	   System.out.println(user.buildSecure("abe아1!"));
	   
	   // changePassword 메서드 사용
	   DBconnecter.users.add(new User("us01233", "김이박", "qlalfqjsgh", "010-3777-0000"));
	   System.out.println(user.changePassword("dkapflzksh11^*"));
   }
}
