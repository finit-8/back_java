package castingTest;

class A {
	   void test() {
	      System.out.println("A");
	   }
	}
	class B extends A{
	   void test() {
	      System.out.println("B");
	   }
	   
	   void test2() {
	      System.out.println("BB");
	   }
	}

public class CastingTest {
//	상속 받으면 자식은 부모타입과 자기자신타입으로 타입이 2개가 된다
//	★ 업캐스팅: 자식의 객체를 부모타입의 참조변수로 선언한 상태로, 
//			자식클래스에 오버라이딩된 메서드가 있으면 부모클래스의 메서드를 자식클래스의 오버라이딩된 메서드로 출력함. 자식클래스의 +@ 메서드는 못씀.
//			자식클래스마다 출력이 다르다. 그런데 출력시 매개변수로 모든 자식클래스를 입력하는건 너무 번거롭기에 하나의 매개변수로 담기 위해 업캐스팅한다. 

	public static void main(String[] args) {
		A b = new B(); // 자식이 부모의 타입으로 업캐스팅! 된 걸 
		B bb = (B)b; // 자식이 다시 자기 자신의 +@ 메서드를 쓰기 위해 부모타입의 참조변수를 자식타입(원래 주소가 자식)으로 다운캐스팅! 함 	==>	다운캐스팅 : +@ 메서드 사용가능
	
//		B a = new A(); 	 다운캐스팅 아님		(메모리 크기가 자식클래스가 더 큰데, 부모클래스 만큼만 할당해서 부족한 상태임. 자바는 메모리 낭비에 민감함)
										//	★ 넘치는 건 괜찮지만, 부족하면 안된다. 
		
		
		b.test();
//		b.test2();		당연히 없음. 어떤 상태?  
	}
}
