package castingTask1;

public class Friend {
   String name;
   int age;
   
   public Friend() {;}
   public Friend(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   void withPlay() {
      System.out.println("친구와 놀기!");
   }
   
}
