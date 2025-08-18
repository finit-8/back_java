package algorithm;

import java.util.Scanner;

public class baekJoon_2920 {
	public static void main (String[] args) {
//		알고리즘: 스캐너 1~8입력
//		1~8 ascending
//		8~1 descending
//		랜덤 mixed
		
		Scanner key = new Scanner(System.in);
		int[] cScale = new int[8];
		for(int i = 0; i < cScale.length; i++) {
			cScale[i] = key.nextInt();
		}
		
		if(isAscending(cScale)) {
			System.out.println("ascending");
		} else if(isDescending(cScale)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		key.close();
	}
		
	public static boolean isAscending (int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] +1 != arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDescending (int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] -1 != arr[i+1]) {
				return false;
			}
		}
		return true;
	}
}
