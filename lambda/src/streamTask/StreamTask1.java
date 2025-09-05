package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask1 {
   public static void main(String[] args) {
      
//      요구사항
//      모두 stream문법으로 사용한다.
//      for문, while문, if문 불가
      
//      1. 1~10까지 ArrayList에 담고 출력
// 알고리즘: 인티저타입 어레이리스트 객체생성 후 IntStream.range().forEach(() -> {System.out.println(변수.add(매개변수)})로 출력
	   ArrayList<Integer> numbers = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 10).forEach((num) -> {numbers.add(num);});
	   System.out.println(numbers);
	   
	   
	   
	   
//      2. ABCDEF를 각각 문자별로 출력
// 알고리즘: 인트스트림 --> 오브젝트타입 형변환 (mapToObj) 그 다음 collect????
	   // 방법1.
	   IntStream.range('A', 'G')
	   	.mapToObj((value) -> (char)value)
	   	.collect(Collectors.toCollection(ArrayList::new))
	   	.forEach(System.out::print);
	   	
	   System.out.println();
	   
	   // 방법2. 
	   ArrayList<Integer> alphabet = new ArrayList<Integer>();
	   IntStream.rangeClosed('A', 'F').forEach((c) -> {alphabet.add(c);});
	   alphabet.stream().forEach((c) -> {System.out.print((char)c.intValue());});
	   
	   // 방법3.
//	   IntStream.rangeClosed('A', 'F').forEach(n -> System.out.print((char) n));
	   
	   System.out.println();
	   
	   
	   
	   
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
	   ArrayList<Integer> odd = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 100).forEach((n) -> {
		   if(n % 2 == 1) {
			   System.out.print(n);
		   };
	   });
	   
	   System.out.println();
	  
	   
	   
	   
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
	   // 알고리즘: char타입 매개변수로 바로 담기 or IntStream으로 담아서 or filter사용
	   //			순회중 D일때 remove
	   ArrayList<Integer> upperAlpha = new ArrayList<Integer>();
	   IntStream.rangeClosed('A', 'F').forEach((c) -> {upperAlpha.add(c);});
	   upperAlpha.stream().filter((c) -> {return c != 'D';}).forEach((c) -> {System.out.print((char)c.intValue());});
	   																				// ***** 컬렉트로 형변환 해보기 *****
	   System.out.println();

	   
	   
	   	   
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
	   // 알고리즘: toLowerCase();
	   ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
	   colors.stream().forEach((str) -> {System.out.println(str.toLowerCase());});

//		문자열의 인덱스에 접근해서 조건주고, 맞으면 +32, 아니면 그대로 출력 
//	   	.map((c) -> { 
//	   		if(colors. >= 65 && colors.indexOf(c) <= 'Z') {
//		   		return colors += colors.indexOf(c) += 32;
//		   	} else {
//		   		return colors;
//		   	};
//	   	})
//		.forEach(System.out::println);
	   
// 		문자배열 각 문자열의 인덱스에 접근이 안돼서 먼저 char 어레이리스트로 변환 후, char 어레이리스트 순회 중 조건문으로 전부 소문자로 변경
// 		List<Charactor> = new List<Charactor>();
//	   	colors.stream().mapToInt(colors).forEach(System.out::println);
	   
	   
	   
	// 정답 밑에
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
	   // 알고리즘: if (.findFirst ?? 뭐 이런 메서드로 첫번째 캐릭터가 대문자이면) String으로 변환하여 출력 
	   
	   
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
	   // 알고리즘: String타입의 어레이리스트 객체생성, "공칠이삼" 추가
	   //			반복돌려서 그 다음은..... 0부터 9, "공" 부터 "구" 까지 같이 담을 수 있는 자료구조
	   ArrayList<String> str = new ArrayList<String>(Arrays.asList("공칠이삼"));
	   str.stream().map((c) -> {});
	   
	   
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"
      
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
	   // 알고리즘: if (.findFirst ?? 뭐 이런 메서드로 첫번째 캐릭터가 대문자이면) String으로 변환하여 출력 
	   ArrayList<String> fruites = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
//	   fruites.stream().forEach((c) -> {System.out.println(c);});
	   
	   fruites.stream().filter((c) -> {return c.charAt(0) >= 'A' && c.charAt(0) <= 'Z';}).forEach(System.out::println);;
	   
//     7. 한글을 정수로 변경 "공칠이삼" -> 0723
     String hangle = "공일이삼사오육칠팔구";
     String input = "일공이사";
     input.chars().map(hangle::indexOf).forEach(System.out::println);
     
//     8. 정수를 한글로 변경 "0723" -> "공칠이삼"
     String input2 = "0723";
     input2
        .chars().map(c -> c - 48)
        .map(hangle::charAt)
        .mapToObj((c) -> (char)c)
        .forEach(System.out::println);
  }
}


   }
}
