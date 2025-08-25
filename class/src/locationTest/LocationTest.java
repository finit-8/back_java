package locationTest;

// 생성자의 매개변수로 주소값을 사용하는 이유 : 생성자에서 값을 바꿀 수 있기 때문! (그냥 값을 사용해서 생성자에 넘기면 값을 못바꿈) 
public class LocationTest {
//   int test(int data) {
//      data = 20;
//      return data;
//   }
   
   int[] test(int[] data) {
      data[0] = 20;
      return data;
   }
   
   public static void main(String[] args) {
      LocationTest ts = new LocationTest();
//      int data = 50;
//      ts.test(data);
//      System.out.println(data);
      
      int[] data = {50};
      ts.test(data);
      System.out.println(data[0]);
      
   }
   
}
