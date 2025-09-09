package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
		
//		thread1.run();
//		thread2.run();
//		==> 멀티쓰레드는 항상 단일쓰레드로 시작 (멀티태스킹 안되는 상황)


//		thread1.start();
//		thread2.start();
		

		
		
		// ↓ 여기부터 멀티쓰레드
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "☆");
		Thread thread2 = new Thread(target2, "♥");
		
		
		
//	작성순서: start() > (필요시 join()) > 메인메서드 순
//	실행순서 강제변경: join > main메서드 > setPriority() > join = start ???????
		
		
		
//		.start() : 항상 join()보다 start()가 위에 있어야한다.
		thread1.start();
		thread2.start();
		
		
//		.setPriority(n) : 쓰레드 안에서의 우선순위 변경
//			ㄴ> 쓰레드의 우선순위를 변경
//			ㄴ> 하지만 메인쓰레드보다 우선순위가 낮다.
//			ㄴ> 강제로 "무조건" 단일로 처리하듯 할 수 있게 한다.
		thread2.setPriority(1);

		
//		.join() : join한 해당 쓰레드의 우선순위를 메인쓰레드보다 우선순위로 변경해줌.
//			ㄴ> 만약 start()보다 먼저 join()를 하면 join()은 무시된다.
//			ㄴ> 메인 쓰레드는 코드 한 줄 작성하는 순간 start() 발동
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {;}
		
		
//		main메서드
		System.out.println("메인 쓰레드 동작");

	}
}
