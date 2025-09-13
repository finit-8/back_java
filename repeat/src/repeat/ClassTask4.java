package repeat;
public class ClassTask4 {
// 1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
	public void getMaxAndMin(int num1, int num2) {
		int result = 0, max = 0, min = 0;
		if(num1 > num2) {
			max = num1;
//			return max;
		} else if(num1 < num2) {
			min = num1;
//			return min;
		}
	}
// 2. 클래스로 리턴
// 3. 메인 메서드에서 메서드 사용
	
	public static void main(String[] args) {
		ClassTask4 ct = new ClassTask4();
//		System.out.println(ct.getMaxAndMin(3, 9));
		ct.getMaxAndMin(3, 9);
	}
   
}
