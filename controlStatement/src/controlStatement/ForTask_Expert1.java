package controlStatement;

import java.util.Scanner;

public class ForTask_Expert1 {
	public static void main(String[] args) {
		// 해당문자와 반복할 횟수를 입력하면 전체 문자열을 만들어주는 프로그램
		// 입력 예시) a1b3d2c4
		// 출력 예시) abbbddcccc
		// 단, 횟수는 9이고, 숫자0은 입력하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		String message = "문자와 반복횟수를 입력하세요 \n ex)a1b3d2c4", input = "", repeatResult = "";
		
		System.out.println(message);
		input = sc.next();
		
		for(int i = 0; i < input.length(); i++) {
			if(i % 2 == 0) {
				char c = input.charAt(i);
				int count = input.charAt(i+1) - 48;		// 문자마다 반복횟수(아스키 값) - 48('0'의 아스키 값)으로 정수로 변환
				for(int j = 0; j < count; j++) {		
					repeatResult += c;						// 문자마다 반복횟수만큼 반복하는 동안, 결과에 문자를 담는다. 
				}
			}
		}
		System.out.println(repeatResult);
		
		repeatResult = "";
		String result = "";
		for(int i = 0; i < input.length(); i += 2) {
	         char c = input.charAt(i);
	         int count = input.charAt(i + 1) - 48;
	         	// 48을 빼는 이유 : char c가 문자형을 반환하니까, ex) a1b3에서 정수 1 3이 아니라 '1' '3'을 반환해서 '0'의 아스키 48을 빼줘야 정수 1 3이 나옴 
	         for(int j = 0; j < count; j++) {
	            repeatResult += c;
	         }
	      }
		result += repeatResult;
		System.out.println(result);
	}
}
