package castingTask2;

public class Monster {
   String name;
   String item;
   int hp;
   
   public Monster() {;}
   public Monster(String item) {	// 필요한거만 쓰려고 오버로딩
      this.item = item;
   }
   public Monster(String name, String item, int hp) {	// 부모에서 초기화해서 자식클래스에서 초기화생성자 선언 안해도 됨
      this.name = name;
      this.item = item;
      this.hp = hp;
   }
   
   void dropItem() {
      System.out.println(this.item + "을 드랍했습니다.");
   }
   
}