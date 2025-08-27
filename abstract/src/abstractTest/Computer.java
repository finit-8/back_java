package abstractTest;

public class Computer extends Electronics{			// 넘치는 건 되지만, 부족한건 안됨 (재정의 안하면 부족해서 에러뜸)
	@Override
	public void safe() {
		
	}
}
