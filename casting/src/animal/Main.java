package animal;

public class Main {
	public static void main(String[] args) {
//		Animal[] animal = new Animal[2];
//		for(int i = 0; i < animal.length; i++) {
//			if(i % 2 == 0) {
//				animal[i] = new Dog("도기", "슈나우저", 2);
//			} else if(i % 2 == 1){
//				animal[i] = new Cat("짬타", "돼냥이", 5);
//			}
//				animal[i].sound();
//			if(animal[i] instanceof Dog) {
//				Dog dog = (Dog) animal[0];
//				dog.fetch();
//			} else if(animal[i] instanceof Cat) {
//				Cat cat = (Cat) animal[1];
//				System.out.println(cat.scratch());
//			}
//		}
		
		Animal dog = new ActionOfAnimal().action(new Dog("연탄이", "시바이누", 7));
		Animal cat = new ActionOfAnimal().action(new Cat("남이", "러시안블루", 7));
		
	}
}
