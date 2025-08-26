package access1;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;
	
	public Access1() {;}

	public Access1(int data1, int data2, int data3, int data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public int getData4() {
//		return this.data4;
		return data4;
	}
	
	public void setData4(int data4) {		// setData()의 매개변수로 필드의 private int data4를 준거고, 
		this.data4 = data4;					// this.data4는 필드의 private int data4를 말하는거고, 대입연산자 뒤에 data4는 setData()사용시 매개변수로 들어온 값
	}										// 	==> 생성자로 초기화 후에, 값을 바꾸고 싶을 때(화면에서 사용시) 쓰는 메서드
}
