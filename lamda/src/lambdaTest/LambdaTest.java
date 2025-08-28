package lambdaTest;

// 람다함수도 인터페이스 이용한 문법임. 인터페이스를 받는 클래스에서 인터페이스의 추상메서드 재정의하는 용도???
// js의 함수랑 같다.

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter lambdaInter = (num1, num2) -> {System.out.println(num1 + num2);};
		lambdaInter.printAddResult(10, 20);
		
		LambdaInter2 lambdaInter2 = (num1, num2) -> new CalcResult();
			
		LambdaInter3 lambdaInter3 = num -> num % 2 == 0;
	}
}

