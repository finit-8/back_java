package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ForEachTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		
		// 1~10 추가
		IntStream.rangeClosed(1, 10).forEach((n) -> {datas1.add(n);});
		System.out.println(datas1);
		
		// stream으로 1~5삭제
//		IntStream.range(0, 5).forEach((n) -> {datas1.remove(0);});
//		System.out.println(datas1);
		
		// 참조할 수 없는 알고리즘(인덱스가 계속 밀리기 때문)
//		IntStream.range(0, 5).forEach(datas1::remove);
		
//		datas1.stream().map(() -> {datas1.remove(0);});

		
		
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		// 10~6추가
		IntStream.range(0, 5).forEach((n) -> {datas2.add(10 - n);});
		System.out.println(datas2);
		
		
		
		ArrayList<String> datas3 = new ArrayList<String>();
		// "A~K" 추가
//		IntStream.rangeClosed('A', 'K').forEach((n) -> {System.out.println(n);});
		IntStream.rangeClosed('A', 'K').forEach((n) -> {datas3.add(String.valueOf((char)n));});
		datas3.stream().forEach(System.out::print);
//		System.out.println(datas3);

//		"ABCDEFGHIJK".chars().forEach((n) -> {datas3.add(String.valueOf((char)n));});
//		datas3.forEach(System.out::print);
		
		ArrayList<Integer> datas33 = new ArrayList<Integer>();
		IntStream.rangeClosed('A', 'K').forEach(datas33::add);
//		datas33.forEach(System.out::print);			// data33은 Integer타입의 ArrayList라서 forEach에 들어오는 타입은 Integer타입
		datas33.forEach((n) -> System.out.print((char)n.intValue()));	// n은 Integer는 클래스형이라 char기본자료형으로 변경불가하여 n의 intValue를 char로 변경
		
		
		
		
		ArrayList<String> datas4 = new ArrayList<String>();
		// "aBcDeFgHiJk" 소문자만 추가
		"aBcDeFgHiJk".chars().forEach((n) -> {
			if(n >= 'a' && n <= 'k') {
				datas4.add(String.valueOf((char)n));
			}
		});
		System.out.println(datas4);
		
		
		
		ArrayList<String> datas5 = new ArrayList<String>();
		// "aBcDeFgHiJk" 모두 대문자로 변경 후 추가
		"aBcDeFgHiJk".chars().forEach((n) -> {
			if(n >= 'a' && n <= 'k') {
				n -= 32;
			}
			datas5.add(String.valueOf((char)n));
		});
		System.out.println(datas5);

	}
}
