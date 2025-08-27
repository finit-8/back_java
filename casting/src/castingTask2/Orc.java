package castingTask2;

public class Orc extends Monster{
   
//   {
//      this.name = "오크";
//      this.item = "도끼";
//      this.hp = 10;
//   }
   
   public Orc() {
	   super("오크", "도끼", 10);
   }
   public Orc(String name, String item, int hp) {
      super(name, item, hp);
   }
   
   void speak() {
      System.err.println("콜록!");
   }
   
}