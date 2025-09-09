package threadTest;

public class Thread2 implements Runnable {
	@Override
	public void run() {							// run() : 자원설정 메서드(쓰레드 객체가 같은 값 공유하여 작업할 수 있게)
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);				// sleep() : 실행 중인 스레드 일시정지 (다른 스레드를 실행시키기 위함 or 스레드 간 간격 조정(반복 주기 조정) 위해) 
//				==내가 아는 비슷한 함수== delay();
			} catch (InterruptedException e) {	// sleep을 쓰면 반드시 써야하는 예외처리로, sleep() 중에 다른 스레드가 깨울(interrupt) 수 있어서 “이 스레드 잠깐 깨워라”라는 신호가 들어오면 InterruptedException이 발생함
				e.printStackTrace();
			}
		}
	}
}
