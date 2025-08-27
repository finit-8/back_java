package abstractTest;

//public class Tiger implements Pet{			// 클래스에서 펫에 있는걸 implements 구현한다.
//	@Override
//		public void poop() {}
//	
//	@Override
//		public void sitDown() {}				// 인터페이스의 추상메서드를 전부 다 재정의 해야하는 강제성이 있음
//	
//	@Override
//		public void waitNow() {}
//}

public class Tiger extends PetAdapter{			// 어댑터로 강제성을 제거하여 필요한거만 재정의 가능 (어댑터는 실제로 쓸 일 잘 없단다)
	@Override
	public void poop() {};
}

