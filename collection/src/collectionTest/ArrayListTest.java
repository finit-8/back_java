package collectionTest;

import java.util.ArrayList;

public class ArrayListTest<T> {
						// <> 제네릭: 이름(타입)이 없다! 포괄적이다~! 
// 지금 당장 타입이 정해져있지 않아서 T를 넣는다.
// 객체화 할 때 타입을 결정해준다. 그런데 T도 타입이다.
	T data;
	
	public static void main(String[] args) {
		ArrayList<String> data1 = new ArrayList<String>();
//		System.out.println(data1);		 []
		data1.add("웅");
		
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		data2.add(10);
	}
}
