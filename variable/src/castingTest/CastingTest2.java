package castingTest;

public class CastingTest2 {
	public static void main(String[] args) {
		// 문자열 강제 형변환
		// 무조건 연결
		// 문자열 + 정수 or 실수 = "문자열로 연결"
		  System.out.println("1" + 3);
	      System.out.println("1" + (3 + 8));
	      System.out.println("1" + 10.5);
	      System.out.println("1" + 'A');
	      System.out.println("1" + true);
	      
	    // String은 클래스형 자료형, int는 기본자료형이라서 불가하여
	      System.out.println((int)"10"-5);
	    // 문자열 강제 형변환을 사용한다.
	      System.out.println(Integer.parseInt("10")-5);
	      System.out.println(Float.parseFloat("10"));
	      System.out.println(Double.parseDouble("10"));
	      System.out.println(Boolean.parseBoolean("10"));
	}
}
