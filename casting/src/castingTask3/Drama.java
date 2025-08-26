package castingTask3;

public class Drama extends Contents{

	public Drama() {;}
	public Drama(String title, String genre, int watchingRemitAge) {		// 부모의 필드를 매개변수로 받음
		super(title, genre, watchingRemitAge);									// 다시 부모한테 보냄?
	}
	
	void provideGoods() {
		System.out.println("굿즈");
	}
}
