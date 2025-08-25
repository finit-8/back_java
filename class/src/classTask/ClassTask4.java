package classTask;

// 2개의 배열을 전달하면 최소값과 최대값을 구해주는 메서드
// 클래스로 리턴, 메인에서 메서드 사용

class Num {
	int[] numArr1;
	int[] numArr2;
	
	public Num() {;}
	public Num(int[] numArr1, int[] numArr2) {
		this.numArr1 = numArr1;
		this.numArr2 = numArr2;
	}
	
	void getMinAndMaxNum() {
		int maxNum = 0;
		int minNum = 0;
		for(int i = 0; i < numArr1.length; i++) {
			for(int j = 0; j < numArr2.length; j++) {
				if(numArr1[i] > numArr2[j]) {
//					1이 크면 1이 최대값, 2가 크면 2가 최대값이 되는데?
					maxNum = numArr1[i];
				} else {
					maxNum = numArr2[j];
				}
				
				if(numArr1[i] < numArr1[i+1]){
					minNum = numArr1[i];
				}
			}
		}
		System.out.println("최대값:" + maxNum);
		System.out.println("최소값:" + minNum);
	}
	
}


public class ClassTask4 {
   public static void main(String[] args) {
	   int[] arr1 = {1, 3, 7, 10, 21};
	   int[] arr2 = {4, 8, 9, 2, 15};
	   
	   Num num = new Num(arr1, arr2);
	   
	   num.getMinAndMaxNum();
   }
}