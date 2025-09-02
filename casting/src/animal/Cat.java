package animal;

public class Cat extends Animal{
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String kindOf, int age) {
		super(name, kindOf, age);
	}	
	
	@Override
	public void sound() {
		System.out.println(this.getName() + "가 Meow! 하고 털을 세웁니다.");
	}
	
	public void scratch() {
		System.out.println("Cat scratches the sofa");
	}
}
