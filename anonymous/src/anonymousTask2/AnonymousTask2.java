package anonymousTask2;

import java.util.Scanner;

public class AnonymousTask2 {
	public static void main(String[] args) {
		MyInter myInter = new MyInter() {
		// ↑ 인터페이스를 객체화 할 땐 
		
		// ↓ 오버라이딩 해야만 메모리에 부족한 것들이 다 채워진다.
			@Override
			public void getString(String content) {
				String result = "";
				for(char c : content.toCharArray()) {
					result += (char)(c > 'B' ? c + 1 : c);
				}
				System.out.println(result);
			}

			@Override
			public String changeUpperOrLower(String content) {
				String result2 = "";
				for(int i = 0; i < content.length(); i++) {
					if(content.charAt(i) >= 97 &&  content.charAt(i) <= 'z') {
						result2 += (char)(content.charAt(i) - 32);
					} else if(content.charAt(i) >= 65 &&  content.charAt(i) <= 'Z') {
						result2 += (char)(content.charAt(i) + 32);
					}
				}
				return result2;
			}
		};
		
		
		myInter.getString("ABCD");
		System.out.println(myInter.changeUpperOrLower("abCDefG"));
	}
}
