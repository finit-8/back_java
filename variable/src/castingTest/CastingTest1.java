package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
		// 자동 형변환
		System.out.println(1 + 2.5);	// 자동 형변환 3.5
		System.out.println(5 + 2);		// 정수 + 정수 = 정수	
		System.out.println(5 / 2);		// 정수 / 정수 = 정수 2 (실수 2.5 안나옴)
		System.out.println('A' * 100);	// 문자형 * 정수 = 정수
		
		// 강제 형변환
		System.out.println(5 / (double)2);			// 실수 2.5 나옴
		System.out.println((int)(5 / (double)2));	// 실수 2.5를 다시 정수로 형변환
		
		// 아스키 범위를 넘어가면 이상한 데이터ᥤ가 보이면서 암호화 됨 
		System.out.println((char)('A' * 100));	
	}
}
