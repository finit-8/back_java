package castingTask3;

public class Movie extends Contents{

	public Movie(String title, String genre, int watchingRemitAge) {		// 외부(CastingTask3클래스의 main메서드)에서 전달된 값을 매개변수로 받음
		super(title, genre, watchingRemitAge);									// 그걸 부모생성자로 보냄 (부모의 접근제어자가 프라이빗이라도, 부모의 생성자는 public이므로 부모 생성자한테 값을 주고, 부모 생성자가 직접 필드 초기화함)
	}

	public void provide4D() {
		System.out.println("4D 지원");
	}
}
