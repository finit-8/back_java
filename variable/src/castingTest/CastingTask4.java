package castingTest;

public class CastingTask4 {
	public static void main(String[] args) {
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기
		
		String str1 = "12.123", str2 = "345.789", str3 = "6789";
		
		Integer num1 = (int)Double.parseDouble(str1), num2 = (int)Double.parseDouble(str2), num3 = Integer.parseInt(str3);
		String result = String.valueOf(num1) + num2 + num3;			// num1이 문자열이라서 뒤에 정수 을어도 문자열로 연결처리됨.
		System.out.println(result);
		
		
	}
}
