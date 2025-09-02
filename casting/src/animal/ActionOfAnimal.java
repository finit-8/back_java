package animal;

public class ActionOfAnimal {
	Animal action (Animal animal) {
		if(animal instanceof Dog) {
			animal.sound();
			Dog dog = (Dog) animal;
			dog.fetch();
		} else if(animal instanceof Cat) {
			animal.sound();
			Cat cat = (Cat) animal;
			cat.scratch();
		}
		return animal;
	}
}
