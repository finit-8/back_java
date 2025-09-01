package lambdaExpert;

import java.util.Arrays;
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
//   
//   * 첫 번째 정수가 음수일 경우 오류 해결

// 알고리즘:
//	메인메서드에 이미 * 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 객체화(선언) 구조가 짜여져 있으니 
//  메인메서드 선언문 밑에 getOpers를 람다식으로 구현(사용)하고,

//	MyMath클래스 안, public static Calc calculator(String oper) {} 안에 
//  두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 람다로 객체화

//	MyMath클래스에서 * 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)하고, 
//	메인메서드에서 두 정수의 덧셈, 뺄셈을 구해주는 static메서드를 사용

public class MyMath {
   
//   연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현									// 순서3
   public static Calc calculator(String oper) {
	   if(oper.equals("+")) return (num1, num2) -> num1 + num2;
	   if(oper.equals("-")) return (num1, num2) -> num1 - num2;
	   return null;
   }
   
//	연산자만 들어있는 배열이 필요할 것 같아 만든 메서드 (메인에서 만든 후 분리 됨)					// 순서5
   public static String[] getOperArr(String expression) {
	   String[] result = null, tmp = null;
	   int arrsize = 0;
	   
	   tmp = expression.split("");
	   
	   for(int i = 0; i < tmp.length; i++) {
		   if(!(tmp[i].charAt(0) >= '0' && tmp[i].charAt(0) <= '9')) {				// 문자열 배열마다 접근해서 첫번째 인덱스가 숫자가 아닌 경우. 즉, 연산자일 때만 
			   arrsize++;															// 배열크기 증감하여
		   }
	   }
	   
	   result = new String[arrsize];												// 연산자만 들어있는 문자열 배열 변수의 크기로 사용 
	   
	   for(int i = 0; i < tmp.length; i++) {
		   if(tmp[i].equals("-") || tmp[i].equals("+")) {							// 근데사용자가 정상입력한다는 전제가 있으니까 
			   for(int j = 0; j < result.length; j++) {								// 위에 코드에서 arrsize++ 하지 않고, 
				   if(result[j] == null) {											// 바로 result에 값을 넣어서 반환해도 되지 ?????
					   result[j] = tmp[i];
					   break;
				   }
			   }
		   }
	   }
	   return result;
   }
   
   
   
   public static void main(String[] args) {
//      사용자가 수식을 입력									// 순서1
      Scanner sc = new Scanner(System.in);
      String inputString = null;
      String[] nonOpperArr = null, operArr = null;
      int preData = 0, result = 0;
	   
//	   * 전체 식을 전달 받은 후 연산자만 분리하여 String[]로 리턴하는 추상메서드 getOpers를 람다로 객체화			// 순서2
//	  구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//    예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
      OperCheck operCheck = (String expression) -> {
    		  String[] strResult = null, tmp = null;
    		  tmp = expression.split("\\+ | \\-");	// 연산자 제외한 문자열 배열
    		  strResult = new String[tmp.length -1];	// 결과 배열 길이만 초기화
    		  
//    	처음 수가 음수인 경우와 아닌 경우로 나눠서 로직 동작
    		  if(expression.charAt(0) == ('-')) {	// 처음 수가 음수라면
    			  for(int i = 0; i < strResult.length; i++) {
    				  strResult[i] = tmp[i+1];			// 결과배열에 연산자 제외한 문자열 배열 인덱스 +1 저장			--> +1 이유?????
    			  }
    		  } else {								// 처음 수가 양수라면
    			  strResult = tmp;						// 결과배열에 연산자 제외한 문자열 배열 저장
    		  }
    		  return strResult;						// 결국 연산자 제외한 문자열만 반환하는 메서드
      };

      
      inputString = sc.nextLine();
      sc.close();
      
      //   * main메소드에 getOpers를 람다식으로 구현(사용)
//		연산자를 제외한 정수만 갖고 있는 문자열 배열 리턴하는 메서드									// 순서4
      nonOpperArr = operCheck.getOpers(inputString);
      
//		연산자만 있는 배열이 필요해서 임의로 만든 메서드
      operArr = new MyMath().getOperArr(inputString);
      
      
      
      
      
      
      
// 위에서 만든 모든 메서드들 사용
      for(int i = 0; i < nonOpperArr.length; i++) {					// 연산자 제외한 정수만 갖고 있는 문자열 배열을 순회하며
    	  if(inputString.charAt(0) != '-') {						// 입력값의 첫번째 인덱스가 -가 아니면서, 						(처음 수가 음수일 때 에러 방지 위한거긴한데.. 왜 -를 비교하지????? 위에서 비교한건 뭐지?)
    		  if(i == 0) {											// i가 0일 때만 (i는 그냥 숫자일 뿐이지 않나??? 이거를 왜 조건으로 준거지 ?????)
    			  preData = Integer.parseInt(nonOpperArr[i]);		// 프리데이터에 문자열 배열의 인덱스값을 정수로 변환한 값을 담는다.
    		  }
    		  if(i == nonOpperArr.length -1) {						// i가 증감해서 배열 마지막 인덱스에 도달하면 for문 종료
    			  break;
    		  }
    		  result = Integer.parseInt(nonOpperArr[i + 1]);		// +1은 왜 하는거지?????
    	  } else {
    		  result = Integer.parseInt(nonOpperArr[i]);
    	  }
    	  System.out.printf("이전 값\t:", preData);
    	  System.out.printf("연산자\t:", operArr[i]);
    	  System.out.printf("연산할 값\t:", result);
    	  
    	  preData = calculator(operArr[i]).calc(preData, result);
    	  System.out.printf("결과 값\t:", preData);
    	 
    	  result = preData;
    	  System.out.println("최종결과:" + result);
      }
   }
}
