package castingTask3;

public class Contents {
	private String title;
	private String genre;
	private int watchingRemitAge;
	
	public Contents() {;}
	public Contents(String title, String genre, int watchingRemitAge) {
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
	
	void chooseContents(Contents contents) {
		if(contents instanceof Animation) {
			Animation animation = new Animation();
			animation.showSubTitle();
		}
//		movie.provide4D();
//		drama.provideGoods();
	}
	
}
