package controlStatement;

import java.util.Scanner;

public class WhileTest {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String message = "MBTI를 입력하세요.\nex)ENFP \n 종료를 원하시면 EXIT 를 입력하세요", mbti = null;
      
      while(true) {
	      System.out.println(message);
	      mbti = sc.next();
	      
	      if(mbti.equals("EXIT")) { 
	    	  System.out.println("종료되었습니다.");
	    	  break;
	      }
	      
	      switch(mbti) {
	      case "ENFP":
	         System.out.println("게으름 노답!");
	         break;
	      case "ISTP":
	         System.out.println("반항가 기질!");
	         break;
	      case "ESFP":
	         System.out.println("고집이 세다!");
	         break;
	      case "ESTJ":
	         System.out.println("설명충!");
	         break;
	      default:
	         break;
	      }
      }
   }
}
