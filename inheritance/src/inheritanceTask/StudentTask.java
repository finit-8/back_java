package inheritanceTask;

public class StudentTask extends PersonTask {
	//인스타아이디
	//각 메서드 출력
	//work 아르바이트를 한다
	//sleep 수업 시간에 잠을 잔다
	//eat 아침을 거른다
	
	String instaID;
	
	public StudentTask() {}
	public StudentTask(String name, int age, String address, String phoneNum, String instaID) {
		super(name, age, address, phoneNum);
		this.instaID = instaID;
	}
	
	void showInstaID() {
		System.out.println(name + "인스타아이디:" + instaID);
	}
	
	@Override
	void work() {
		System.out.println(name + "아르바이트를 한다");
	}
	
	@Override
	void sleep() {
		System.out.println(name + "수업 시간에 잠을 잔다");
	}
	
	@Override
	void eat() {
		System.out.println(name + "아침을 거른다");
	}
	
}
