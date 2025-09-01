package lambdaTask;

import java.util.Arrays;

public class LambdaTask2 {
	public static void main(String[] args) {
	
	//1) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
		PrintString printString = (String str, char c) -> {
//			int count = 0;
//			for(int i = 0; i < str.length(); i++) {
//				if(str.charAt(i) == c) {
//					count++;
//				}
//			}
//			System.out.println(count);
			
			int count = 0;
			char[] arr = str.toCharArray();
			for(char cha : arr) {
				if(cha == c) {
					count++;
				}
			}
			System.out.println(count);
		};
		printString.strCount("abcdaaa", 'a');

			
	
	//2) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//		알고리즘 : String은 기본자료형이라서 불변법칙 때문에 직접 수정불가하여 새로운 변수에 역순으로 담는다.
//				toCharArray로 문자형 배열로 담고, 정렬로 역순으로 만들고, 문자열로 형변환해서 출력
//					==> 정렬은 값의 대소비교이고, 이 문제는 값의 대소비교가 아님.
		Reverse reverse = (String str) -> {
			String result = "";
			// 방법 1. for문에서 바로 역순출력
//			for(int i = str.length() -1; i >= 0; i--) {
//				result += str.charAt(i);
//			}
			
			// 방법2. 문자열의 인덱스로 문자열 길이 -1 -0으로 사용 
			for(int i = 0; i < str.length(); i++) {
				result += str.charAt(str.length() -1 -i);
			}
			
			// 방법3. 문자열이 길어지면 너무 비효율적이라서 그냥 result = str.charAt(i) + result; 이 코드 동작방식 이해만 하면 됨.
//			for(int i = 0; i < str.length(); i++) {
//				if(str.charAt(i) == '졸' || str.charAt(i) == '려') {
//					result = str.charAt(i) + result;				
//						// 제일 처음 인덱스값이 result에 들어가고 
//						// 그 다음번째 인덱스값 뒤에, 처음 인덱스값을 넣은 result를 붙인다.
//				}
//			}
			System.out.println(result);
		};
		reverse.reverseString("졸리고, 에어트랙 하고 싶고 ㅇㅇ");
		
	//3) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
		// 알고리즘: str의 인덱스값이 c일 때 결과값에 담으면, c만 담김 --> c가 아닐 때 결과값을 담아야 c 제거하고 담김
		RemoveChar rmc = new RemoveChar();
		Remove remove = (String str, char c) -> {
			
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != c) {
					result += str.charAt(i);
				}
			}
//			System.out.println(result);				디버깅
			rmc.setStr(result);			
		};
		
		remove.removeStr("abcdaaa", 'a');
		System.out.println(rmc.getStr());
		
	//4) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
	//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
		// 알고리즘: if(chars[i] == chars[i+1]) 이 조건은 현재 인덱스와 바로 다음 인덱스끼리만 비교돼서 불가
		// 			이중for문으로 i랑 j 비교해서 모든 경우의 수 탐색해야됨 ???

		RemoveDuplicationChar rd = new RemoveDuplicationChar();
		Dedupe dedupe = (String str) -> {
			String result = "";
			char[] chars = str.toCharArray();							// 사실 문자형배열에 안담아도 됨.
			for(int i = 0; i < chars.length; i++) {
				if(!result.contains(String.valueOf(chars[i]))) {		// 결과값에 chars[i]가 없는게 true면 
					result += chars[i];									// 결과값에 chars[i]를 담는다.
				}
			}
//			System.out.println(result);
			rd.setStr(result);
			return result;
		};
		dedupe.getDedupe("가나다가나다라가나다라마바사");
		System.out.println(rd.getStr());
	}
}
