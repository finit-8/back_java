package castingTask4;

public class MarketMember extends Market{
	//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
	String memberName;
	String phoneNum;
	int money;
	int point;
	int coupon;

	public MarketMember() {;}
	public MarketMember(String memberName, String phoneNum, int money, int point, int coupon) {
		super();
		this.memberName = memberName;
		this.phoneNum = phoneNum;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}
	
	// 3. 포인트 적립 메서드
	//	    - 비회원은 5%
	//	    - 회원은 10%
	
	
	
	// 물품구매
	public void buy(Market market) {
		if(market instanceof Product) {
			Product product = (Product) market;
			market.welcome();
			product.productSell();
		}
	}
	
}
