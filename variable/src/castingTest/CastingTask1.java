package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
		// 8.43 + 2.59를 더한 값이 10이 되도록 형변환
		double num1 = 8.43, num2 = 2.59;
		System.out.println((int)8.43 + (int)2.59);
		
		int result = 0;
		result = (int)num1 + (int)num2;
		System.out.printf("%.2f + %.2f = %d로 강제 형변환", num1, num2, result);
	}
}
