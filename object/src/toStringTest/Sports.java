package toStringTest;

public class Sports {
	private String type;
	private int total;
	
	public Sports() {;}
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
//	객체가 가지고 있는 필드롤 보고싶을 때 사용
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		System.out.println(sports);
//		System.out.println(sports.toString()); 		오브젝트 클래스의 메서드인데 쓸 모가 업어서 오버라이딩해서 원하는 용도로 사용
		
		
	}
}
