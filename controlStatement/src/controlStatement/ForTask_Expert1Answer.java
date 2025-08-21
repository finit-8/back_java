package controlStatement;

import java.util.Scanner;

public class ForTask_Expert1Answer {
	public static void main(String[] args) {
//	      expert. 1
//	      해당 문자와 반복할 횟수를 입력하면 전체 문자열을 만들어주는 프로그램
//	      입력 예시) a1b3d2c4
//	      출력 예시) abbbddcccc
//	      단, 횟수는 1~9
	      
//	      for(int i = 0; i < 10; i +=2) {
//	         System.out.println(i);
//	      }
	      
	      
//	      홀수짝수 알고리즘
	      Scanner sc = new Scanner(System.in);
	      String message = "문자와 반복할 횟수를 붙여서 입력하세요.\nex)a1b2",
	            input = null, result = "";
	      
	      System.out.println(message);
	      input = sc.next();
	      
	      for(int i = 0; i < input.length(); i++) {
	         if(i % 2 == 0) {
	            char c = input.charAt(i);
	            int count = input.charAt(i + 1) - 48;
	            
	            for(int j = 0; j < count; j++) {
	               result += c;
	            }
	         }
	      }
	      System.out.println(result);
	      
	
	      for(int i = 0; i < input.length(); i += 2) {
	         char c = input.charAt(i);
	         int count = input.charAt(i + 1) - 48;
	         	// 48을 빼는 이유 : char c가 문자형을 반환하니까, ex) a1b3에서 정수 1 3이 아니라 '1' '3'을 반환해서 '0'의 아스키 48을 빼줘야 정수 1 3이 나옴 
	         for(int j = 0; j < count; j++) {
	            result += c;
	         }
	      }

	      System.out.println(result);
		}
	}
}
