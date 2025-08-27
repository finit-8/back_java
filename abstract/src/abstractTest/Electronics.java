package abstractTest;

public abstract class Electronics {
	//	클래스 안에 소괄호만 있으면 선언임 (원래 소괄호만 있으면 사용이었지만)
	public abstract void safe();
	
	// 추상클래스 안에 일반 메서드도 만들 수 있다
	public void on() {
		System.out.println("전원 켬");
	}
}
