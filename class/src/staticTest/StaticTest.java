package staticTest;

class Data {
	// 1. 
	static int num = 0;
	
	static void increaseNum () {
		System.out.println(++num);
	}
	
	// 2.
	int data = 10;
	   static int data_s = 10;
	   
	   void increase() {
	      System.out.println(++data);
	   }
	   
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
		
		// 2. 
		Data data1 = new Data();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1 = new Data();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
	}
}
