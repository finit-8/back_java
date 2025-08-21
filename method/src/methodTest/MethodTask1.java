package methodTest;

public class MethodTask1 {
	MethodTest methodTest;			// MethodTest클래스(객체)를 참조
	
	
//  1. 1 ~ 10까지 출력해주는 메서드 선언
//	2. 1번 메서드 사용
	void printNum () {
		for(int i = 0; i < 10; i++) {			
			System.out.println(i+1);
		}
	}
				
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.printNum();
	}
}
