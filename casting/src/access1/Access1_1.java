package access1;

public class Access1_1 {
	public static void main(String[] args) {
		Access1 access1 = new Access1();		// 필드의 data1 2 3 4의 값을 0으로 초기화
		access1.setData4(10);					// private int data 4의 매개변수로 10을 줌.
		System.out.println(access1.getData4());
	}
}
