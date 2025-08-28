package lambdaTest;

//펑셔닐 인터페이스는 추상메서드가 하나 밖에 없는 인터페이스

@FunctionalInterface		// ==> 메서드 하나 밖에 안쓸거야 그러니까 클래스에서 오버라이딩 안하고 쉽게 바로 출력할 수 있게 해줘
public interface LambdaInter {
	// 두 정수를 더해서 출력해주는 메서드
	public void printAddResult(int num1, int num2);
}
