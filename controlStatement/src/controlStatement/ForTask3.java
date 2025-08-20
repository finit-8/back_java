package controlStatement;

import java.util.Scanner;

public class ForTask3 {
	public static void main(String[] args) {
		// 1~100까지 7의 배수의 합 구하기
		// 알고리즘: 100까지 반복, i 나누기 7의 나머지가 0 일 때
		int seventh = 0;
		for(int i = 0; i < 100 / 7; i++) {
			seventh += 7 * (i+1);
		}
		System.out.println(seventh);
		System.out.println("==========================");
		
		// a~z까지 출력하는데, aBcDeFgH ... Z로 출력
		// 알고리즘: 2로 나눈 나머지가 1일 때 대문자 변환 or 아스키 소문자-32이용?
		// 			charAt()은 인덱스의 문자형 반환
		Scanner key = new Scanner(System.in);
		String alphabet = key.next(), result = "";
		
		for(int i = 0; i < alphabet.length(); i++) {
			char c = alphabet.charAt(i);
			if(i % 2 == 1) {
				result += Character.toUpperCase(c);
			} else {
				result += Character.toLowerCase(c);
			}
		}
		System.out.println(result);

		
//		for(int i = 0; i < 26; i++) {
//	         System.out.print((char)((i % 2 == 1 ? 65 : 97) + i));
//	      }
	      
	}
}