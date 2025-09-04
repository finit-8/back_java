package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
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
	   
	   
//	   ArrayList<Integer> alphabet = new ArrayList<Integer>();
//	   IntStream.rangeClosed('A', 'F').forEach((c) -> {alphabet.add(c);});
//	   Character newAlphabet = alphabet.stream().forEach((c) -> {});
	   
	   // 그냥 String 타입 어레이리스트에 ABCDEF담아서
	   ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
	   alphabet.stream().forEach((c) -> {System.out.println(alphabet);});
	   
//      3. 1~100까지 중 홀수만 ArrayList에 담고 출력
	   
	  
//      4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
	   
	   
	   
	   
	   
	   ㅇㅇㅇㅇㅇㅇㅇㅇ
//      5. 5개의 문자열을 모두 소문자로 변경 후 출력
//      "Black", "WHITE", "reD", "yeLLow", "PInk"
	   
//      6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
	   
//      7. 한글을 정수로 변경 "공칠이삼" -> 0723
	   
//      8. 정수를 한글로 변경 0723 -> "공칠이삼"
      
   }
}
