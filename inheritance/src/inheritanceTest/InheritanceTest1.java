package inheritanceTest;

class A {
	String name;
	int data;
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name="A";
		this.data=10;
	}
	
	void printName() {
		System.out.println(name);
	}
	
	void walk() {
		System.out.println("네 발로 걷는다.");
	}
}
class B extends A{

	public B() {
		super();
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		System.out.println(data);			// 10
		System.out.println(this.data);		// 10
		System.out.println(super.data);		// 10	부모의 생성자
	}
	
	@Override
	void walk() {
		System.out.println("두 발로 걷는다.");
	}
}

public class InheritanceTest1 {
	// 자식을 호출할 땐 부모를 먼저 호출해야한다.
	// 메서드는 값, 기능으로 볼게 아니라 저장공간으로 봐야한다.
	public static void main(String[] args) {
		B b = new B();
		b.printName();
		b.printData();
		b.walk();
		
		A a = new A();
		a.walk();
	}
}
