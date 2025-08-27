package anonymousTask;


public class MathField {
   public static void main(String[] args) {
      
//      메서드 구현 후 4개의 메서드 모두 사용

// 		인터페이스(부모), 필드 클래스에서 출력, 자식 클래스에서 

	   MathTask mathTask = new MathTask() {
         
         @Override
         public void printName(String name) {
            System.out.println(name);
         }
         
         @Override
         public String concat(String str1, String str2) {
            return str1 + str2;
         }
         
         @Override
         public CalcResult calc(int num1, int num2) {

        	 return null;
         }
         
         @Override
         public int add(int num1, int num2) {
            return num1 + num2;
         }
      };
      
      mathTask.printName("박웅");
      mathTask.concat("성", "이름");
      mathTask.calc();
      mathTask.add(1, 7);
      
      
      
   }
}
