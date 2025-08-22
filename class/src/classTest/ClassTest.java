package classTest;

public class ClassTest {				// 1. 추상화
	
	// 필드, 멤버변수 선언 (공통요소 선언)
	String name;						
	int age;
	
	// 기본 생성자 선언
	public ClassTest(){;}				// 초기화 생성자를 선언하면 기본생성자를 제공해주지 않기 때문에 따로 선언해줘야 됨
	
	// 4. 초기화 생성자 선언					
	public ClassTest(String name, int age) {			// alt shift s --> o
		this.name = name;				// this = 자기자신의 주소값
		this.age = age;					// 		각각의 메모리주소값(new의 주소)
	}
	
	
	
	public static void main(String[] args) {
		ClassTest ct1 = new ClassTest("홍", 10);				// 2. 객체화(이 코드 한 줄), ct1 = 객체를 담은 변수 즉, 객체
	//	=========
	// 클래스자료형. 클래스는 타입이다. (클래스는 클래스만 정의할 수 있기 때문)
					//  ===
					// new연산자 : 힙메모리 주소를 알려주는 연산자. 	클래스를 메모리에 할당까지가 new
						 // =========
 						 // 3. 생성자사용 
						 // ClassTest() 생성자 : 객체를 생성하는 자. (클래스Class, 메서드() 아님)
						 // 					클래스(ClassTest)를 통해 
						 //						메모리에 할당된 객체화된 클래스의 주소'값'을 리턴해준다.
		
		// 생성한 객체를 메모리에 할당하고,
		
		ClassTest ct2 = new ClassTest("김", 13);
		
		
		ClassTest ct3 = new ClassTest();		// 초기화생성자 선언시 기본생성자는 제공되지 않기에 클래스에 기본생성자 선언해줘야 됨
		
		System.out.println(ct1.name);
		System.out.println(ct2.age);
		System.out.println(ct3);
	}
}
