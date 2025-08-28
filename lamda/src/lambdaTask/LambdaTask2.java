package lambdaTask;

import java.util.Arrays;

//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaTask2 {
	public static void main(String[] args) {
	//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
		// 알고리즘: 배열에 담아서 배열 출력 or 숫자 담아서 배열 출력
		PrintNum printNum = () -> {
			int[] numArr = new int[10];
			for(int i = 0; i < numArr.length; i++) {
				numArr[i] = (i + 1);
			}
			return numArr;
		};
			// 1)
		System.out.println(Arrays.toString(printNum.printUpTo10()));	
	
	}
}
