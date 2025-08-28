package exceptTask;

import java.util.Scanner;

// 사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직
// 만든 예외를 이용해서 메시지 출력
public class ExceptTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null, message = "문자를 입력해주세요 \n단, !@#은 입력할 수 없습니다.";
		
		System.out.println(message);
		input = sc.nextLine();
		try {
			for(int i = 0; i < input.length(); i++) {			
				if(input.contains("!") || input.contains("@") || input.contains("#")) {
					throw new SpecialCharException("입력된 문자 중 !@#가 포함되었습니다.");
				} else {
					System.out.println(input);
				}
			}
		} catch (SpecialCharException e) {
			System.out.println("예외발생 클래스 : ExceptTask2");
			System.out.println(e.getMessage());
			System.out.println("!@#를 제거하고 입력하여 주세요.");
			e.printStackTrace();
		}
	}
}
