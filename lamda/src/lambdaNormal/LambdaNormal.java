package lambdaNormal;

import java.util.Random;

public class LambdaNormal {
   public static void main(String[] args) {
      Random random = new Random();
      NormalInter normalInter = (randomArr) -> {
         int result = 0;
         for(int i = 0; i < randomArr.length; i++) {
            for(int j = 0; j < randomArr.length; j++) {
               int sumResult = randomArr[i] + randomArr[j];
               if(i == j) { continue;}
               if(sumResult % 2 == 0) {
                  result = sumResult;
                  break;
               }
            }
         }
         
         return result;
      };
      
      int[] randomArr = new int[5];
      
      for(int i = 0; i < randomArr.length; i++) {
         randomArr[i] = random.nextInt(1, 500);
         System.out.println(randomArr[i]);
      }
   
      System.out.println("결과 :" + normalInter.getRandomEven(randomArr));
   }
}
