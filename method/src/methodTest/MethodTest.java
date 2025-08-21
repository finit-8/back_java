package methodTest;

public class MethodTest {
//  1. 3개의 정수를 받아서, 모두 뺀 값을 반환해주는 메서드 선언
//  2. 성과 이름을 붙여서 출력해주는 메서드 선언
	
	int minusNum (int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
	void printName (String lastName, String firstName) {
		System.out.println(lastName + firstName);
	}
	
	
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.printName(null, null);
	}
}
