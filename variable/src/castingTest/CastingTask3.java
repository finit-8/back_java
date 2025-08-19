package castingTest;

public class CastingTask3 {
	public static void main(String[] args) {	
		char a = 'a', j = 'j', k = 'k';
		// 모두 대문자로 바꿔서 출력
		
		int numA = a - 32, numJ = j - 32, numK = k - 32;
		char A = (char)numA, J = (char)numJ, K = (char)numK; 
		System.out.printf("%c, %c, %c", A, J, K);
	}
}
