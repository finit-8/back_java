package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	
	public boolean isOdd() {
		return n % 2 == 1;
	}
	
	public static int murtupleNumBy10() {
		return n * 10;
	}
	
	public static void main(String[] args) {
		// IntStream으로 시작해서
		// 10, 30, 50, 70, 90만 ArrayList or List에 추가하기
		// n1  n2  n3  n4  n5
		// 
		
		// List에 추가
		List<Integer> data1 = 
		IntStream
			.rangeClosed(1, 10)					// IntStream 반환
			.filter((n) -> n % 2 == 1)			// IntStream 반환
			.map((n) -> n * 10)					// IntStream 반환
//			.forEach(System.out::println);
			.boxed()							// Stream<Integer> 반환
			// 또는 .mapToObj(Integer::valueOf)	// int --> Integer 반환
			.collect(Collectors.toList());		// 컬렉터 --> toList 반환		(List타입 변수에 담으려면 여기까지만 작성)
			
//			.stream()							// toList --> Integer타입의 스트림 반환		(변수 안담고 그냥 바로 출력용)
//			.forEach(System.out::println);		// Integer 출력
		
		
		// ArrayList에 추가 (메서드 호출)
		StreamTask3 st = new StreamTask3();
		ArrayList<Integer> data2 = IntStream
			.rangeClosed(1, 10)
			.filter(st.isOdd)
			.map(st.murtupleNumBy10)
			.mapToObj(Integer::valueOf)
			.collect(Collectors.toCollection(ArrayList::new));
	}
}
