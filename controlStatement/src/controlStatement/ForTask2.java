package controlStatement;

import java.util.Scanner;

public class ForTask2 {
   public static void main(String[] args) {
	   // 10 ~ 1 출력
	   for(int i = 0; i < 10; i++) {
		   System.out.println(10 - i);
	   }
	   
	   System.out.println("==================");
	   
	   // 홍길동 5번째까지 출력
	   for(int i = 0; i < 5; i++) {
		   System.out.println(i + 1 +"번째 홍길동");
	   }
	   
	   System.out.println("==================");
	   
	   // abcd 이용해서 97 98 99 100출력
	   for(int i = 'a'; i < 'e'; i++) {
		   System.out.println(i);
	   }
	   int c = "abcd".charAt(0);
	   for(int i = 0; i < 4; i++) {
		   System.out.println(c + i);
	   }
	   
	   System.out.println("==================");
	   
	   // abcd에서 c 빼고 출력 a b d
	   String cOne = "abcd";
	   char cTwo = "abcd".charAt(2);
	   System.out.println(cTwo);
	   
	   for(int i = 0; i < 3; i++) {
		   char c2 = "abcd".charAt(i == 2 ? i + 1 : i);
		   System.out.println(c2);
	   }
	   	   
	   System.out.println("==================");

	   // 1~30까지 짝수 출력
	   for(int i = 0; i < 30; i++) {
		   if((i + 1) % 2 == 0) { 
			   System.out.println(i + 1);
		   }
	   }
	   
	   System.out.println("==================");
	   
	   // 1~30까지 짝수 개수 출력
	   int count = 0;
	   for(int i = 0; i < 30; i++) {
		   if((i+1) % 2 == 0) {
			  count++;
		   }
	   }
	   System.out.println(count);
	   
	   System.out.println("==================");
	   
	   // 1~30까지 짝수 총합 구하기
	   int evenTotal = 0;
	   for(int i = 0; i < 30; i++) {
		   if((i+1) % 2 == 0) {
			  evenTotal += (i + 1);
		   }
	   }
	   System.out.println(evenTotal);

	   System.out.println("==================");
	   
	   // 1~30까지 짝수 중 7번째 숫자를 출력하기
	   int count2 = 0;
	   for(int i = 0; i < 30; i++) {
		   if((i+1) % 2 == 0) {
			  count2++;
			  if(count2 == 7) {
				  System.out.println(i+1);
				  break;
			  }
		   }
	   }
	   System.out.println("==================");

	   // 1~30까지 짝수 중 첫번째 짝수와 마지막 짝수만 더해서 출력
	   int firstEven = 0, lastEven = 0;
	   for (int i = 0; i < 30; i++) {
		   int value = (i + 1);
		   if(value % 2 == 0) {
			   if(firstEven == 0) {
				   firstEven = value;			// 첫번째 짝수 저장
			   }
//			   if(firstEven > value) {
//				   firstEven = value;			없어도 되는 조건
//			   }
			   if(lastEven < value) {
				   lastEven = value;			// 더 큰 짝수가 나올 때 마다 교체
			   }
		   }
	   }
	   System.out.println(firstEven + lastEven);
   }
}






