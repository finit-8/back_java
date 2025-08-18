package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		String str1 = null, str2 = null, str3 = null, mesagge = "세개의 수를 입력해주세요. \n 예) 1 3 5";
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		System.out.println(mesagge);
		
		str1 = key.next();
		str2 = key.next();
		str3 = key.next();
		key.close(); // 자원낭비 ㄴㄴ
		
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		num3 = Integer.parseInt(str3);
		
		result = num1 * num2 * num3;
		
		System.out.println(result);
	}
}
