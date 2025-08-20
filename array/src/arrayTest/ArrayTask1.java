package arrayTest;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
		System.out.println("브론즈");
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
		
		int[] arr1 = new int[5];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (10 - i * 2);
			System.out.print(arr1[i]);
		}
//		for(int i = 0; i < 10; i += 2) {
//			arr1[i] = (10 - i);
//			System.out.print(arr1[i]);
//		}
		
		
		
		System.out.println("");
		
//      1~10까지 배열에 담고 출력
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (i+1);
			System.out.print(arr2[i]);
		}
		
		System.out.println("");

//      1~100까지 배열에 담은 후 홀수만 출력
		int[] arr3 = new int[100];
		for(int i = 0; i < arr3.length; i++) {
	        arr3[i] = i+1;					// 이 코드가 초기화문인데, 이 코드 안쓰고 바로 출력에서 i+1하면 빈값 0만 나온다. 그래서 초기화 필수
//			arr3[0] = 0+1
//			arr3[1] = 1+1
//			arr3[2] = 2+1
//			arr3[3] = 3+1
//				...	
			
	        if(i % 2 == 0) {				// i가 짝수일 때,
	        	System.out.print(arr3[i]);	// arr3[i] = i+1 즉, 짝수+1이니까 홀수가 출력됨.
	        }
//			arr3[i] = i;
//			if(i % 2 == 1) {
//				System.out.print(arr3[i]);
//	         }
		}
		
//		for(int i = 0; i < arr3.length; i += 2) {
//			arr3[i] = i+1;
//			arr3[0] = 0+1
//			arr3[2] = 2+1
//			arr3[4] = 4+1
//			arr3[6] = 6+1
//				...	
//			System.out.print(arr3[i]);
//		}
		
		

		
		
		System.out.println("\n=========================== \n실버");
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
		// 알고리즘: i+1로 해서, 인덱스 1 3 5 7 9 일때 누적합하기
			int evenHop = 0;
			int[] arr4 = new int[100];
			for(int i = 0; i < arr4.length; i++) {
				arr4[i] = i+1;
				if(i % 2 == 1) {		// 인덱스가 1 3 5 7 9 홀수일 때					
					evenHop += (i+1);
				}
			}
			System.out.print(evenHop);
			

		System.out.println("");

//      A~F까지 배열에 담고 출력
		// 알고리즘: 아스키로 담고, (char)arr5
//		char[] arr5 = new char[6];				// int i 때문에 다른 문제에서 i를 못씀
//		int i = 0;
//		int j = 0;
//		while (i < 6) {
//			switch(i) {
//				case 0:  
//					arr5[0] = 'A'; break;
//				case 1:
//					arr5[1] = 'B'; break;
//				case 2:
//					arr5[2] = 'C'; break;
//				case 3:
//					arr5[3] = 'D'; break;
//				case 4:
//					arr5[4] = 'E'; break;
//				case 5:
//					arr5[5] = 'F'; break;
//				default: break;
//			}
//			i++;
//		}
//		while (j < arr5.length) {
//			System.out.print(arr5[j]);
//			j++;
//		}
		
		int[] arr5 = new int[26];
		for(int i = 0; i < arr5.length; i++) {
			arr5[i] += ('A' + i);
			if(arr5[i] == 'G') {
				break;
			}
			System.out.print((char)arr5[i]);
		}
		
			
		
		System.out.println("");

//      A~F까지 중 C 제외하고 배열에 담은 후 출력
		// 알고리즘: 인덱스2일 때 제거...
			char[] arr6 = new char[5];
			for(int i = 0; i < arr6.length; i++) {
				arr6[i] += (char)('A' + (i>1 ? (i+1) : i));
				System.out.print(arr6[i]);
			}

			
System.out.println("\n=========================== \n골드");

		
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		Scanner key = new Scanner(System.in);
		int[] arr7 = new int[5];
		int maxNum = 0, minNum = 0;
		for(int i = 0; i < 5; i++) {
			arr7[i] = key.nextInt();
		}
		
		maxNum = arr7[0];
		minNum = arr7[0];			// 모든 입력값이 0보다 크므로, 배열 첫번째 값으로 해야 0이 최소값으로 고정되지 않는다.

		for(int i = 0; i < arr7.length; i++) {
			if(minNum > arr7[i]) {
				minNum = arr7[i];
			} 						// arr7[i]를 기준으로 생각했을 때, 
									// arr7[i]가 최소값보다 작거나 / 최대값 보다 크면 그 값으로 갱신
			if(arr7[i] > maxNum) {
				maxNum = arr7[i];
			}
		}
		System.out.println("최대값:" + maxNum + "최소값:" + minNum);
		
      
System.out.println("\n=========================== \n다이아");

//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr8 = null;		
		int total = 0;
		double avg = 0.0;
		
		arr8 = new int[length];
		for(int i = 0; i < arr8.length; i++) {
			arr8[i] = sc.nextInt();
			total += arr8[i]; 
		}
		avg = (double)total / arr8.length;
		System.out.println(avg);
		
		
		
	      
	}
}
