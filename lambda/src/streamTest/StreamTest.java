package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	
	static public void getOdd(Integer n) {
		if(n % 2 != 0) {
			System.out.print(n);
		}
	}
	
	public static void main(String[] args) {
		// 0~9
		ArrayList<Integer> datas = new ArrayList<Integer>();
		// IntStream
		// .range(시작, 끝) : 마지막 포함x
		// .rangeClosed(시작, 끝) : 마지막 포함
		IntStream.range(0, 10).forEach((n) -> {
			datas.add(n);
		});
		System.out.println(datas);

		
		
		// 1~5까지 스트림 문법으로 출력하기
//		IntStream.rangeClosed(0, 5).forEach((n) -> {System.out.println(n);});
		
		// 1~5까지 참조형 문법으로 출력하기
		// forEach(소속::메서드명)
//		IntStream.rangeClosed(0, 5).forEach(System.out::println);
		
		
		
		// datas 짝수만 출력하기
		datas.stream().forEach((n) -> {
			if(n % 2 == 0) {
				System.out.print(n); 
			}
		});
		
		System.out.println();
		
		// datas 홀수만 출력하기 - filter사용
//		datas.stream().filter((n) -> {		// stream이 반환되어야 하는데.
//			if(n % 2 == 1) {
//				return n;
//			};
//		});
		
		// datas 홀수만 출력하기 - 참조형 문법 사용
		datas.forEach(StreamTest::getOdd);		// getOdd메서드의 integer n을 datas의 레인지 동안 반복
	
		System.out.println();
		
//		.stream(): 컬렉션을 Stream 객체로 변경
//		.chars(): 문자열을 Stream 객체로 변경
		"ABCD".chars().forEach((c) -> {
			System.out.print((char)c);		
		});
	}
}
