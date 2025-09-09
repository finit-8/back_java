package optinalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptinalTest {
	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("박웅규", "pwg", "1234"),
			new User("홍길동", "hgd", "1234"),
			new User("이순신", "lss", "1234"),
			new User("장보고", "jbg", "1234")
		));
	// for if문에 한 번이라도 들어가지 않았다면 null이 리턴되어 NPE발생
	// ※강조: 반드시 리턴타입에만 Optinal을 사용하고, "단일 객체"만 감싼다.
	// 나쁜 예) Optinal<List<User>> --> 복수 객체
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInDb: users) {
			if(userInDb.getId() == id) {
//				System.out.println(userInDb);
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptinalTest optinalTest = new OptinalTest();
		
//		Optional<User> user = optinalTest.findById(200L);
//		System.out.println(user.getUserName());
//		if(user != null) {
//		}
		
		// 실무에서 가장 많이 쓰이는 null처리
		// user가 null이 아니면 통째로가 user
		// null이면 throw
		// ↓ 값이 있을 땐 Else, 없을 땐 throw처리하는 메서드라 throw만 정의해주면 됨(어떤 예외인지 내가 클래스 만들어줘야됨)
		Optional<User> founduser = optinalTest.findById(200L);
		User user;
		try {
			user = founduser.orElseThrow(() -> {
				throw new NoSearchUserException("유저를 찾을 수 없습니다.");
			});
			System.out.println(user);
		} catch (NoSearchUserException e) {
			System.out.println("유저를 찾을 수 없습니다.");
		}
		
		// boolean
		System.out.println(founduser.map(User::getId).isPresent());
		
		User user1 = null;
		if(founduser.isPresent()) {
			user1 = founduser.get();
		}
		
		// 값이 있을 때에만 해당 로직을 수행
		optinalTest.findById(100L).map(User::getUserEmail).ifPresent((email) -> System.out.println(email));
		
		optinalTest
			.findById(100L)
			.map(User::getUserEmail)
			.ifPresentOrElse((email) -> {
				System.out.println(email);
			}, () -> {
			System.out.println("존재하지 않는 유저");
			});
	}
}