package anonymousTask;

public class Starbucks1 {
	public static void main(String[] args) {
		Form form = new Form() {
			
			private String[] menus;
	     
			public String[] getMenus() {
				return menus;
			}

			public void setMenus(String[] menus) {
				this.menus = menus;
			}
		
			
			@Override
			public void showMenus() {
				// 방법 1.
				for(int i = 0; i < menus.length; i++) {     
					if(i != menus.length - 1) {
					// 0			3
					// 1			3
					// 2			3
					System.out.print(menus[i] + ", ");
					} else {
						System.out.println(menus[i]);
					}
			}
			
				// 방법 2.
				for(String menu : getMenus()) {
					System.out.println(menu);
				}
			 }
			 
			 @Override
			 public void sell(String menu) {
			    for(String menus: getMenus()) {
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
			 // 방법 1.
//	        	 for(String menu : menus) {        		 
//	        		 System.out.println(menu + "를 메뉴에 등록했습니다.");
//	        	 }
			 
			 // 방법 2.
				 this.setMenus(menus);
			 }
		};
      
      
//      Form 메서드를 선언 후 메서드 1번씩 모두 사용하기
		String[] menus = {"아포가토", "자바칩 프라푸치노", "아메리카노", "카페라떼"};
		form.registerMenus(menus);
		        
		form.showMenus();
		form.sell("아포가토");
		form.sell("포테이토");
      
      
   }
}








