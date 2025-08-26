package repeat;

import java.util.Scanner;

public class Algorithm_2798 {
	public static void main(String[] args) {
		// 스캐너로 카드 개수(n), 총합의 한도를 제한하는 수(rimitNum) 1개 입력받고,
		// n 중 3장의 합이 rimitNum보다 작을때,
		// 3장의 합을 출력
		
		// 카드 개수가 3장만 있는게 아닌데 어떻게 여러 경우의 수를 선택하지? 삼중for문 !!!!!!
		
		Scanner sc = new Scanner(System.in);
		int n = 0, rimitNum = 0, sum = 0, result = 0;
		int[] card = null;
		n = sc.nextInt();
		card = new int[n];
		
		rimitNum = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			card[i] = sc.nextInt();		// 값을 다 채우고 나야 순회할 때 정상적으로 조건 판독함
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < card.length; j++) {
				for(int k = j+1; k < card.length; k++) {
					sum = card[i] + card[j] + card[k];
//					if(sum <= rimitNum) {			rimitNum보다 작기만하면 조건에 맞기 때문에 인덱스순서마다 결과를 갱신해버림.
//						result = sum;
//					}
					
					if(sum <= rimitNum && sum > result) {		// 3장의 합이 결과(앞선 3장의 합)보다 커야만 갱신하는 조건
						result = sum;
					}
				}
			}
		}
		System.out.println(result);
	}
}
