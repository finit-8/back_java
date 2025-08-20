package inputTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InputTask1 {
   public static void main(String[] args) {
//     사용자에게 정수를 2개 입력 받고,
//     두 수를 더해서 출력하기
//     30 
//     50
//     출력: 80
//     단, 메서드는 .next()만 사용
	   
      Scanner sc = new Scanner(System.in);
      String message = "정수를 입력하세요.\nex)10 20", 
            resultMessage = "첫 번째 정수: %s\n두 번째 정수: %s\n%d + %d = %d", 
            str1 = null, str2 = null;
      int num1 = 0, num2 = 0, result = 0;
 
      System.out.println(message);
      str1 = sc.next();
      str2 = sc.next();
      
      num1 = Integer.parseInt(str1); 
      num2 = Integer.parseInt(str2); 
      result = num1 + num2;
      
      System.out.printf(resultMessage, str1, str2, num1, num2, result);
      
      
      
      // ArrayList, BufferedReader사용
      try {
			ArrayList<Integer> num = new ArrayList<>();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int first = 0, second = 0;
			
			first = Integer.parseInt(br.readLine());
			second = Integer.parseInt(br.readLine());
			
			num.add(first);
			num.add(second);
	
			System.out.println(num.get(0) + num.get(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
      
   }
}
