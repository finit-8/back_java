package animal;

public class Animal {
	private String name;
	private String kindOf;
	private int age;
	
	public Animal() {;}
	public Animal(String name, String kindOf, int age) {
		super();
		this.name = name;
		this.kindOf = kindOf;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKindOf() {
		return kindOf;
	}
	public void setKindOf(String kindOf) {
		this.kindOf = kindOf;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sound() {
		System.out.println("Some animal sound");
	}
	
	
}
