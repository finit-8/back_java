package streamTest.filterTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterTest {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(1, 10).map((n) -> {if(n % 2 == 0) return n; else return 0;}).forEach(System.out::print);
		
		
		System.out.println();
		
		
		// collect() 사용하여 결과를 다른 타입으로 리턴
		List<Integer> numbers = IntStream.rangeClosed(1, 10).filter((n) -> {return n % 2 == 0;}).mapToObj(Integer::valueOf).collect(Collectors.toList());
		System.out.println(numbers);
		
		

		// collect() 사용하여 결과를 다른 타입으로 리턴
		ArrayList<Integer> numbers2 = IntStream.rangeClosed(1, 10)
		      .filter((n) -> n % 2 == 0)
		      .boxed()
		      .collect(Collectors.toCollection(ArrayList::new));
		System.out.println(numbers2);
	}
}


