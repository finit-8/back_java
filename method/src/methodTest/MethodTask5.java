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
	String judgeAboutValue(String value) {
		String result = "";
		for(int i = 0; i < value.length(); i++) {
			// 방법1. 문자열마다 홀 짝 비교해서 사실상 잘못된 알고리즘
			char c = value.charAt(i);
			if(c > '1' && c < '9') {
		 		// 정수
				result = c % 2 == 1 ? "홀수" : "짝수";
			} else {
				// 문자열
				result = "\'문자열\'입니다.";
				break;
			}
		}
			return result;
	}
	
			
		// 방법2. true/false로 매개변수 값 전체에 대해 결과 확인
//			boolean isInt = false; 
//			for(int i = 0; i < value.length(); i++) {
//				char c = value.charAt(i);
//				if(c > '1' && c < '9') {
//				 	isInt = true;
//				} else {
//				 	isInt = false;
//				 	break;
//				}
//			}
//			
//			if(isInt) {
//				result = Integer.parseInt(value) % 2 == 1 ? "홀수" : "짝수";
//			} else {
//				result = "문자열";
//		}
//		return result;
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
	String printReverseStr (String str2) {
		String reverseStr = "";
		for(int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(str2.length() -1 -i);
										// 4 - 1 - 0		
										// 4 - 1 - 1
										// 4 - 1 - 2
										// 4 - 1 - 3
			reverseStr += c;
		}
		return reverseStr;
	}

	// 5. 1~4번까지 메서드 사용

	
	public static void main(String[] args) {
		MethodTask5 mt = new MethodTask5();
		
		// 1.
		System.out.println(mt.sumNum(10));
		
		// 2.
		System.out.println(mt.judgeAboutValue("19"));
		
		// 3.
		mt.toUpperCase("abcd");
		
		// 4.
		System.out.println(mt.printReverseStr("abcd"));
	}
}

