package methodTest;

import java.util.Scanner;

public class MethodTask5 {
	// 1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
	int sumNum (int num) {
		int numHop = 0;
		for(int i = 0; i < num; i++) {
			numHop += (i+1);
		}
		return numHop;
	}
	
	// 2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
//	String judgeAboutValue(String value) {
//		for(int i = 0; i < value.length(); i++) {
//			if(value.charAt(i) % 2 == 1) {
//			 	value = "홀수";
//			} else if(value.charAt(i) % 2 == 0) {
//			 	value = "짝수";
//			} else {
//			 	value = "문자열";
//			 	break;
//			}
//			
//		}
//		return value;
//	}
	
	// 3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
	void toUpperCase (String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z') {
				c -= 32;
				result = String.valueOf(c);
				System.out.print(result);
			}
		}
	}
	
	// 4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
	// 입력 예시) abcdef
	// 출력 예시) fedcba
	// 알고리즘: 역순으로 변수에 담기...
	void printReverseStr (String str2) {
		String reverseStr = "";
		for(int i = 0; i < str2.length(); i++) {
			reverseStr += String.valueOf((Integer.parseInt)str2[i] - i);
														// str2[i](캐릭터) - i(정수) = 정수
		}
		System.out.println(reverseStr);
	}
	
	// 5. 1~4번까지 메서드 사용

	
	
		
	public static void main(String[] args) {
		MethodTask5 mt = new MethodTask5();
		
		// 1.
		System.out.println(mt.sumNum(10));
		
		// 2.
//		mt.judgeAboutValue("20");
		
		// 3.
		mt.toUpperCase("abcd");
		
		// 4.
//		mt.printReverseStr("abcd");
	}
}
