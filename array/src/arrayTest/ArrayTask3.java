package arrayTest;

public class ArrayTask3 {
   public static void main(String[] args) {
//      1. 1~20까지 짝수만 배열에 담고 배열 안에 값에 모두 3을 더한 값으로 변경 후 출력하기
	   // 알고리즘: 값을 알고 칸을 알지만, for문으로 짝수만 담기 i += 2 (i += 2를 먼저 선언 후 while도 가능?)
	   //		arr[i] += 3 으로 출력
	   int[] even = new int[10];
	   int i = 0, num = 2;
	   
	   while(num <= 20) {
		   even[i] = num + 3;
		   i++;
		   num += 2;
	   }
	   for(int val : even) {
		   System.out.println(even[val]);
	   }
	   
//	   int result = 0;
//	   int[] even = new int[20];
//	   for(int i = 0; i < even.length; i += 2) {
//		   even[i] = i + 2;
////		   even[0] = 0 + 2;
////		   even[2] = 2 + 2;
////		   even[4] = 4 + 2;
//		   
//		   result = even[i] += 3;
//		   System.out.println(result);
//	   }
	   
//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
//	   int total = 0, avg = 0;
//	   int[] arr = {10, 20, 30, 40, 50};
//	   for(int i = 0; i < arr.length; i++) {
//		   total += arr[i];
//	   }
//	   avg = total / arr.length;
//	   System.out.println(avg);
	   
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
	   // 알고리즘: for문으로 담고, 삼항으로 5보다 크면, 2배 출력
//	   int[] arr2 = new int[10];
//	   for(int i = 0; i < arr2.length; i++) {
//		   arr2[i] = (i + 1) > 5 ? (i + 1) * 2 : (i + 1);
//		   System.out.println(arr2[i]);
//	   }
	   
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//      단 마지막은 *이 붙지 않는다
	   // 알고리즘: for문으로 담고, if(i != 배열.length -1) 일 때 배열[i] + '*'
//	   int[] arr3 = new int[10];
//	   for(int i = 0; i < arr3.length; i++) {
//		   arr3[i] = i+1;
//		   System.out.print(arr3[i]);
//		   if(i < arr3.length -1) {
//		   System.out.print("*");
//		   }
//	   }
	   
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기 
	   // 알고리즘: for문으로 담고, (i+1)%3==0일 때 누적합
//	   int result2 = 0;
//	   int[] arr4 = new int[10];
//	   for(int i = 0; i < arr4.length; i++) {
//		   arr4[i] = i+1;
//		   if(arr4[i] % 3 == 0) {
//			   result2 += arr4[i];
//		   }
//	   }
//	   System.out.println(result2);
   }
}
