package anonymousTask;

public class Starbucks {
   
	private String[] menus = {"아포가토", "자바칩 프라푸치노", "아메리카노", "카페라떼"};

	
	public String[] getMenus() {
		return menus;
	}


	public void setMenus(String[] menus) {
		this.menus = menus;
	}


public static void main(String[] args) {
      Form form = new Form() {				// 내부클래스 ??? 메인메서드 안에 내부클래스 선언 가능해?
         
         private String[] menus;
         
         @Override
         public void showMenus() {
            for(int i = 0; i < menus.length; i++) {          
            	if(i != menus.length - i) {
            	// 0			4	- 0
            	// 1			4	- 1
            	// 2			4	- 2
            	// 3			4	- 3
            		System.out.print(menus[i] + ", ");
            	}
            }
         }
         
         @Override
         public void sell(String menu) {
            
         }
         
         @Override
         public void registerMenus(String[] menus) {
        	 for(String menu : menus) {        		 
        		 System.out.println(menu + " 를 메뉴에 등록했습니다.");
        	 }
         }
      };
      
      
//      Form 메서드를 선언 후 메서드 1번씩 모두 사용하기
      form.registerMenus(this.getMenus);
      
      form.showMenus();
      
      
   }
}








