package castingTask3;
	// '업캐스팅 된 Contents클래스를 사용' 및 자식클래스가 가지고 있는 각각의 메서드를 사용하기 위해 다운캐스팅하는 클래스
public class User {
	String ID;
	String password;
	
	public User() {;}
	public User(String iD, String password) {
		this.ID = ID;
		this.password = password;
	}

	Contents watch(Contents contents) {
		if(contents instanceof Movie) {
			Movie movie = (Movie) contents;
			contents.show();
			movie.provide4D();
		} else if(contents instanceof Drama) {
			Drama drama = (Drama) contents;
			contents.show();
			drama.provideGoods();
		} else if(contents instanceof Animation) {
			Animation animation = (Animation) contents;
			contents.show();
			animation.provideSub();
			
		}
		return contents;
	}
	
}
