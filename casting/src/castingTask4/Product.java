package castingTask4;

public class Product extends Market{
	//- 필드: 이름, 가격, 재고
	String[] productName;	// 부모(마켓)과 이름이 같지 않아서 따로 초기화
	int price;
	int stock;
	
	
	public Product() {;}
	public Product(String name, int money, int price, int stock) {
		super(name, money);	// 외부(main메서드)에서 들어온 name을 부모한테 줌
		this.price = price;
		this.stock = stock;
	}
	public Product(String[] productName) {
		this.productName = productName;					// 외부(main메서드)에서 들어온 productName을 자신이 씀
	}
	
	//- 메서드:
	// 1. 상품 판매
//	    - 등록된 상품만 판매할 수 있다.
//	    - 유저가 가진 돈보다 적으면 판매할 수 없다.
//	    - 등록된 상품의 재고보다 적으면 판매할 수 없다.		??? 무슨 말
//	    - 유저 마다의 할인율이 적용된다.
//	       1. 비회원 할인율 5% 적용
//	       2. 멤버 할인율 30% 적용
	// 알고리즘:
	//			if (true && customerMoney > price && stock )
	//			member ? price - price * 0.3 : price - price * 0.05
	
	// 현재 문제: 등록된 상품 변수를 super로 넘기고 getter로 불러오는거나 생성자에서 직접 초기화 하는거나, 등록된 상품을 반환하는 메서드 타입을 바꿔도 안됨
	//			유저 true일 때 할인율, false일 때 할인율 적용하기 위해 클래스 넣었는데 불리안타입으로 전환이 안된다.
	
	public void productSell(String[] registedProductName, int money, int price, MarketMember marketMember) {
		boolean isRegisted = false, isMember = false;
		
		for(int i = 0; i < registedProductName.length; i++) {
			isRegisted = true;
		}
		isMember = marketMember.할인율 == 할인율 ? true : false;
		
		if (isRegisted == true && money > price) {
			price = isMember == true ? (int)(price - (double)price * 0.3) : (int)(price - (double)price * 0.05);
			System.out.print(money - price);
		}
	}
	
	
	// 2. 상품 등록
//	    - 상품 등록은 최대 5개까지만 할 수 있다.
//	    (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//	    - 마트에 같은 이름의 상품은 등록할 수 없다.
	// 알고리즘: 
	//			main에서 배열로 받아서 새로운 배열or클래스에 5개 담기
	// 			반복 돌려서 동일한 이름이 아닐 때만 상품추가
	//			
	public void regist(String[] productName) {
		String[] registedProductName = new String[5];
		for(int i = 0; i < productName.length; i++) {
			if(productName[i] != productName[i+1]) {
				registedProductName[i] = productName[i];
			}
			System.out.print(registedProductName[i] + " ");
		}
	}
	
}
