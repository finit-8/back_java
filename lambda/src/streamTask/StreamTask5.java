package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask5 {
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
		
//	 7) 취미가 2개인 사람의 취미들만 모아서 ArrayList로 변경하기
//		ex) [스포츠댄스, 개발, 골프, 야구, 개발 ,놀기]		==> 값이 6개 들어가야됨 (char)
		// 알고리즘: 필터()로 취미 2개만 있는 배열 만들고, 그 중에서 스플릿으로 자르면 새로운 배열 리턴 ==> 스플릿하면 값이 아니라 String배열
													// 그러면 String을 Char로 바꾸기
		// 힌트: 형변환
		String[] hobbies = members
			.stream()
			.filter((member) -> {return member.getHobby().split("_").length == 2;})
			.map((member) -> (member.getHobby()))
			.collect(Collectors.joining("_"))			// 이거를 못했네~~~!!!!! 	joining하면 문자열반환?????
			.split("_");								// 						반환된 문자열을 또 잘라서 값 6개 만들기
		System.out.println(hobbies);
		

		ArrayList<String> hobbiesList = new ArrayList<String>(Arrays.asList(hobbies));
		System.out.println(hobbiesList);
		System.out.println(hobbiesList.size());
		
		List<String> hobbiesList2 = Arrays.stream(hobbies).collect(Collectors.toList());
		System.out.println(hobbiesList2);
		System.out.println(hobbiesList2.size());
	}
}
