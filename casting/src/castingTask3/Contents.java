package castingTask3;

// 애니메이션 드라마 뮤비 클래스 업캐스팅하기 위한 부모클래스

public class Contents {
	private String title;
	private String genre;
	private int watchingRemitAge;
	
	public Contents() {;}
	public Contents(String title, String genre, int watchingRemitAge) {		// 자식클래스(Movie)가 외부(CastingTask3클래스의 main메서드)에서 받은 값을 받음.
		this.title = title;
		this.genre = genre;
		this.watchingRemitAge = watchingRemitAge;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getWatchingRemitAge() {
		return watchingRemitAge;
	}
	public void setWatchingRemitAge(int watchingRemitAge) {
		this.watchingRemitAge = watchingRemitAge;
	}
	
	void show() {
		System.out.println("즐거운 관람되세요");
	}
}
