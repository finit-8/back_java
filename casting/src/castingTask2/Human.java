package castingTask2;

public class Human extends Monster{
   {
      this.name = "휴먼";
      this.item = "골드";
      this.hp = 1;
   }
   
   public Human() {;}
   
   void cliche() {
      System.out.println("해치웠나..?");
   }
}
