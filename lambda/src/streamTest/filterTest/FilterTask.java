package streamTest.filterTest;

import java.util.ArrayList;
import java.util.Comparator;

import streamTest.mapTest.User;

public class FilterTask {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>(); 
	      
	      User user1 = new User(1L, "홍길동", 17, "개발자");
	      User user2 = new User(2L, "장보고", 20, "기획자");
	      User user3 = new User(3L, "이순신", 35, "디자이너");
	      User user4 = new User(4L, "이성계", 42, "개발자");
	      User user5 = new User(5L, "이태희", 22, "사장");
	      
	      users.add(user1);
	      users.add(user2);
	      users.add(user3);
	      users.add(user4);
	      users.add(user5);
	      
	      // 1. 나이가 20살 이하인 사용자들만 출력
//	      users.stream().filter((user) -> user.getAge() <= 20).forEach(System.out::println);
	      
	      // 2. 이씨 성을 가진 사용자들만 출력
//	      users.stream().filter((user) -> user.getName().charAt(0) == '이').forEach(System.out::println);
	      users.stream().filter((user) -> String.valueOf(user.getName().charAt(0)).equals("이")).forEach(System.out::println);
//	      users.stream().filter((user) -> user.getName().startsWith("이")).forEach(System.out::println);
	      
	      // 3. 직업 중 "자"로 끝나는 유저를 출력
	      users.stream()
	      		.filter((user) -> user.getJob()
	    		.endsWith("자"))
	      		.forEach(System.out::println);
	      
//	      클래스 정렬 (DB언어의 처리방식이 훨씬 빠른데 굳이굳이 정렬 해야할 때)
	      users.stream()
	      .filter((user) -> user.getJob().endsWith("자"))
	      .sorted(Comparator.comparing(User::getId).reversed())
	      .forEach(System.out::println);
	      
	}
}
