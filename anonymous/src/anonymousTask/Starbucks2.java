package anonymousTask;

// static getter setter 사용


public class Starbucks2 {
	// 클래스에서 필드 초기화(프라이빗, static)
	private static String[] menus;
    
	// 클래스에서 setter getter 선언(static)
	public static String[] getMenus() {
		return menus;
	}

	public static void setMenus(String[] menus) {
		Starbucks2.menus = menus;
	}

	
	public static void main(String[] args) {
		// static main메서드에서 객체생성
		Starbucks2 sb = new Starbucks2();
		
		// 방법1. setter로 객체화 - 여기서는 기존 값을 변경한 게 아니라 setter로 바로 초기화 한 것 ??????
		sb.setMenus(new String[]{"콜드브루", "라떼", "아아"});
//		setMenus(new String[]{"콜드브루", "라떼", "아아"}); 		setter와 getter가 static이므로 Starbucks클래스의 참조변수 안붙여도 사용가능
		
		Form form = new Form() {
			
			@Override
			public void showMenus() {
				for(String menu : sb.getMenus()) {		// setter로 초기화 한 값 getter로 가져옴
					System.out.println(menu);
				}
			 }
			 
			 @Override
			 public void sell(String menu) {
			    for(String menus: getMenus()) {			// setter와 getter가 static이므로 Starbucks클래스의 참조변수 안붙여도 사용가능
			    	if(menus == menu) {
			        	System.out.println("판매 완료");
						break;
					} else {
						System.out.println("판매 준비중");
			        	break;
			        }
			    }
			 }
			 
			 @Override
			 public void registerMenus(String[] menus) {
				 sb.setMenus(menus);
			 }
		};
      
      
//      Form 메서드를 선언 후 메서드 1번씩 모두 사용하기
		
		
		// 방법 2. 직접 값 넘겨주기
		String[] menus = {"아포가토", "자바칩 프라푸치노", "아메리카노", "카페라떼"};
		form.registerMenus(menus);
		
		form.registerMenus(getMenus());			// setter와 getter가 static이므로 Starbucks클래스의 참조변수 안붙여도 사용가능
		        
		form.showMenus();
		form.sell("아포가토");
		form.sell("포테이토");
      
      
   }
}








