package anonymousTest;

public class AnoymousTest {
	public static void main(String[] args) {
		Study study = new Study() {		// ==> 함수의 선언은 클래스 내부에 하고, 내부클래스는 클래스 안에 있다. 
										// 		그래서 이건 익명 내부 클래스다. 메서드 안에 선언할 수도 있다.
										// 		객체생성과 다른 점은 {}가 있냐없냐 차이. 기능은 implements와 똑같다고 보면 된다

			@Override
			public void setTopic(String topic) {
				// TODO Auto-generated method stub
			}	
		};
	}
}
