package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask2 {
	public static void main(String[] args) {
		// a ~ z까지 문자열로 ArrayList에 추가하기
		
		ArrayList<String> lowerAlpha = new ArrayList<String>();
		for(int i = 'a'; i <= 'z'; i++) {
			lowerAlpha.add(String.valueOf((char)i));
		}
//		Arrays.toString(배열형 타입);	배열을 스트링으로 해보자
		System.out.println(lowerAlpha);
		
		
		
		for(int i = 0; i < lowerAlpha.size(); i++) {
			if(i % 2 == 1) {
				System.out.print(lowerAlpha.get(i).toUpperCase());
				continue;			// 그 다음 인덱스로 넘어가서 밑에 sysout은 출력안함
			}
			System.out.print(lowerAlpha.get(i));
		}
	}
}
