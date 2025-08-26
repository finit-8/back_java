package castingTask4;

import java.util.Scanner;

// [캐스팅 심화]

//Market
//- 필드: 이름
//- 메서드:
// 1. 상품 판매
//    - 등록된 상품만 판매할 수 있다.
//    - 유저가 가진 돈보다 적으면 판매할 수 없다.
//    - 유저가 마다의 할인율이 적용된다.
//       1. 비회원 할인율 5% 적용
//       2. 멤버 할인율 30% 적용
//    - 등록된 상품의 재고보다 작으면 판매할 수 없다.

// 2. 상품 등록
//    - 상품 등록은 최대 5개까지만 할 수 있다.
//    (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//    - 마트에 같은 이름의 상품은 등록할 수 없다.
//
// 3. 포인트 적립 메서드
//    - 비회원은 5%
//    - 회원은 10%

// 4. 만약 비회원이라면 
// 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

//Product 상품
//- 필드: 이름, 가격, 재고
//
//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// 
//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// 
//- 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.



	// 결과확인 클래스 (출력 클래스)
public class CastingTask4 {
	public static void main(String[] args) {
		// 여기서 클래스 객체 생성하면서 실제값을 넘겨준다.
//		Scanner sc = new Scanner(System.in);
//		String[] product = new String[5];
//		for(int i = 0; i < product.length; i++) {
//			product[i] = sc.next();
//		}
		Market market = new Market();
		market.regist(new Product("핸드폰", 100_000, 7));
	}
}
