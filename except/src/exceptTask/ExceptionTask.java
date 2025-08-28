package exceptTask;

import java.util.Scanner;

public class ExceptionTask {
   
//   5개의 정수만 입력 받기
//   - 무한 입력 상태로 구현하기
//   - q 입력 시 나가기
//   - 각 정수는 배열에 담기
//   - if문은 한 번만 사용하기
   
   public static void main(String[] args) {
      String expression = null;
      String message = "정수 5개를 순서대로 입력하세요.", exampleMessage = "번 째 정수";
      int count = 0;
      int[] arData = new int[5];
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         try {
            count++;
            
            if(count > 5) {									// 6번째 정수 입력 안받고 종료시키고 싶을 때 일부러 예외발생
               throw new ArrayIndexOutOfBoundsException();
            }
            
            System.out.println(count + exampleMessage);
            expression = sc.nextLine().trim();				// trim (트림을 한다 = 가스)를 뺀다.
            
            if(expression.equals("q")) {
               break;
            }
            
            arData[count - 1] = Integer.parseInt(expression);
         } catch (NumberFormatException e) {
            System.out.println("정수만 입력하세요.\nex)10");
            count--;
         } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5개 정수를 모두 입력하셨습니다.");
            for(int data: arData) {
               System.out.print(data + " ");
            }
            break;	// while 빠져나감
         } catch (Exception e) {
            System.out.println("ExceptionTask 예외 발생");		// ★★★ 어디 클래스에서 발생했는지 찾을 수 있게 적어놓는다.
            System.out.println("알 수 없는 예외 발생!");
            e.printStackTrace();
         }         
      }
      
   }
}










