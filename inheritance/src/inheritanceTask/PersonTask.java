package inheritanceTask;

public class PersonTask {
	//이름, 나이, 주소, 핸드폰
	//각 메서드 출력
	//work 일을 한다
	//sleep 잠을 잔다
	//eat 세 끼를 먹는다
	
	String name;
	int age;
	String address;
	String phoneNum;
	
	public PersonTask(){;}
	public PersonTask(String name, int age, String address, String phoneNum) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	void work() {
		System.out.println(name + "일을 한다");
	}
	
	void sleep() {
		System.out.println(name + "잠을 잔다");
	}
	
	void eat() {
		System.out.println(name + "세 끼를 먹는다");
	}
	
}
