package methodTest;

import java.util.Scanner;

public class MethodTask4 {
//  1. 사용자에게 이름과 반복횟수를 받아서 반복횟수만큼 이름을 출력해주는 메서드 선언
//	2. 1번 메서드 사용
	
	static Scanner sc = new Scanner(System.in);
	String name = "";
	int count = 0;
	
	void printName (String name, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
		
	public static void main(String[] args) {
		MethodTask4 mt = new MethodTask4();
		mt.printName(sc.next(), sc.nextInt());
	}
}
