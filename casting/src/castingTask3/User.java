package castingTask3;

public class User {
	String ID;
	String password;
	
	public User() {;}
	public User(String iD, String password) {
		this.ID = ID;
		this.password = password;
	}

	void watchContents(Contents contents) {
		if(contents instanceof Movie) {
			
		} else if(contents instanceof Drama) {
			
		} else if(contents instanceof Animation) {
			
		}
	}
	
	
}
