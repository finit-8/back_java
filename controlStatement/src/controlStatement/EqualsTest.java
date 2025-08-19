package controlStatement;

// 문자열 메서드
// .equals(): 문자열 값끼리 비교하는 메서드
// == : 주소를 비교하는 연산자
public class EqualsTest {
	public static void main(String[] args) {
	   System.out.println(10 == 10);
	   System.out.println('A' == 'A');
	   System.out.println("B" == "B");
	   
	   String name1 = "홍길동", name2 = "홍길동";
	   System.out.println(name1 == name2);	// true				
	   						// ↑ 주소를 비교하지만 자바의 특성으로 힙메모리의 스트링풀에 저장돼서 같은 객체를 참조한다.
	   System.out.println(name1 == new String("홍길동"));
	   System.out.println(name1.equals(new String("홍길동")));
	}
}
