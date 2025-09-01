package lambdaExpert;

import java.util.Scanner;

//   [심화 실습]
//   여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//   
//   입력 예1) 7 + 35 - 9
//   출력 예1) 33
//   
//   입력 예2) -9 + 8 + 10
//   출력 예2) 9
//   
//   * "ABC".split("")은 [공백][A][B][C] 4칸 문자열 배열로 리턴된다.
//      "A,B,C".split(",")은 [공백][A][B][C] 4칸 문자열 배열로 리턴된다.
//      split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
//      구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//      예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//   
//   * 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//   * 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//   * 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//   * 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//   * main메소드에 getOpers를 람다식으로 구현
//   * 첫 번째 정수가 음수일 경우 오류 해결

public class MyMath {
	
//   연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현
	public static Calc calculator(String oper) {
		if(oper.equals("+"))	return (num1, num2) -> num1 + num2;
		if(oper.equals("-"))	return (num1, num2) -> num1 - num2;
		return null;
	}
	   
//	출력 편하게 보려고 임의로 만든 함수 1 (오버로딩 됨)
	public static void showArrData(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 data(string) : " + arr[i]);
		}
	}
//	출력 편하게 보려고 임의로 만든 함수 2 (오버로딩 됨)
	public static void showArrData(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 data(int) : " + arr[i]);
		}
	}
	
