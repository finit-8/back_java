package castingTask4;

// [캐스팅 심화]
// 	마켓이 업캐스팅 위한 클래스
// 	각 메서드는 자식클래스에 구현
// 	업캐스팅 된 마켓 클래스를 사용할 클래스도 필요 ??? ==> x (멤버 논멤버클래스에서 마켓클래스 사용하면 될 듯) 

	// 결과확인 클래스 (출력 클래스)
public class CastingTask4 {
	public static void main(String[] args) {
		// 여기서 객체 생성하면서 자식클래스의 초기화생성자로 값을 넘겨준다.
		
		// 1. 상품판매
		
		
		// 2. 상품등록
		String[] items = {"핸드폰", "수박", "노트북", "사료", "마우스", "김밥"};
		Product product = new Product();
		product.regist(items);
		
		// 물품구매
//		String[] item = {};
//		new MarketMember().buy(new Product());
		
	}
}
