package collection;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(80);
		datas.add(90);
		System.out.println(datas);
		System.out.println(datas.size());
		
		// try catch 단축키 alt shift Z
		try {
			System.out.println(datas.get(0));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayListTest2 예외발생");
			System.out.println("인덱스범위를 확인하세요");
			e.printStackTrace();
		}
		
		// 실습
		// 50 뒤에 500추가
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);			
		}
		
		// 90을 9로 수정
		int prev = 0;
		try {
			if(datas.contains(90)) {
				prev = datas.set(datas.indexOf(90), 9);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayListTest2 예외발생");
			System.out.println("인덱스범위를 확인하세요");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 80을 삭제
		try {			
			if(datas.contains(80)) {
			datas.remove(80);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayListTest2 예외발생");
			System.out.println("인덱스범위를 확인하세요");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(datas);
	}
}
