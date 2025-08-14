package variableTest;

// 각 데이터에 맞는 타입 선언 후 출력하기
// 5, false, 7845.15, B, 85.10F, 자바, S, 98590, D, true, 107L, 공백문자
public class VariableTest2 {
	public static void main(String[] args) {
//      내가 값을 모를 때 (실무에서 데이터를 받아서 쓰는 경우가 많음) -> 초기값
//				이 문제의 경우, 데이터 받는 상황이라 가정하고 푸는게 나아보임
//      int num1 = 0, num2 = 0;
//      boolean isFalse = false, isTrue = false;
//      double num3 = 0.0;
//      float num4 = 0.0F;
//      char data1 = ' ', data2 = ' ', data3 = ' ', data4 = ' ';
//      String str1 = "";
//      long num5 = 0L;
		
		int num1 = 5, num4 = 98590 ;
		long num5 = 107L;
		
		double num2 = 7845.15;
		float num3 = 85.10F;
		
		String language = "자바";
		
		boolean result = false, result2 = !result;
		char data1 = 'B', data2 = 'S', data3 = 'D', data4 = ' ';
		
		
		
		System.out.print("정수: " + num1 + "와 " + num4 + "과 " + num5 + "\n실수:" + num2 + "와 " + num3 + "\n");
		System.out.println("불리안: " + result + data4 + result2);
		System.out.println("캐릭터: " + data1 + data2 + data4 + data3);
		System.out.println("문자열: " + language);
	}
}
