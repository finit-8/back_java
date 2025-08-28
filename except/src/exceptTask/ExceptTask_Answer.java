package exceptTask;

import java.util.Scanner;

// 사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직
// 만든 예외를 이용해서 메세지를 출력
public class ExceptTask_Answer {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String message = null, exampleMessage = "사용자에게 전송할 메세지";
      SymbolInter symbolInter = input -> {
         boolean check = false;
         
         String[] symbols = {"!", "@", "#", "*"};
         for(String c: symbols) {
            if(input.contains(c)) {
               check = true;
            }
         }
         return check;
      };
      
      System.out.println(exampleMessage);
      message = sc.nextLine();
      
      try {
         if(symbolInter.checkSymbol(message)) {
            throw new SymbolException("특수문자 쓰지마세요~!");
         }else {
            System.out.println(message);
         }
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
      
   }
}








