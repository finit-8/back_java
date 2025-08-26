package classTask;

// 1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
// 2. 클래스로 리턴
// 3. 메인 메서드에서 메서드 사용
public class ClassTask4 {
   Result getMaxAndMin(int[] arData) {
	   Result result = new Result(arData[0], arData[0]);
      for(int i = 0; i < arData.length; i++) {
         if(result.min > arData[i]) { result.min = arData[i]; };
         if(result.max < arData[i]) { result.max = arData[i]; };
      }
      return result;
   }
   
   public static void main(String[] args) {
      ClassTask4 ct4 = new ClassTask4();
      int[] arData = {1, 3, 5, 9, 0};
      Result result = ct4.getMaxAndMin(arData);
      System.out.println(result.min);
      System.out.println(result.max);
   }
   
}
