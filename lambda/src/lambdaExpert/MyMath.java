package lambdaExpert;

import java.util.Scanner;

//   [심화 실습]
//   여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//   
//   입력 예1) 7 + 35 - 9
//   출력 예1) 33
//   
//   입력 예2) -9 + 8 + 10
//   출력 예2) 9
//   
//   * "ABC".split("")은 [공백][A][B][C] 4칸 문자열 배열로 리턴된다.
//      "A,B,C".split(",")은 [공백][A][B][C] 4칸 문자열 배열로 리턴된다.
//      split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
//      구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//      예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//   
//   * 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//   * 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//   * 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//   * 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//   * main메소드에 getOpers를 람다식으로 구현
//   * 첫 번째 정수가 음수일 경우 오류 해결

//	알고리즘:
//	메인메서드에 이미 * 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 객체화(선언) 구조가 짜여져 있으니 
//	메인메서드 선언문 밑에 getOpers를 람다식으로 구현(사용)하고,

//	MyMath클래스 안, public static Calc calculator(String oper) {} 안에 
//	두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 람다로 객체화

//	MyMath클래스에서 * 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)하고, 
//	메인메서드에서 두 정수의 덧셈, 뺄셈을 구해주는 static메서드를 사용

public class MyMath {
   
//   연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현
   public static Calc calculator(String oper) {
	   
	   return null;
   }
   
   public Calc calc = (int num1, int num2) -> {
	   int 	
	   return ;
   }
   
   public static void main(String[] args) {
      
//      사용자가 수식을 입력
	   Scanner sc = new Scanner(System.in);
	   String inputStr = sc.nextLine();
      
//      전체 수식에서 연산자만 분리하는 람다 메서드 구현
      OperCheck operCheck = (String expression) -> {
    	  
      };
      
   }
}
