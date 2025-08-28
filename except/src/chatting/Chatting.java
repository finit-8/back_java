package chatting;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("상대방에게 보낼 메세지");
		message = sc.nextLine();
		
		try {
			if(message.contains("꿀꿀")) {
				throw new BadWordException("노꿀꿀🐽");			// 예외처리 파일 만든거를 던짐
			}else {
				System.out.println(message.contains("꿀꿀"));
			}
		} catch (BadWordException e) {
			System.out.println("비속어 사용하지 마세요");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			e.printStackTrace();
		}
	}
}
