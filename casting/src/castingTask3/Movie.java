package castingTask3;

public class Movie extends Contents{

	public Movie() {;}
	public Movie(String title, String genre, int watchingRemitAge) {
		super(title, genre, watchingRemitAge);
	}

	public void provide4D() {
		System.out.println("4D 지원");
	}
}
