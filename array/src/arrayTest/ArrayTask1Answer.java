package arrayTest;

import java.util.Scanner;

public class ArrayTask1Answer {
   public static void main(String[] args) {
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
//      int[] arData1 = {10, 8, 6, 4, 2};
//      for(int i = 0; i < arData1.length; i++){
//         System.out.println(arData1[i]);
//      }
      
//      int[] arData1 = new int[5];
//      for(int i = 0; i < 5; i++) {
//         arData1[i] = 10 - i * 2;
//         System.out.println(arData1[i]);
//      }
      
//      1~10까지 배열에 담고 출력
//      int[] arData2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      for(int i = 0; i < arData2.length; i++){
//         System.out.println(arData2[i]);
//      }
      
      
//      1~100까지 배열에 담은 후 홀수만 출력
//      int[] arData3 = new int[100];
//      for(int i = 0; i < arData3.length; i++) {
//         arData3[i] = i + 1;
//         if(i % 2 == 0) {
//            System.out.println(arData3[i]);
//         }
//      }
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//      int[] arData4 = new int[100];
//      int total = 0;
//      for(int i = 0; i < arData4.length; i++) {
//         arData4[i] = i + 1;
//      }
//      
//      for(int i = 0; i < arData4.length; i++) {
//         if(i % 2 == 1) {
//            total += arData4[i];
//         }
//      }
//      System.out.println(total);
      
      
//      A~F까지 배열에 담고 출력
//      char[] arData5 = {'A', 'B', 'C', 'D', 'E', 'F'};
//      for(int i = 0; i < arData5.length; i++) {
//         System.out.println(arData5[i]);
//      }
      
//      A~F까지 중 C제외하고 배열에 담은 후 출력
      char[] arData6 = new char[5];
      
      for(int i = 0; i < arData6.length; i++) {
         arData6[i] = (char)('A' + (i > 1 ? i + 1 : i));
         System.out.print(arData6[i]);
      }
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//      Scanner sc = new Scanner(System.in);
//      int[] arData7 = new int[5];
//      String message = "5개 정수를 입력하세요.\nex)10 20 30 40 50";
//      int min = 0, max = 0;
//      
//      System.out.println(message);
//      for(int i = 0; i < arData7.length; i++) {-
//         arData7[i] = sc.nextInt();
//      }
//      
//      min = arData7[0];
//      max = arData7[0];
//      
//      for(int i = 0; i < arData7.length; i++) {
//         if(max < arData7[i]) { max = arData7[i]; }
//         if(min > arData7[i]) { min = arData7[i]; }
//      }
//      
//      System.out.println("최대값: " + max);
//      System.out.println("최소값: " + min);
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
      Scanner sc = new Scanner(System.in);
      int[] arData8 = null;
      String message1 = "정수의 개수: \nex)10";
      int total = 0, length = 0;
      double average = 0.0;
      
      System.out.println(message1);
      length = sc.nextInt();
      arData8 = new int[length];
      
      for(int i = 0; i < arData8.length; i++) {
         System.out.println(i + 1 + "번 째 정수 입력");
         arData8[i] = sc.nextInt();
      }
      
      for(int i = 0; i < length; i++) {
         total += arData8[i];
      }
      
      average = (double)total / length;
      
      System.out.print("[");
      for(int i = 0; i < length; i++) {
         System.out.print(arData8[i]);
         if(i < length - 1) {				
            System.out.print(" ");
         }
      }
      System.out.println("]");
      System.out.println("평균: " + average);
      
   }
}









