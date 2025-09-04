package streamTest.filterTest;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterTest {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).forEach(System.out::println);
		
//		List<Integer> numbers = IntStream.rangedClosed(1, 10).map(Integer::valueOf).colllect(Collectors.to)
		
		IntStream.rangeClosed(1, 10).filter((n) -> n % 2 == 0).forEach(System.out::println);
		ArrayList<Integer> numbers = IntStream.rangeClosed(1, 10)
		      .filter((n) -> n % 2 == 0)
		      .boxed()
		      .collect(Collectors.toCollection(ArrayList::new));
	}
}


