package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
		MyInter myInter = new MyInter() {
			
			@Override
			public void getString(String content) {
				String result = "";
				for(int i = 0; i < content.length(); i++) {
					if(content.charAt(i) == 'C') {
						result += (content.charAt(i) +1);
					}
				}
				System.out.println(result);
			}

			@Override
			public String changeUpperOrLower(String content) {
				return null;
			}
		};
		
		
		myInter.getString("ABCD");
	}
}
