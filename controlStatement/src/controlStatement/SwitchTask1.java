package controlStatement;

import java.util.Scanner;

public class SwitchTask1 {
	public static void main(String[] args) {
		// 중복코드제거 계절을 맞추는 프로그램
		// 봄 3 4 5
		// 여름 6 7 8
		// 가을 9 10 11
		// 겨울 12 1 2

		// 입력 10
		// 출력 10월은 가을입니다.
		
		// 알고리즘: 중복코드제거, Set<>
			// 3 4 5묶고, 
		
		Scanner sc = new Scanner(System.in);
		String str = null, mesagge = "계절을 확인하고 싶은 월을 입력하세요 \n ex) 10 4 12", seasonMesagge="";
		int season = 0;
		
		System.out.println(mesagge);
		
		str = sc.next();
		int month = Integer.parseInt(str);
		season = month / 3 % 4;
		
		switch(season) {
			case 1: 
				seasonMesagge = month + ("월은 봄입니다.");
				break;
			case 2: 
				seasonMesagge = month + ("월은 여름입니다.");
				break;
			case 3: 
				seasonMesagge = month + ("월은 가을입니다.");
				break;
			case 4: 
				seasonMesagge = month + ("월은 겨울입니다.");
				break;
			default:
				break;	
		}
		
		System.out.println(seasonMesagge);
		
	}
}
