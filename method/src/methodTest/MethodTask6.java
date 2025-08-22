package methodTest;

import java.util.Scanner;

public class MethodTask6 {
	// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드 선언 및 사용
	// 알고리즘: 스캐너로 스트링 받고
	//			문자의 개수를 담을 변수 count 선언
	//			입력된 값들 중 (for문) 원하는 문자를 찾는다.
	
								// 위 알고리즘으로 푼 것
	void getCount(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			str
		}
	}
	
	

	//.replace(문자열, 대체할 문자열)
	//.replaceAll(문자열, 대체할 문자열)
	
	int getCount(String value, char c) {
	 return value.length() - value.replaceAll(String.valueOf(c), "").length();
	}	// 		총길이 9		- "abcdeaaaa"에서 모든 a를 빈문자열로 바꾸고난 후의 문자열 길이 4 
	// ==> 전체길이 - a 이외의 문자 = a만 남음
	
	public static void main(String[] args) {
	 MethodTask6 mt = new MethodTask6();
	 int count = 0 ;
	 count = mt.getCount("abcdeaaaa", 'a');
	 System.out.println(count);
	}
}

