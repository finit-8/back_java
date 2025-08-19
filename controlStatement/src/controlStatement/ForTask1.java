package controlStatement;

import java.util.Scanner;

public class ForTask1 {
   public static void main(String[] args) {
//      아래와 같은 문자열이 있을 때
//      문자열은 연결시키고, 숫자는 연산하여 결과를 알려준다
//      사용자가 임의로 정수와 알파벳을 입력할 때
//      "abZ182bePz92"
//      출력 예시) 문자열: abZbePz, 정수: 22
//      .charAt(인덱스)
	   
      Scanner sc = new Scanner(System.in);
      String input = null, str = "", result = "입력값: %s\n문자열: %s, 정수: %d",
            message = "정수와 문자열을 혼합한 글자를 입력하세요.\nex)abZ182bePz92";
      int total = 0;
      System.out.println(message);
      input = sc.next();
       
      for(int i = 0; i < input.length(); i++) {
//         아스키코드
         int c = (int)input.charAt(i);
         if(c >= 48 && c <= 57) {
            total += c - 48;
         }else {
//        	str += c; 		문자들이 아스키로 다 연결됨. 9798909810180122
            str += (char)c;
         }
      }
      
      System.out.printf(result, input, str, total);
   }
}






