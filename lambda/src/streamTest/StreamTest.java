package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		
		
//		.sorted() : 정렬하는 메서드
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4 ,8));
//		numbers.stream().sorted().forEach(System.out::print);							// 1 4 6 8 10
//		System.out.println();
//		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);	// 10 8 6 4 1
		
		
		
		
		
//		.collect() : '결과를 다양한 타입으로 리턴'하는 메서드로,
//					1. 클래스타입 및 컬렉션자료형 간의 전환시에는 자유롭게 사용가능
<<<<<<< HEAD
//					2. 기본자료형stream --> 급이 높은 자료형 전환시에는 .boxed()필요하고
=======
//					2. 기본자료형stream --> 급이 높은 자료형 전환시에는 .mapToObj나 .boxed()필요하고
>>>>>>> branch2
//					   급이 높은 자료형 --> 기본자료형stream 전환시에는 별도의 메서드 사용한다. (ex .mapToInt)
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4 ,8));
		
		// 방법1.
		List<Integer> newList = numbers2.stream().map((n) -> n * 10).collect(Collectors.toList());
		System.out.println(newList);
		
		// 방법2.
//		ArrayList<Integer> newArrayList = numbers2.stream().map((n) -> n * 10).collect(Collectors.toList()); 
			// ↑ Collectors.toList()는 반환타입이 List<Integer>인데, 실제 객체 타입은 ArrayList<Integer>임
			// 따라서 List는 ArrayList의 상위 인터페이스라서 ArrayList 변수에 바로 대입 불가하다.
		
		// 이렇게 ↓ 객체생성하면서 매개변수로 collect메서드를 사용해서 List 인터페이스를 줘야 형변환 됨.
		ArrayList<Integer> newArrayList1 = new ArrayList<Integer>(numbers2.stream().map((n) -> n * 10).collect(Collectors.toList()));
		System.out.println(newArrayList1);
		ArrayList<Integer> newArrayList2 = numbers2.stream().map((n) -> n * 10).collect(Collectors.toCollection(ArrayList::new));		
		System.out.println(newArrayList2);
				
		// 방법3. 문자열로 결과 타입을 변경
		String newString = numbers2.stream().map((n) -> n * 10).map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(newList);
		System.out.println(newArrayList1);
		System.out.println(newArrayList2);
	}
}
