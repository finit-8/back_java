package synchronizedTest;

public class KB {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread taehee = new Thread(atm, "태희");
		Thread hanmin = new Thread(atm, "한민");
		
		taehee.start();
		hanmin.start();			// 비동기 내에서 여러 쓰레드들이 작업하고 있음
		
		taehee.interrupt();		// thread.interrupt() : sleep 중인 스레드 깨움 (너 지금 하던 거 멈추고 종료 준비해)
		hanmin.interrupt();		// 						==> 즉 종료시킬 필요가 있을 때(사용자가 취소, 종료버튼) 즉시 종료 시키기 위함.
	}
}
