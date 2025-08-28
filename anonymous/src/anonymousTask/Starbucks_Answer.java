package anonymousTask;

public class Starbucks_Answer {
   
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
            for(String menu: this.getMenus()) {
               System.out.println(menu);
            }
         }
         
         @Override
         public void sell(String menu) {
            for(String m: this.getMenus()) {
               if(menu.equals(m)) {
                  System.out.println("판매 완료");
                  break;
               }else {
                  System.out.println("판매 준비중");
                  break;
               }
            }
         }
         
         @Override
         public void registerMenus(String[] menus) {
            this.setMenus(menus);
         }
      };
      
      
//      Form 메서드를 선언 후 메서드 1번씩 모두 사용하기
      String[] menus = {"아포가토", "자바칩 프라푸치노", "아메리카노", "카페라떼"};
      form.registerMenus(menus);
      
      form.showMenus();
      form.sell("김치");
      form.sell("아메리카노");
      
      
   }
}








