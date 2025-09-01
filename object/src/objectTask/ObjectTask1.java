package objectTask;

import java.util.Objects;

// 상품클래스 만들고
// toString, hashCode, Equals를 재정의
// 같은 상품인지 비교하기
// 1번 상품
// 이름(name): 파인애플
// 가격(price): 20000
// 재고(stock): 15
// 원산지(mou): 필리핀

public class ObjectTask1 {
	public static void main(String[] args) {
		Product product1 = new Product("파인애플", "필리핀", 20000, 15, 3);
		Product product2 = new Product("김치", "중국", 18000, 20, 4);
		Product product3 = new Product("데미지 입은 파인애플", "필리핀", 18000, 20, 3);
		System.out.println(product1.toString());
		System.out.println(product2.toString());
		System.out.println(product3.toString());
		System.out.println(product1.equals(product2));
		System.out.println(product1.equals(product3));
		System.out.println(product2.equals(product3));
	}
}
