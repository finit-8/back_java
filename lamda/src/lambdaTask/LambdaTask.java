package lambdaTask;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {	
	
	// 사칙 연산의 결과를 출력하는 메서드 선언
	public void showCalcResult(CalcResult cr) {				// 메인메서드에 set 되어있어야 get가능
		System.out.println(cr.getAdd());
		System.out.println(cr.getDevide());
		System.out.println(cr.getMurtiple());
		System.out.println(cr.getSubtract());
	}
	
	public static void main(String[] args) {		
		// LambdaInter2 구현
		// 두 정수를 받아서 사칙연산을 CalcResult로 리턴해주는 메서드
		// 알고리즘: 람다가 인터페이스 오버라이딩 방법 중 하나니까, 람다 안에 메서드 구체화한다.  
		//			 매개변수를 어디서 주지..?	==> set get
		//			set get말고는 방법이 없나
		
		LambdaInter2 lambdaInter2 = (num1, num2) -> {
			CalcResult calcResult = new CalcResult();
			calcResult.setAdd(num1 + num2);
			calcResult.setSubtract(num1 - num2);
			calcResult.setMurtiple(num1 * num2);
			calcResult.setDevide(num1 / num2);
			return calcResult;
		};
		
		System.out.println(lambdaInter2.calc(10, 20).getAdd());
		System.out.println(lambdaInter2.calc(10, 20).getSubtract());
		System.out.println(lambdaInter2.calc(10, 20).getMurtiple());
		System.out.println(lambdaInter2.calc(10, 20).getDevide());
		
		// 사칙 연산의 결과를 출력하는 메서드 사용
		LambdaTask lambdaTask = new LambdaTask();
		lambdaTask.showCalcResult(lambdaInter2.calc(1, 3));
	}
}
