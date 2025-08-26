package castingTask1;

// 뽀로로와 같이 놀기 (클래스 4개)
// 1. Baeseungwon
// 2. Crong
//	- 배승원과 크롱이 블록놀이를 한다!
// 3. Loopy
//	- 배승원과 루피가 군침 싹 돌면서 논다!
// 4. Proro
//	- 배승원과 뽀로로가 눈싸움을 한다!

// 클래스별로 각각 다르게 출력해야 하는데, 매번 다른걸 입력할 수 없기에 한 번에 처리하려고 업캐스팅할 클래스를 만든다

public class CastingTask1 {
	
	
	
	
	public static void main(String[] args) {
		new BaeSeungWon().play(new Crong());
	    new BaeSeungWon().play(new Loopy());
	    new BaeSeungWon().play(new Pororo()); 
	}
}
