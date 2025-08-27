package abstractTest;

// 어댑터 : 인터페이스에서 모든 메서드를 재정의 해야만하는 강제성을 해소하기 위한 추상클래스

public abstract class PetAdapter implements Pet{
	@Override
	public void poop() {;}
	@Override
	public void sitDown() {;}
	@Override
	public void waitNow() {;}
}
