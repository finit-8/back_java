package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
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
		
		// 참조형 문법
		// 소속::메서드명
//		IntStream.rangeClosed(0, 5).forEach(System.out::println);
		
		// datas 짝수만 출력하기
		datas.stream().forEach((n) -> {
			if(n % 2 == 0) {
				System.out.println(n); 
			}
		});
		
		// datas 홀수만 출력하기
//		datas.stream().filter((n) -> {		// stream이 반환되어야 하는데.
//			if(n % 2 == 1) {
//				return n;
//			};
//		});
		
		public 
		datas.forEach(StreamTest :: getOdd);
		
		
		
	}
}
