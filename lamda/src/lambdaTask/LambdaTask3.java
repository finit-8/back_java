package lambdaTask;

import java.util.Arrays;

// setter getter 연습 위해 setter getter 선언한 클래스 파일을 만들고
// setter getter 사용하여 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
	// 알고리즘: 배열에 담아서 배열 출력하는데, 배열의 값을 넘겨주면 배열이 아니라 값 하나만 출력되고, 배열을 넘겨주면 배열의 주소만 나옴.
	// 			Arrays.toString 메서드 쓰면 배열의 주소값을 문자열로 반환해줘서 해결됨.

public class LambdaTask3 {
	public static void main(String[] args) {
		
		
		// 2. 람다도 객체화 하는거임 (new 생성자가 없어도 ㅇㅇ)
		Num num = new Num();			// setter, getter 메서드 선언된 Num 클래스 객체 생성
		
		PrintNum printNum = (numArr) -> {	// 배열의 주소를 받음
			
			int[] result = new int[10];
			for(int i = 0; i < numArr.length; i++) {
				numArr[i] = i + 1;
			}
			result = numArr;				// 매개변수로 받은 배열의 주소의 길이를 이용하여 실제 값을 담을 배열에 값을 넣음
			
			num.setNumArr(result);			// Num클래스의 setter 메서드로 배열의 주소에 값을 넣는다.
			return result;
		};
		
		
		// 1. 클래스의 메서드나 인터페이스의 추상메서드를 '사용하려면 해당 클래스 or 인터페이스를 객체화' 해야하는데, 
		int[] inputNum = new int[10];
		printNum.printUpTo10(inputNum);		// 크기만 선언된 배열의 주소를 인터페이스의 추상메서드의 매개변수로 보냄
		
//		System.out.println(printNum.printUpTo10(inputNum));		// PrintNum 인터페이스에 선언된 추상메서드 printUpTo10의 반환타입이 배열인데, 
																// 지금 이건 배열의 값이 아니라 배열의 주소를 매개변수로 준거라서 여기에서 값을 넣고 출력해도 주소만 출력된다.
		
		
		
//		System.out.println(num.getNumArr());					// setter로 값을 넣고 getter로 가져온 건 배열의 주소라서 출력해도 주소만 출력된다.
		System.out.println(Arrays.toString(num.getNumArr()));	// Arrays.toString 메서드로 출력하면 됨.
	}
}
