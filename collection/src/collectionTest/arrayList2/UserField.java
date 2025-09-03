package collectionTest.arrayList2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

public class UserField {
//   DB
   public ArrayList<User> users = DBconnecter.users; 	// ArrayList User클래스타입의 변수 users는 스태틱 변수DBconnecter.users를 저장하여 참조 (객체화 X)
   public static String userId;							// 세션(웹 내에 어떤 페이지에서도 로그인정보를 유지하기 위한 static 전역변수)
   public static String code;
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
      									// ★ 조건문으로 클래스 리턴시 참일 때 클래스 리턴, 거짓일 때는 반드시 null 리턴 (나중엔 return new 클래스명(); 으로 리턴)
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
         if(userInDb.getPassword().equals(user.getPassword())) {	// 유저Db 변수와 login 메서드의 매개변수 user의 값을 비교하여
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
   public void update(User user) {										// 변수명을 update로 해놓고 String password가 아니라 User객체 전체를 받으면 
	   																	// 비밀번호 변경 외에도 다양한 상황에 update 메서드 사용 가능
	   User userInDb = checkId(user.getId());							
	   if(userInDb != null) {
		   userInDb.setPassword(buildSecure(user.getPassword()));		// 이미 사용자가 입력저장한 패스워드 get해와서 유저Db에 set함
	   }
   }
   
   
//      비밀번호 변경(비밀번호 변경한지 30일이 지나서 다시 변경)
	public void update(String newPassword) {				// 해당 페이지는 마이페이지와 달리 비밀번호 변경 화면만 구현되었다고 생각하고 String newPassword만 받음
		User userInDb = checkId(userId);					// 이미 로그인 되어있는 상태에서 변경하는 것이라 static변수 userId를 참조
		if(userInDb != null) {
	    userInDb.setPassword(buildSecure(newPassword));
		}
	}
	   
   
//      인증번호 생성
// 알고리즘 : 랜덤수로 인증번호 생성해서 문자열 반환하는 메서드
   public String randomNum () {
	   String code = "";
	   for(int i = 0; i < 6; i++) {
		   code += (int)(Math.random() * 10);
		   this.code = code;					// this가 없으면 지역변수 code랑 이름 겹쳐서 this를 넣음
		   										// static변수 code에 지역변수 code를 저장하는 이유
		   										// --> 예를 들어, 인증번호 발송 후 입력창으로 화면전환되면 페이지가 바뀐건데
		   										// 	   페이지가 바뀌어도 인증번호가 유지되게 하기 위해 세션에 저장한다.
	   }
	   return code;
   }
   
//      인증번호 전송
// 알고리즘 : api에 사용자가 입력한 메일을 매개변수로 주고, 생성한 인증번호를  
   public void sendEmail(String toMemberEmail) {
	// 메일 인코딩
       final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
       
       //원하는 메일 제목 작성
       String subject = "메일 발송 테스트";
       
       //보낸 이메일 작성
       String fromEmail = "ss03056ss@gmail.com";
       String fromUsername = "박웅규";
       
       String toEmail = toMemberEmail; // 콤마(,)로 여러개 나열
       
       //도메인 사용할 필요 없다
       //앱비밀번호
       final String username = "ss03056ss@gmail.com";         
       final String password = "lkgc yfeh unfs qqnf";
       
       // 랜덤 코드 생성
       this.randomNum();
       
       // 메일에 출력할 텍스트
       String html = null;
       StringBuffer sb = new StringBuffer();
       sb.append("<h3>인증번호 발송</h3>\n");
       sb.append("<h4>[인증번호 6자리]</h4>\n");    
       sb.append("<h4>" + code + "</h4>\n");    
       sb.append("<h4> 테스트 발송이지롱!</h4>\n");    
       html = sb.toString();
       
       // 메일 옵션 설정
       Properties props = new Properties();    
       props.put("mail.smtp.starttls.enable", "true");
       props.put("mail.smtp.host", "smtp.gmail.com");
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.port", "587");
       props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
       props.put("mail.smtp.ssl.protocols", "TLSv1.2");
       
       try {
         // 메일 서버  인증 계정 설정
         Authenticator auth = new Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication() {
             return new PasswordAuthentication(username, password);
           }
         };
         
         // 메일 세션 생성
         Session session = Session.getDefaultInstance(props, auth);
         
         // 메일 송/수신 옵션 설정
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(fromEmail, fromUsername));
         message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
         message.setSubject(subject);
         message.setSentDate(new Date());
         
//         // 메일 콘텐츠 설정
         Multipart mParts = new MimeMultipart();
         MimeBodyPart mTextPart = new MimeBodyPart();
         MimeBodyPart mFilePart = null;
//    
//         // 메일 콘텐츠 - 내용
         mTextPart.setText(html, bodyEncoding, "html");
         mParts.addBodyPart(mTextPart);
//               
//         // 메일 콘텐츠 설정
         message.setContent(mParts);
    
         // 메일 발송
         Transport.send( message );
         System.out.println("인증번호 발송 완료");
         
       } catch ( Exception e ) {
         e.printStackTrace();
       }
   }
   
//      인증번호 확인
// 알고리즘 : 사용자가 입력한 값이 인증번호 전송메서드로 전송한 문자열과 같을 때, 인증완료
//														다를 때, 인증실패
   public boolean checkCode(String inputCode) {
	   return code.equals(inputCode);
   }
   
   
   
   
   
   
   // 메서드 사용
   public static void main(String[] args) {
	   UserField uf = new UserField();
	   
	   // buildSecure 메서드 사용
	   System.out.println(uf.buildSecure("abe아1!"));
	   
	   // changePassword 메서드 사용
//	   DBconnecter.users.add(new User("us01233", "김이박", "qlalfqjsgh", "010-3777-0000"));
//	   uf.changePassword("dkapflzksh11^*");
	   
	   // 인증번호 생성, 전송 메서드 사용
	   uf.randomNum();
	   uf.sendEmail("ss03056@naver.com");
	   
	   // 인증번호 확인 메서드 사용
	   Scanner sc = new Scanner(System.in);
	   String message = "수신 받은 6자리 인증번호를 입력하세요", inputCode = null;
	   int errorCount = 0;
	   
	   do{
		   if(errorCount == 0) {
			   System.out.println(message);
			   inputCode = sc.nextLine().trim();
		   } else if(errorCount > 0 && errorCount < 3) {
			   System.out.println("다시 입력하세요.");
			   inputCode = sc.nextLine().trim().replaceAll(" ", "");		// 문자열 제일 앞뒤 공백 말고도 사이사이 공백제거
		   } else if(errorCount > 3){
			   System.out.println("처음부터 다시 인증해주세요.");
			   break;
		   }
		   errorCount++;
	   }while(!uf.checkCode(inputCode));			// while() : 전송한 코드랑 입력받은 코드가 같지 않는 동안 
	   												// do{} : 해라
	   
	   if(uf.checkCode(inputCode)) {
		   System.out.println("인증완료");
	   } else {
		   System.out.println("인증실패");
	   }
   
   }
}
