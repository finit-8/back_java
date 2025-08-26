package castingTask1;

public class BaeSeungWon {
   String name;
   int age;
   String hobby;
   
   public BaeSeungWon() {;}
   public BaeSeungWon(String name, int age, String hobby) {
      this.name = name;
      this.age = age;
      this.hobby = hobby;
   }
   
//   놀고!
   void play(Friend friend) {							// 업캐스팅을 매개변수로 받음
      if(friend instanceof Crong) {
         Crong crong = (Crong)friend;
         friend.withPlay();
         crong.speak();
         
      }else if(friend instanceof Loopy){
         Loopy loopy = (Loopy)friend;
         friend.withPlay();
         loopy.sleep();
         
      }else if(friend instanceof Pororo) {
         Pororo pororo = (Pororo)friend;
         friend.withPlay();
         pororo.joy();
         
      }else {
         
      }
   }
   
   
//   먹고!
   void eat() {};
//   자고!
   void sleep() {};
}




