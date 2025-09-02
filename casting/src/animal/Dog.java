package animal;

public class Dog extends Animal{
	public Dog() {;}
	public Dog(String name, String kindOf, int age) {
		super(name, kindOf, age);
	}
	
	@Override
	public void sound() {
		System.out.println(getName() + "가 Woof 하고 웁니다");
	}
	
	public void fetch() {
		System.out.println("Dog fetches the ball!");
	}
	
}
