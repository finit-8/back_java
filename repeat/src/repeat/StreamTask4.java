package repeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
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
		
// 2) 각 Member의 취미를 검토하시오.
		// 취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 개발자 OOO으로 변경 후 모두 출력
		
// 3) 취미를 3개 이상 가진 사람의 id를 출력
		// 힌트: 배열이었으면 배열길이로 접근했을텐데 지금은 배열이 아니니까 새배열로 만들어준다. 
		
// 5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기

// 6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
		// 출력 예시
		// 이름: 흰둥이
		// 취미: 개발_축구_농구
		// 소개: 개발도 운동도 다 잘해요!

	}	
}
