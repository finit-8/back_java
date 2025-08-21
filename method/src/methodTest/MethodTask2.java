package methodTest;

public class MethodTask2 {
//  1. 이름을 10번 출력해주는 메서드
//	2. 1번 메서드 사용
	
	void printName (String name) {
		for(int i = 0; i < 10; i++) {
			System.out.println(name + i);
		}
	}
	
	public static void main(String[] args) {
		MethodTask2 mt = new MethodTask2();
		mt.printName("pwg");
	}
}
