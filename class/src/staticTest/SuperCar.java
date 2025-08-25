package staticTest;

import java.util.Scanner;

public class SuperCar {
//   브랜드
   String brand;
//   색상
   String color;
//   가격
   long price;
//   엔진
   boolean engine;
//   비밀번호
   String password;
//   비밀번호 오류 횟수
   int errorCount;
   
//   스태틱 블록
   static {										// 클래스가 메모리에 로딩될 때 단 한 번만 실행
      System.out.println("출고 축하합니다~!");		// 클래스 변수(static 변수) 초기화나 클래스 전체 초기 설정에 주로 사용.
   }											// 객체를 생성하지 않아도 실행됨.
   
//   초기화 블록							
   { 									// 객체가 생성될 때 생성자보다 먼저 실행되는 블록으로
	      this.password = "0000";		// 주로 모든 생성자에서 공통적으로 수행할 초기화 코드를 넣을 때 사용.
   }									// 객체마다 실행되므로 인스턴스 변수 초기화에 적합.
 
   
//   기본 생성자
   public SuperCar() {;}
   
//   초기화 생성자
   public SuperCar(String brand, String color, long price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }
   
// 초기화 생성자 오버로딩
   public SuperCar(String brand, String color, long price, String password) {
      this.brand = brand;
      this.color = color;
      this.price = price;
      this.password = password;
   }
      
   public boolean checkPassword(String password) {
      return this.password.equals(password);
   } 
   
   public void engineStart() {
      this.engine = true;
   }
   
   public void engineStop() {
      this.engine = false;
   }
   
   
   public static void main(String[] args) {
      SuperCar ferrari = new SuperCar("Ferrari", "Red", 700_000_000, "5175");      
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      String password = null;
      
      while(true) {
         System.out.println("1.시동 켜기\n2.시동 끄기");
         choice = sc.nextInt();
         
         if(choice == 1) {
            if(!ferrari.engine) {
               System.out.println("비밀번호: ");
               password = sc.next();
               if(ferrari.checkPassword(password)) {
                  ferrari.errorCount = 0;
                  ferrari.engineStart();
                  System.out.println(ferrari.brand + "시동 켜짐!");
               }else {
                  ferrari.errorCount++;
                  if(ferrari.errorCount > 2) {
                     System.out.println("경찰 출동!!!!");
                     break;
                  }
               }  
            }else {
               System.out.println(ferrari.brand + "시동이 켜져 있습니다.");
            }
         }else if(choice == 2) {
            if(ferrari.engine) {
               ferrari.engineStop();
               System.out.println(ferrari.brand + "시동 꺼짐.");
            }else {
               System.out.println(ferrari.brand + "시동이 이미 켜져있습니다.");
            }
         }else{
            System.out.println("잘못 입력하셨습니다.");
            continue;
         }
         
      }
      
      
   }
   
}












