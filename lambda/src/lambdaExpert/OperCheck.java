package lambdaExpert;

@FunctionalInterface
public interface OperCheck {
//   사용자의 수식중 연산자만 분리해주는 메서드
   public String[] getOpers(String expression);
}
