package classTask;

class Market {
//   1. 상품명, 상품가격, 상품재고
//   판매(sell)
//  힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각 고객마다의 할인율을 판매에 적용시킬 수 있을까?
	String productName;
	int price;
	int stock;
	
	public Market(){;}
	public Market(String productName, int price, int stock, Customer customer) {
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	void sell(Customer customer) {
		System.out.printf("%s 고객님이 %s(%s원)을 %s퍼센트 할인 적용하여 구매했습니다. \n", customer.name, productName, price, customer.discountPersent);
		int dcPrice = (int)((double)price * (1 - customer.discountPersent));
//		int dcPrice = (int)((double)price - (double)price * customer.discountPersent);
		customer.money -= dcPrice;
		System.out.printf("남은 금액: %s원 \n남은 수량: %s개", (int)customer.money, stock-1);
	}
}

class Customer {
//   2. 이름, 폰, 돈, 할인율
	String name;
	String phoneNum;
	int money;
	double discountPersent;
	
	public Customer() {;}
	public Customer(String name, String phoneNum, int money, double discountPersent) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
		this.discountPersent = discountPersent;
	}
}

public class ClassTask3 {
   public static void main(String[] args) {
//      3. 마켓, 소비자를 객체화 시키고,
//      소비자에게 마켓의 물건을 판매
//      마켓의 상품 재고와 소비자의 남은 금액을 출력
	   Customer customer = new Customer("박웅규", "010-2222-3333", 100_000, 0.05);
	   Market market = new Market("핸드폰", 50_000, 3, customer);
	   
	   market.sell(customer);
   }
}