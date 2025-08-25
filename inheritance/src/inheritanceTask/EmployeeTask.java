package inheritanceTask;

public class EmployeeTask extends PersonTask{
	//EmployeeTask
	//비상금
	//각 메서드 출력
	//work 하루 종일 일을 한다
	//sleep 잠을 설친다
	//eat 야식을 먹는다
	
	int emergencyMoney;

	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, String phoneNum, int emergencyMoney) {
		super(name, age, address, phoneNum);
		this.emergencyMoney = emergencyMoney;
	}
	
	@Override
	void work() {
		System.out.println(name + "하루 종일 일을 한다");
	}
	@Override
	void sleep() {
		System.out.println(name + "잠을 설친다");
	}
	@Override
	void eat() {
		System.out.println(name + "야식을 먹는다");
	}
	
}
