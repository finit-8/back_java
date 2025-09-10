package repeat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayTask3 {
   public static void main(String[] args) {
//      1. 1~20까지 짝수만 배열에 담고 배열 안에 값에 모두 3을 더한 값으로 변경 후 출력하기
	   List<Integer> evenPlusThreeResult = IntStream.range(1, 21).filter((e) -> e % 2 == 0).mapToObj((e) -> Integer.valueOf(e + 3)).collect(Collectors.toList());
	   evenPlusThreeResult.forEach(System.out::println);
	   
//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
	   
//	   // 방법1. 평균 구하는 메서드 average()
	   OptionalDouble avgResult = IntStream.range(1, 6).map((n) -> n * 10).average();
	   avgResult.ifPresent(System.out::println);
	   
	   // 방법2. 인덱스 순회해서 다 더함
	   int reduce = IntStream.rangeClosed(1, 5).map((n) -> n * 10).sum();
	   ArrayList<Integer> numArr = IntStream.rangeClosed(1, 5).map((n) -> n * 10).mapToObj((n) -> Integer.valueOf(n)).collect(Collectors.toCollection(ArrayList::new));
	   int avg = reduce / numArr.size();
	   System.out.println(avg);
	   
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
	   ArrayList<Integer> res = IntStream
	   	.rangeClosed(1, 10)
	   	.map((n) -> {if(n > 5) {
	   		return n * 2;
	   	} else {
	   		return n;
	   	}}).mapToObj((n) -> Integer.valueOf(n)).collect(Collectors.toCollection(ArrayList::new));
	   res.stream().forEach(System.out::println);
	   	
	   
	   
	   
	   System.out.println("4번문제");
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//      단 마지막은 *이 붙지 않는다
	   String[] arr = new String[10];
	   for(int i = 0; i < arr.length; i++) {
		   arr[i] = i + 1 + "*";
		   if(i + 1 == 10) {
			   arr[i] = String.valueOf(i + 1);
		   }
		   System.out.print(arr[i]);
	   }
	   System.out.println();
	   
	   String result = IntStream.rangeClosed(1, 10)
			.mapToObj((e) -> String.valueOf(e))
			.collect(Collectors.joining("*"));
	   System.out.println(result);
	   
	   ArrayList<String> addStar = 
			   IntStream
			   .rangeClosed(1, 10)
			   .mapToObj(String::valueOf)
			   .map((e) -> e + "*")
			   .collect(Collectors.toCollection(ArrayList::new));
	   System.out.println(addStar);
	  
	   int lastIndex = addStar.size() -1;		// 9 --> 인덱스는 0부터 시작하기에 마지막 인덱스 9를 활용해 10*에 접근
	   String last = addStar.get(lastIndex);	// 10*
	   addStar.set(lastIndex, last.replace("*", ""));
	   addStar.forEach(System.out::println);
	   
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기 
	   // 방법 1.
	   int threeValue = 
			   IntStream
			   .range(1, 11)
			   .map((e) -> e)
			   .filter((e) -> e % 3 == 0)
			   .sum();
	   System.out.println(threeValue);
			   
	   // 방법 2.
	   ArrayList<Integer> threeSixNine = 
		   IntStream
		   .range(1, 11)
		   .map((e) -> e)
		   .filter((e) -> e % 3 == 0)
		   .mapToObj(Integer::valueOf)
		   .collect(Collectors.toCollection(() -> new ArrayList<>()));
	   int plusThreeSixNine = 0;
	   for(int i = 0; i < threeSixNine.size(); i++) {
		   plusThreeSixNine += threeSixNine.get(i);
	   }
	   System.out.println(plusThreeSixNine);
	   
	   // 방법 3.
	   Optional<Integer> reduceNum = 
			   IntStream
			   .range(1, 11)
			   .map((e) -> e)
			   .filter((e) -> e % 3 == 0)
			   .mapToObj(Integer::valueOf)
			   .reduce((x, y) -> x + y);
	   System.out.println(reduceNum);
	   reduceNum.ifPresent(System.out::println);
	   
   }
}
