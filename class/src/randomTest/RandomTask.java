package randomTest;

import java.util.Random;

//* 로또 번호를 추첨하는 기능
//1. 반복되는 코드를 반복문으로
//2. 메서드로 생성
//3. 6개를 배열로 리턴
//4. 메인 메서드에서 사용 
public class RandomTask {
   
   int[] getLottoNumbers() {
      Random random = new Random();
      int[] numbers = new int[6];
      for(int i = 0; i < 6; i++) {
         numbers[i] = random.nextInt(46);
      }
      return numbers;
   }
   
   public static void main(String[] args) {
      RandomTask rk = new RandomTask();
      int[] numbers = rk.getLottoNumbers();
      for(int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      }
   }
}








