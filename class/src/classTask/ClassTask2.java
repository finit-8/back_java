package classTask;

class Market {
//   1. 상품명, 상품가격, 상품재고
//   판매(sell)
//  힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
	String productName;
	int price;
	int stock;
	
	Market(){;}
	public Market(String productName, int price, int stock, Customer customer) {
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	void sell(Customer customer) {
		customer.name			// 여기부터 진행해야됨! 고객리스트를 어떻게 받지? 고객별로 할인율 적용해서 물건별로 판매해야되는데?
	}
}

class Customer {
//   2. 이름, 폰, 돈, 할인율
	String name;
	String phoneNum;
	int money;
	int discountPersent;
	
	public Customer() {;}
	public Customer(String name, String phoneNum, int money, int discountPersent) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
		this.discountPersent = discountPersent;
	}
}

public class ClassTask2 {
   public static void main(String[] args) {
//      3. 마켓, 소비자를 객체화 시키고,
//      소비자에게 마켓의 물건을 판매
//      마켓의 상품 재고와 소비자의 남은 금액을 출력
	   Customer customer = new Customer();
	   Market market = new Market("핸드폰", 50_000, 3, customer);
	   
	   
	   
   }
}