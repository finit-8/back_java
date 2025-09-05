package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		numbers.stream().reduce(0, );
		numbers.stream().map((n) -> {return n += numbers.toString().charAt(0);}).forEach(System.out::println);; 
																	↑ 참조형 문법쓰면 인덱스 안넣어도 됨
//		IntStream과 Stream은 전혀 다른 stream이다.
//		IntStream은 정수를 이용한 메서드가 있어서 누적합하는 sum() 같은게 있고
//		Stream은 앞선 ArrayList의 값을 이용한 메서드들이 있는데 연산하는 메서드가 없다.
		// .mapToObj(): IntStream --> Stream<T>
		// .mapToInt(): Stream<T> --> IntStream
		// .mapToBoolean(Boolean::booleanValue): Boolean --> boolean
	
																	
//	 - 1. Arrays.asList() 초기값으로 넣는 방법
  ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
  datas1.stream().mapToInt(Integer::intValue).sum();
  
//		 - 2. IntStream
//		 IntStream
  int total = IntStream
     .rangeClosed(1, 6)
     .map(n -> n * 10)
     .mapToObj(Integer::valueOf)	// == .boxed()
     .collect(Collectors.toCollection(ArrayList::new))
     .stream()
     .mapToInt(Integer::intValue)
     .sum();
  
//		 Stream<T>
//	.mapToObj(): IntStream -> Stream<T>
//	.mapToInt(): Stream<T> -> IntStream
//	.mapToInt(Boolean::booleanValue): Boolean -> boolean
//	.mapToLong(Long::longValue): Long -> long
//	.mapToDouble(Double::doubleValue): Double -> double																	
	}
}
