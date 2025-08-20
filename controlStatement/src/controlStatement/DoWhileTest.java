package controlStatement;

import java.util.Scanner;

public class DoWhileTest {
   public static void main(String[] args) {
      String message = "1.분실 신고\n2.통신사 연결\n3.결제 수단 변경\n0.상담원 연결";
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      
//      System.out.println(message);
//      choice = sc.nextInt();
//      while(choice != 0) {
//         System.out.println(message);
//         choice = sc.nextInt();
//         if(choice == 0) { break; }
//      }
      
      do {									// do: 일단 먼저 해라!
         System.out.println(message);
         choice = sc.nextInt();
      } while(choice != 0);
      
      
   }
}
