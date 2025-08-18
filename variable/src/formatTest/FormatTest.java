package formatTest;

public class FormatTest {
	public static void main(String[] args) {
// 		서식 문자(format)
//		   반드시 따옴표 안에서 작성한다.
//		   
//		   %d : decimal(10진수 정수)
//		   %o : octal(8진수 정수)
//		   %x : hexadecimal(16진수 정수)
//		   %f : float(실수)
//		   %c : character(문자)
//		   %s : string(문자열)
		
		String name = "박웅규";
		int age = 29;
		double height = 183.7;

		System.out.println("저의 이름은 " + name + "입니다.");
		System.out.printf("저의 이름은 %s입니다.", name); 
		System.out.println("");
		System.out.printf("저의 이름은 %s, 나이는 %d, %f cm입니다.", name, age, height);
		System.out.printf("저의 이름은 %s, 나이는 %d, %.2f cm입니다.", name, age, height);
	}
}
