package methodTest;

import java.util.Scanner;

public class MethodTask3 {
//  1 ~ n번까지 출력해주는 함수 선언 및 사용	
	void countNum(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(i+1);
		}
	}
	
//	int oneToTen() {
//		int i = 0;
//		int[] oneToTen = new int[sc.nextInt()];
//		while(i >= oneToTen.length) {
//			oneToTen[i] += i+1;
//		}
//	}
	public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3();
		mt.countNum(10);
	}
}
