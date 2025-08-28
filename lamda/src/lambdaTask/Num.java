package lambdaTask;

// getter setter 연습위한 클래스 - getter setter 메서드 선언해놓고 메서드 사용하는 클래스에서 Arrays.toString으로 주소의 값을 문자열로 반환하면 된다.

public class Num {
	private int[] numArr;

	public Num() {;}
	public Num(int[] numArr) {
		super();
		this.numArr = numArr;
	}
	public int[] getNumArr() {
		return numArr;
	}
	public void setNumArr(int[] numArr) {
		this.numArr = numArr;
	}
	
	
	
}
