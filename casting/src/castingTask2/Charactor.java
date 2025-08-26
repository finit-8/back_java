package castingTask2;

public class Charactor {
   String name;
   int level;
   int hp;
   String job;
   
   static {
      System.out.println("캐릭터가 생성되었습니다.");
   }
   
   {
      this.level = 1;
      this.hp = 10;
   }
   
   public Charactor() {;}
   public Charactor(String name, String job) {
      this.name = name;
      this.job = job;
   }

   void hunt(Monster monster) {
      if(monster instanceof Orc) {
         Orc orc = (Orc)monster;
         orc.dropItem();
         orc.speak();
      }else if(monster instanceof Fairy) {
         Fairy fairy = (Fairy)monster;
         fairy.dropItem();
         fairy.crying();
      }else if(monster instanceof Human) {
         Human human = (Human)monster;
         human.dropItem();
         human.cliche();
      }
      
   };
}






