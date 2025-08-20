package controlStatement;

import java.util.Scanner;

public class ForTask4 {
	public static void main(String[] args) {
//      1. ACEG...Z 출력!
		// 알고리즘: 짝수일 때 출력
		String alphabet = "ABCDEFG"; 
		for(int i = 0; i < alphabet.length(); i++) {
			if(i % 2 == 0) {
				System.out.print(alphabet.charAt(i));
			}
		}
		
//      2. 1 ~ N까지의 합 출력!
		// 알고리즘: 스캐너 입력받고, for문으로 (i+1) 출력
		Scanner key = new Scanner(System.in);
		int num = 0, result1 = 0;
		num = key.nextInt();
		
		for(int i = 0; i < num; i++) {
			result1 += (i+1);					// 1+2+3+4+5 = 15
		}
		System.out.println(result1);
		
		
//      3. 0123401234 출력!
		String result2 = "";
		for(int i = 0; i < 5; i++) {
			result2 += i;		// 문자열에 정수 더해서 문자열로 형변환
		}
		System.out.println(result2 + result2);
		
	}
}