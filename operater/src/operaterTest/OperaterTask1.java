package operaterTest;

import java.util.Scanner;

public class OperaterTask1 {
	public static void main(String[] args) {
//      사용자가 입력한 값이 정수인지 실수인지 확인하여 결과를 출력하시오.
//      단 next() 사용
//      입력 결과) 1.1
//      출력 결과) 실수
		
		// 알고리즘: 정수 실수 구분점을 어떻게?

		
		Scanner sc = new Scanner(System.in);
		String message = "실수 or 정수를 입력하세요. \n ex) 1.7", str = null, integerResult="",
				result = "입력값: %s \n %s입니다.";
		double num1 = 0.0;
		int num2 = 0;

		System.out.println(message);
		str = sc.next();
		num1 = Double.parseDouble(str);
		num2 = (int)num1;
		
		integerResult = num1 - num2 == 0 ? "정수" : "실수";
	
		System.out.printf(result, str, integerResult);
		
	}
}
