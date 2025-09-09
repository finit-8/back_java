 package synchronizedTest;

public class ATM implements Runnable{
	int money = 10000;
	
	@Override
	public void run() {							// run() : 자원설정 메서드(쓰레드 객체가 같은 값 공유하여 작업할 수 있게)
		for(int i = 0; i < 5; i++) {
			withdraw(1000);
			try {
				Thread.sleep(1000);				// sleep() : 실행 중인 스레드 일시정지 
			} catch (InterruptedException e) {	// sleep을 쓰면 반드시 써야하는 예외처리로, sleep() 중에 다른 스레드가 깨울(interrupt) 수 있어서 “이 스레드 잠깐 깨워라”라는 신호가 들어오면 InterruptedException이 발생함
				System.out.println("사용자가 출금을 취소했습니다.");
				
				if(Thread.interrupted()) {
                    System.out.println("[catch] 인터럽트 플래그 확인됨");
                } else {
                    System.out.println("[catch] 플래그는 이미 초기화됨");		// 위에 예외처리 했기 때문에 else문 실행됨
                }

                break; // 스레드 종료
			}
			if(Thread.interrupted()) {
				System.out.println("[check] 인터럽트 요청 감지 -> 루프 종료");
				break; // 스레드 종료
			}
			
		}
	}
	
	
	public void withdraw(int money) {
		synchronized (this) {					// synchronized 동기처리 : 공유 자원 보호 위해 동시 접근(비동기) 방지, this는 ATM 클래스
												// 하나가 동작 중일때는 다른 애들은 대기해라. (멀티쓰레드를 동기처리 하지 않으면 서로 무분별하게 같이 작업하다가 작업이 누락되기 때문) 
			this.money -= money;
		}
			
		System.out.println(Thread.currentThread().getName() + "이/가" + money + "원 출금");
		System.out.println("현재 잔액:" + this.money + "원");
	}
}
