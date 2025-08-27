package marker;

public class MarkerTest {
	// 어떤 동물이 어떤 분류인지 알려주는 메서드
	// 초식이면 초식, 육식이면 육식, 잡식이면 잡식 리턴
	
	// 알고리즘: 인터페이스 초식 육식 > 클래스 애니멀 > 클래스 각 동물 
	// 		동물이 뭐가 들어올지 모르니까 모든 동물을 받아야 하므로, 모든 동물마다 공통으로 있는 애니멀 클래스를 매개변수로 준다.
	
	public void chekKinds(Animal[] animals) {
		for(Animal animal : animals) {
			if(animal instanceof HervivoreMarker) {
				System.out.println("초식");			
			} else if(animal instanceof CarnivoreMarker) {
				System.out.println("육식");
			} else {
				System.out.println("잡식");
			}
		}
	}
	
	// 메서드 완성 후 각 동물들을 객체화 시킨 후 메서드 확인 출력
	// 알고리즘: 모든 동물 객체화를 어떻게 하지?		==>		 배열로
	public static void main(String[] args) {
		Animal[] animals = {
				new Dog(),
				new Cat(),
				new Cow(),
				new Bear(),
				new Tiger(),
				new Rabbit()
		};
		
		MarkerTest mt = new MarkerTest();
		mt.chekKinds(animals);
	}
}
