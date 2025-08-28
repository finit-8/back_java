package exceptTest;

public class ExceptTest {
	public static void main(String[] args) {
		int[] arrData = new int[5];
		try {
			arrData[5] = 10;
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스를 확인하세요");
			
		} catch (Exception e) {		// 예외처리 하다하다 안되면 예외클래스의 부모로 예외처리
			e.printStackTrace();
		}
	}
}
