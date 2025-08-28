package anonymousTask;


public class MathField {
   public static void main(String[] args) {
      
//      메서드 구현 후 4개의 메서드 모두 사용


	   MathTask mathTask = new MathTask() {		// 익명 내부 클래스
         
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
        	 CalcResult calcResult = new CalcResult();
        	 calcResult.setAdd(num1+num2);
        	 calcResult.setDevide(num1/(double)num2);
        	 calcResult.setMurtiple(num1*num2);
        	 calcResult.setSubtract(num1-num2);
        	 return calcResult;
         }
         
         @Override
         public int add(int num1, int num2) {
            return num1 + num2;
         }
      };
      
      mathTask.printName("박웅");
      System.out.println(mathTask.concat("성", "이름"));
      System.out.println(mathTask.add(1, 7));
      
      System.out.println("");
      
      System.out.println(mathTask.calc(3, 9).getAdd());
      System.out.println(mathTask.calc(3, 9).getDevide());
      System.out.println(mathTask.calc(3, 9).getSubtract());
      System.out.println(mathTask.calc(3, 9).getMurtiple());
   }
}
