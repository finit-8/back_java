package anonymousTest;

public class AnoymousTest {
	public static void main(String[] args) {
		Study study = new Study() {		// ==> 함수의 선언은 클래스 내부에 하고, 내부클래스는 클래스 안에 있다. 
										// 		그래서 이건 익명 내부 클래스이다. implements와 똑같다고 보면 된다

			@Override
			public void setTopic(String topic) {
				// TODO Auto-generated method stub
			}	
		};
	}
}
