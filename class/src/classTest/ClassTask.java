package classTest;

// 동물(ClassTask)
// 이름(name), 나이(age), 먹이(feed)
// 추상화
// 기본 생성자, 초기화 생성자
// 토끼 강아지 고양이 객체생성

public class ClassTask {		
	String name;
	String feed;
	int age;
	
//	public ClassTask() {;}
	
	public ClassTask(String name, String feed, int age) {
		this.name = name;
		this.feed = feed;
		this.age = age;
	}
	
	public static void main(String[] args) {
		ClassTask dog = new ClassTask("연탄", "사료", 7);
		ClassTask rabbit = new ClassTask("토깽", "풀", 3);
		ClassTask cat = new ClassTask("양오", "캣닢", 2);
		
		System.out.println(dog.name + dog.feed + dog.age);
		System.out.println(rabbit.name + rabbit.feed + rabbit.age);
		System.out.println(cat.name + cat.feed + cat.age);
		
	}


}
