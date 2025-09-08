package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
		
//		thread1.run();
//		thread2.run();
//		멀티쓰레드는 항상 단일쓰레드로 시작


//		thread1.start();
//		thread2.start();

		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "☆");
		Thread thread2 = new Thread(target2, "♥");
		
		thread1.start();
		thread2.start();
//		.start() : 항상 join()보다 위에 start()가 있어야한다.
		thread2.setPriority(1);
//		.setPriority(n) : 쓰레드 안에서의 우선순위 변경
//			ㄴ> 쓰레드의 우선순위를 변경
//			ㄴ> 하지만 메인쓰레드보다 우선순위가 낮다.
//			ㄴ> 강제로 "무조건" 단일로 처리하듯 할 수 있게 한다.
		
		try {
//			.join() : 해당 쓰레드의 우선순위를 메인쓰레드보다 우선순위로 변경해줌.
//				ㄴ> 만약 start()보다 먼저 join()를 하면 join()은 무시된다.
//				ㄴ> 메인 쓰레드는 코드 한 줄 작성하는 순간 start() 발동
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {;}
		System.out.println("메인 쓰레드 동작");

	}
}
