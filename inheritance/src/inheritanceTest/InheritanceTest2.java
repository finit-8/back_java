package inheritanceTest;

class AA {
   void paint() {
      System.out.print("A");
      draw();
   }
   
   void draw() {
      System.out.print("B");
   }
}


class BB extends AA {
   @Override
   void paint() {
      super.draw();
      System.out.print("C");
      this.draw();
   }

   @Override
   void draw() {
      System.out.print("D");
   }
}

public class InheritanceTest2 {
   public static void main(String[] args) {
      BB b = new BB();
      b.paint();
      b.draw();
   }

}