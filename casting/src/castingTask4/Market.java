package castingTask4;

import java.util.Scanner;

public class Market {
	//- 필드: 이름
	private String name;
	
	public Market() {;}
	public Market(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	메서드1. 상품 판매
//	    - 등록된 상품만 판매할 수 있다.
//	    - 유저가 가진 돈보다 적으면 판매할 수 없다.
//	    - 유저가 마다의 할인율이 적용된다.
//	       1. 비회원 할인율 5% 적용
//	       2. 멤버 할인율 30% 적용
//	    - 등록된 상품의 재고보다 작으면 판매할 수 없다.

//	 메서드2. 상품 등록
//	  	- 상품 등록은 최대 5개까지만 할 수 있다.
//	  	(즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//	 	 - 마트에 같은 이름의 상품은 등록할 수 없다.
	public String[] registProduct() {
		String[] product = new String[5];
		for(int i = 0; i < product.length; i++) {
			if(product[i] != super.getName()) {
				product[i] += super.getName();
			}
		}
		
		return product;
	}
	
//	public void regist(Product product) {
//	if(product instanceof ProductRegist) {
//		ProductRegist productRegist = (ProductRegist) product;
//		productRegist.registProduct();
//	}
//}

	
	
	
	// 3. 포인트 적립 메서드
//	    - 비회원은 5%
//	    - 회원은 10%

	// 4. 만약 비회원이라면 
	// 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!
		
}
