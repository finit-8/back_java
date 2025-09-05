package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamTask4 {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요^^");
	    
		Member[] memberArr = new Member[] {member1, member2, member3, member4, member5, member6, member7};
		members.addAll(Arrays.asList(memberArr));
		
		System.out.println(members);
// 1) 각 Member의 취미를 검토하시오.
		// 그 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 모두 출력
//		for(int i = 0; i < memberArr.length; i++) {			
//			System.out.println(memberArr[i].getHobby().split("개발"));		// 주소가 나옴
//		}
		
		members.stream().filter((member) -> {return member.getHobby().contains("개발");}).forEach(System.out::println);
													// getHobby랑 split은 String이라서 형변환해야됨
													// 라고 생각했는데 푼거보면 형변환 안해도 가능하잖아?????
		
// 2) 각 Member의 취미를 검토하시오.
		// 취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 개발자 OOO으로 변경 후 모두 출력
		members
			.stream()
			.filter((member) -> member.getHobby().contains("개발"))
			.map((member) -> "개발자:" + member.getName() + ", ")
			.forEach(System.out::print);
		
		System.out.println();
		
// 3) 취미를 3개 이상 가진 사람의 id를 출력
		// 배열이었으면 배열길이로 접근했을텐데 지금은 배열이 아니니까 배열로 만들어준다. 
		// split사용해서 배열만들고 배열길이로 접근
		members
			.stream()
			.filter((member) -> {return member.getHobby().split("_").length >= 3;})
			.forEach((member) -> System.out.println("ID: " + member.getId()));
		
// 4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담고 출력
		ArrayList<Long> hobbyIds = members
			.stream()
			.filter((member) -> {return member.getHobby().split("_").length >= 3;})
			.map((member) -> member.getId())		
				// getID의 타입이 Long이니까 컬렉션으로 치환(?)하려면 ↓
			.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(hobbyIds);
		
		System.out.println(members);
		
		
		
		
		
		
		// 정답 밑에
		
// 5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
		// 알고리즘: members에 어떻게 접근하지? index? charAt??
		//			힌트: 한글을 정수로, 정수를 한글로 한 문제랑 똑같다.
		hobbyIds.stream().map(u -> members.get(u.intValue()).getIntroduce()).forEach(u ->System.out.println(u)); 

// 6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
		// 출력 예시
		// 이름: 흰둥이
		// 취미: 개발_축구_농구
		// 소개: 개발도 운동도 다 잘해요!
//		members.stream().forEach((member) -> {System.out.println(member.getIntroduce().length());});
		// ↑ 가장 긴 length: 14
		
//		members.stream().map((member) -> {
//			if(member.getIntroduce().length() == 14) {
//				return members.get(member.toString());
//			}
//		});
		
		
		members
			.stream()
			.map((member) -> { 
				if(members.get(member.getIntroduce()).length() > members.get(member.getIntroduce().length())) {
					return member.getName() + member.getHobby() + member.getIntroduce());
				} //					return member.get
//				}
			});
			
		
		
			
			
			
			
			
		
		
		
//	      5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
//	      hobbyIds
	      hobbyIndexs
	         .stream()
	         .mapToInt(Long::intValue) // Long -> int - IntStream
	         .mapToObj(Integer::valueOf) // int -> Integer - Stream<Integer>
	         .map(i -> members.get(i))
	         .map(u -> u.getIntroduction())
	         .forEach(System.out::println);
	      
//	      6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//	      출력 예시)
//	         이름: 흰둥이
//	         취미: 개발_축구_농구
//	         소개: 개발도 운동도 다 잘해요!
	      Member member = members
	         .stream()
	         .max(Comparator.comparingInt(m -> m.getIntroduction().length()))
	         .get();
	         
	      StreamTask4 st4 = new StreamTask4();
	      st4.introduce(member);
	      
	      
//	      최대 길이      
	      for(Member m : members) {
	         int length = m.getIntroduction().length(); 
	         if(maxLength < m.getIntroduction().length()) {
	            maxLength = length;
	         }
	      }
	      
	      MaxLength maxClass = new MaxLength();
	      for(Member m : members) {
	         int length = m.getIntroduction().length(); 
	         if( maxClass.getSize() < m.getIntroduction().length()) {
	            maxClass.setSize(length);
	         }
	      }
	      
//	      filter로 걸러낸다
	      members
	         .stream()
	         .filter(m -> m.getIntroduction().length() == maxClass.getSize())
	         .forEach(st4::introduce);
		
	}	
}
