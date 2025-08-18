package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
		// 1 + "8.24" + "7.8" 두 값을 더해서 115로 만들어 출력하기
		
		int num1 = 1;
		String data1 = "8.24", data2 = "7.8";
		double num2 = Double.parseDouble(data1), num3 = Double.parseDouble(data2);
		
		System.out.printf("%s" + ((int)num2+(int)num3), num1);
	}
}
