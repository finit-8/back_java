package castingTest;

public class CastingTask3 {
	public static void main(String[] args) {
		// String.valueOf(값);
		// 어떤 값을 문자열로 형변환 시켜주는 메서드
		
		char a = 'a', j = 'j', k = 'k';
		// 모두 대문자로 바꿔서 출력
		
		int numA = a - 32, numJ = j - 32, numK = k - 32;
		char A = (char)numA, J = (char)numJ, K = (char)numK; 
		System.out.printf("%c, %c, %c", A, J, K);
	}
}
