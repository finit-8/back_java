package staticTest;

class Data {
	// 1. 
	static int num = 0;
	
	static void increaseNum () {
		System.out.println(++num);
	}
	
	// 2.
	int data = 10;	   
	void increase() {
		System.out.println(++data);
    }
   
	// 3.
	static int data_s = 10;
    void increase_s() {
       System.out.println(++data_s);
    }
}


public class StaticTest {
	public static void main(String[] args) {	
		// 1.
		Data.increaseNum();		// 객체 사용 안하고 바로 호출가능
		Data.increaseNum();
		Data.increaseNum();
		Data.increaseNum();

		
		System.out.println("");

		// 2. 
		Data data1 = new Data();  // 객체 사용하여 호출가능
		data1.increase();
		data1.increase();
		data1.increase();
		
		data1 = new Data();		  // 다시 호출하면 참조를 잃음 (주소값을 잃음) 
								  // ==> 처음 사용했던 객체는 자동으로 garbage collector가 처리하지만, 처음 객체를 다시 사용할 수 없음.
		data1.increase();
		data1.increase();
		data1.increase();
		
		
		System.out.println("");
		
		// 3.
		Data data2 = new Data();
		data2.increase_s();
		data2.increase_s();
		data2.increase_s();
		
		data2 = new Data();		  // 인스턴스변수(non static변수)는 new로 객체생성시 마다 힙메모리에 할당되고, 
								  // 클래스변수(static변수)는 클래스 로딩 시 컴파일러가 JVM의 Method Area(메타스페이스)에 단 하나만 할당하여
								  // new로 아무리 객체생성해도 static변수는 새로 생성되지 않고, 클래스 내의 모든 객체가 유일한 static 주소값을 공유하므로 값이 유지된다.
		data2.increase_s();
		data2.increase_s();
		data2.increase_s();
	}
}
