package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
		//		IntStream과 Stream은 전혀 다른 stream이다.
//		IntStream은 정수를 이용한 메서드가 있어서 누적합하는 sum() 같은게 있고
//		Stream은 앞선 ArrayList의 값을 이용한 메서드들이 있는데 연산하는 메서드가 없다.
// .mapToObj(): IntStream --> Stream<T>
// .mapToInt(): Stream<T> --> IntStream
// .mapToBoolean(Boolean::booleanValue): Boolean --> boolean
		
		
//      1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}	==> 210
	 // 방법1. Arrays.asList() 초기값으로 넣는 방법
		 ArrayList<Integer> datas1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		 int total = datas1.stream().mapToInt(Integer::intValue).sum();
		 System.out.println(total);
		 
	 // 방법2. reduce() 사용
		 Optional<Integer> result = datas1.stream().reduce((x, y) -> x + y);
//		 System.out.println(result);			// Optional[210]
		 result.ifPresent(System.out::println);	// 210
		 
 	 // 방법3. IntStream 초기값으로 넣는 방법 (일부러 형변환 많이 시도해보기)
		 int total2 = IntStream.range(1, 7).map(n -> n * 10).sum();
		 System.out.println(total2);
		 
	}
}
		
		
		
		
		
		
		
		
		
		

//  
////		 - 2. IntStream
////		 IntStream
//  int total = IntStream
//     .rangeClosed(1, 6)
//     .map(n -> n * 10)
//     .mapToObj(Integer::valueOf)	// == .boxed()
//     .collect(Collectors.toCollection(ArrayList::new))
//     .stream()
//     .mapToInt(Integer::intValue)
//     .sum();
//  
//	}
//}
