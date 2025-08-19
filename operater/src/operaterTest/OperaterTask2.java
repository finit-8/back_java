package operaterTest;

import java.util.Scanner;

public class OperaterTask2 {
	public static void main(String[] args) {
//      3개의 입력값 중 중간값 찾기
//      17 25 35
//      10 3 8
//      sc.next();
//      sc.nextint();
//      입력예시: 10 3 8
//      출력예시: 중간값: 8
		
		// 알고리즘: 대소구분 > ? num1 : num2
		
		Scanner sc = new Scanner(System.in);
		String message = "3개의 숫자를 입력하세요. \n ex) 17 24 35", resultMessage = "중간값: %d";
		int num1 = 0, num2 = 0, num3 = 0, min = 0, max = 0, middle = 0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
//		result1 = num1 > num2 ? num2 : num1;
//		result2 = num1 > num3 ? num3 : num1;		// num2, 3이 더 크면 num1 반환 ==> num1이 제일 작은 수
//		result3 = num2 > num3 ? num2 : num3;		// num2와 3 비교해서 작은 값이 전체 수의 중간값이 됨.
//		System.out.println(result3);
		
	      max = num1 > num2 ? 
	            num1 > num3 ? num1 : num3 : 
	               num2 > num3 ? num2 : num3;
	            
	      min = num1 < num2 ? 
	            num1 < num3 ? 
	                  num1 : num3 : 
	                     num2 < num3 ? num2 : num3;
	      
	      middle = num1 + num2 + num3 - max - min;
	      System.out.printf(resultMessage, middle);
	}
}
