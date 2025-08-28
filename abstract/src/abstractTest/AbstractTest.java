package abstractTest;

public class AbstractTest {
//	인터페이스 : 오버라이딩 안해도 오류가 안나는 상황인데 반드시 재정의를 해야할 때, 재정의하라고 제약을 주는 것
//  나중에 값들을 받아서 써야할 거 같을 때 추상화함. "개발자 너, 선언부는 없는데 값을 갖다써야돼"
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Animal dog2 = new Dog();
		Pet dog3 = new Dog();
	}
}
