package castingTask4;

public class Market{
	//- 필드: 이름
	private String name;
	private int money;
	
	public Market() {;}
	public Market(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	void welcome () {
		System.out.println("어서오세요~ 환영합니다! 결제 도와드리겠습니다.");
	}
		
}
