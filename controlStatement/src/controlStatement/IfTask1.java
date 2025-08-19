package controlStatement;

import java.util.Scanner;

public class IfTask1 {
   public static void main(String[] args) {
//      if문으로 두 수의 크기 비교
//      입력예시) 10 20
//      출력예시) 큰 값: 20, 작은 값: 10
      
      Scanner sc = new Scanner(System.in);
      String data1 = null, data2 = null, message = "두 정수를 입력하세요.\n10 20",
            result = "", equlaMessage = "두 수가 같습니다", 
            resultMessage = "입력\n첫 번째 정수: %d\n두 번째 정수: %d\n큰 값: %d, 작은 값: %d";
      int num1 = 0, num2 = 0, min = 0, max = 0;
      
      System.out.println(message);
      data1 = sc.next();
      data2 = sc.next();
      num1 = Integer.parseInt(data1);
      num2 = Integer.parseInt(data2);
      
//      ※ 주소를 사용해야 하는 이유
      if(num1 == num2) {
         System.out.println(equlaMessage);
      }else if(num1 > num2) {
         max = num1;
         min = num2;
      }else if(num1 < num2 ) {
         max = num2;
         min = num1;
      }
      
      result = resultMessage;
      System.out.printf(result, num1, num2, min, max);
   }
}







