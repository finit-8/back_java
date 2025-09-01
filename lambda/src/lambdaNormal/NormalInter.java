package lambdaNormal;


// 5개 숫자를 무작위로 전달해서 두 수를 더한 결과를 무조건 짝수로 만들어주는 메서드
// ex) 11 17 15 24 10
@FunctionalInterface
public interface NormalInter {
   public int getRandomEven(int[] randomArr); 
}