//	연산자만 들어있는 배열이 필요할 것 같아 만든 메서드 (메인에서 만든 후 분리 됨)
	public String[] getOperArr(String expression) {
		String[] result = null, tmp = null;
		int arrSize = 0;
		
		tmp = expression.split("");
		
//		연산자만 있는 배열을 만들기 위해 크기를 구하기
		for(int i = 0; i < tmp.length; i++) {
			if(!(tmp[i].charAt(0) >= '0' && tmp[i].charAt(0) <= '9'))	arrSize++;			// 문자열 배열마다 접근해서 첫번째 인덱스에 조건을 걸어 배열크기 증감
		}
//		연산자만 있는 배열의 크기 지정
		result = new String[arrSize];														// 모든 배열 순회하여 증감 완료 후 연산자만 들어있는 문자열 배열 변수의 크기로 사용 
		
//		연산자만 있는 배열에 값을 넣어주기 위한 로직
		for(int i = 0; i < tmp.length; i++) {
			if(tmp[i].equals("-") || tmp[i].equals("+")) {
				for(int j = 0; j < result.length; j++) {
					if(result[j] == null) {
						result[j] = tmp[i];
						break;
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] removedOper = null, operArr = null;
		Scanner sc = new Scanner(System.in);
		String inputString = null;
		int preData = 0, result = 0;
		
		//전체 수식에서 연산자만 분리하는 람다 메서드 구현
		OperCheck operCheck = (String expression) -> {
			String[] resultStrArr = null, tmp = null;
			tmp = expression.split("\\+|\\-");
			resultStrArr = new String[tmp.length - 1];
//		첫 수가 음수인경우와 아닌 경우로 나눠서 로직 동작
			if(expression.charAt(0) == '-') {
				for(int i = 0; i < resultStrArr.length; i++) {
					resultStrArr[i] = tmp[i + 1];
				}				
			} else {
				resultStrArr = tmp;
			}
			return resultStrArr;
		};

//		사용자가 수식을 입력
		inputString = sc.next();
		sc.close();
		
//		1번 조건 : 연산자를 제외한 정수만 갖고 있는 문자열 배열
		removedOper = operCheck.getOpers(inputString);
//		showArrData(removedOper);
		
//		연산자만 있는 배열이 필요해서 임의로 만든 메서드
		operArr = new MyMath().getOperArr(inputString);
//		showArrData(operArr);
		
//		만든 메서드 사용
		for(int i = 0; i < removedOper.length; i++) {
			if(inputString.charAt(0) != '-') {
				if(i == 0)
					preData = Integer.parseInt(removedOper[i]);
				if(i == removedOper.length - 1)	break;
				result = Integer.parseInt(removedOper[i + 1]);
			}
			else	result = Integer.parseInt(removedOper[i]);
			System.out.println("이전 값\t: " + preData);
			System.out.println("연산자\t: " + operArr[i]);
			System.out.println("연산할 값\t: " + result);
			preData = calculator(operArr[i]).calc(preData, result);
			System.out.println("결과\t: " + preData);
			System.out.println();
		}
		
		result = preData;
		
//		결과 출력
		System.out.println("최종 결과 : " + result);
	}
}


//--- 완

//public class MyMath {
//	
////  연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현
//	public static Calc calculator(String oper) {
//		if(oper.equals("+"))	return (num1, num2) -> num1 + num2;
//		if(oper.equals("-"))	return (num1, num2) -> num1 - num2;
//		return null;
//	}
//	   
//	public static void showArrData(String[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i + "번째 data(string) : " + arr[i]);
//		}
//	}
//	public static void showArrData(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i + "번째 data(int) : " + arr[i]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		String[] removedOper = null, inputArr = null, operArr = null;
//		Scanner sc = new Scanner(System.in);
//		String inputString = null;
//		int preNum = 0, curNum = 0, arrSize = 0;
//		
//		//전체 수식에서 연산자만 분리하는 람다 메서드 구현
//		OperCheck operCheck = (String expression) -> {
//			String[] result = null, newArr = null;
//			result = expression.split("\\+|\\-");
//			if(result[0].equals("")) {
//				 result[1] = "-"+result[1];
//				 newArr = new String[result.length - 1];
//				 for(int i = 0; i < newArr.length; i++) {
//					 newArr[i] = result[i+1];
//				 }
//				 result = newArr;
//			}
//			
//			return result;
//		};
//
//
//		//	사용자가 수식을 입력
////		inputString = sc.next();
//		inputString = "-32+13+56-256";
//		sc.close();
//		
//		removedOper = operCheck.getOpers(inputString);
//		showArrData(removedOper);
//		inputArr = inputString.split("");
//		
//		for(int i = 1; i < inputArr.length; i++) {
//			if(!(inputArr[i].charAt(0) >= '0' && inputArr[i].charAt(0) <= '9'))	arrSize++;
//		}
//		operArr = new String[arrSize];
//		for(int i = 1; i < inputArr.length; i++) {
//			if(inputArr[i].equals("-") || inputArr[i].equals("+")) {
//				for(int j = 0; j < operArr.length; j++) {
//					if(operArr[j] == null) {
//						operArr[j] = inputArr[i];
//						break;
//					}
//				}
//			}
//		}
//		for(int i = 0; i < removedOper.length; i++) {
//			if(i == 0) {
//				preNum = Integer.parseInt(removedOper[0]);
//				continue;
//			}
//			curNum = Integer.parseInt(removedOper[i]);
//			preNum = calculator(operArr[i-1]).calc(preNum, curNum);
//		}
//		showArrData(operArr);
//		System.out.println("최종 결과 : " + preNum);
//	}
//}
//



//---미완

//public class MyMath {
//	
////  연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현
//	public static Calc calculator(String oper) {
//		return (num1, num2) -> num1 + num2;
//	}
//	   
//	public void showArrData(String[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i + "번째 data : " + arr[i]);
//		}
//	}
//	public void showArrData(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i + "번째 data : " + arr[i]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		String[] removedOper = null;
//		int[] intArr = null;
//		Scanner sc = new Scanner(System.in);
//		String inputString = null;
//		
//		//전체 수식에서 연산자만 분리하는 람다 메서드 구현
//		OperCheck operCheck = (String expression) -> {
//			String[] splitAll = null, newArr = null;
//			String tmp = "";
//			int arrSize = 0;
//			
//			arrSize = expression.split("\\+|\\-").length - 1;
//			newArr = new String[arrSize];
//			
//			splitAll = expression.split("");
//			for(int i = 0; i < arrSize; i += 0) {
//				for(String data : splitAll) {
//					if(data.equals("+"))	continue;
//					if(data.equals("-")) {
//						tmp = "-";
//					}else {
//						tmp += data;
//						newArr[i++] = tmp;
//						tmp = "";
//					}
//				}
//			}
//			
//			return newArr;
//		};
//
//
//		//	사용자가 수식을 입력
//		//	inputString = sc.next();
//		
//		removedOper = operCheck.getOpers("-1+2-3");
//		intArr = new int[removedOper.length];
//		for(int i = 0; i < removedOper.length; i++) {
//			intArr[i] = Integer.parseInt(removedOper[i]);
//		}
//		new MyMath().showArrData(intArr);
//		for(int i = 0; i < intArr.length - 1; i++) {
//			calculator("+");
//			intArr[i] = Integer.parseInt(removedOper[i]);
//		}
//	}
//}
