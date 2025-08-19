package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mesagge = "mbti를 입력하세요", mbti = null;
		
		mbti = sc.next();
		
		switch(mbti) {
		case "ENFP":
			System.out.println("게으름 노답");
			break;
		case "ISTP":
			System.out.println("반항가 기질");
			break;
		case "ESFP":
			System.out.println("고집이 세다");
			break;
		case "ESTJ":
			System.out.println("설명충");
			break;
		default:
			break;
		}
	}
}
