package staticTest;

public class Employee {
	// 필드
	// 회사의 돈(money)
	// 이름(name), 나이(age), 수익(income)
	// 회사원들이 벌어온 수익을 모두 회사의 돈(money)에 합치고,
	// 회사의 돈 출력
	
	static int money;
	String name;
	int age;
	int income;
			
	
	public Employee() {;}
	public Employee(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
		money += this.income;
	}
	
	void printCompanyMoney() {
		System.out.println(money);
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("박웅", 29, 300000);
		Employee employee2 = new Employee("이승찬", 27, -100_000);
	    Employee employee3 = new Employee("송병국", 27, -10_000);
	    Employee employee4 = new Employee("배승원", 30, 150_000);

//		Employee.money = employee1.income + employee2.income + employee3.income + employee4.income;
//		System.out.println(Employee.money);
		
		employee1.printCompanyMoney();
	}
}
