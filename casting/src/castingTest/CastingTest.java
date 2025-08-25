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
//	★ 업캐스팅: 자식의 객체타입을 부모타입으로 선언한 상태로, 부모의 메서드만 쓸 수 있고 자식의 +@ 메서드를 사용할 수 없는 상태	
	public static void main(String[] args) {
		A b = new B(); // 자식이 부모의 타입으로 업캐스팅! 된 걸
		B bb = (B)b; // 자식이 다시 자기 자신의 케이스로 다운캐스팅! 함 	==>	+@ 구현가능
	
//		B a = new A(); 	 다운캐스팅 아님		(메모리 크기가 자식클래스가 더 큰데, 부모클래스 만큼만 할당해서 부족한 상태임. 자바는 메모리 낭비에 민감함)
										//	★ 넘치는 건 괜찮지만, 부족하면 안된다. 
		
		
		b.test();
//		b.test2();		당연히 없음. 어떤 상태?  
	}
}
