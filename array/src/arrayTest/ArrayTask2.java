package arrayTest;

import java.util.Scanner;

public class ArrayTask2 {
   public static void main(String[] args) {
//      1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
//      입력 예)안녕hI!!
//      출력 예)안녕Hi!!
       // 알고리즘: 스캐너로 스트링 받고, 
	   //		대소문자 구분조건 (아스키 범위를 이용)주고,
	   // 		대소문자 변환하기 위한 변수 'a'-'A' 선언,
	   //		결과 담을 변수에 담기
	   //		근데 안담기니까
	   //		인덱스로 한글 영어 특수문자 분리 X ---> else if()
	   
	   Scanner sc = new Scanner(System.in);
	   int charValue = 'a' - 'A', numToResult = 0;
	   String message = "문자를 입력해주세요", result = "";
	   
	   
	   System.out.println(message);
	   String str = sc.next();
	   
	   for(int i = 0; i < str.length(); i++) {
		   if(str.charAt(i) >= 97 && str.charAt(i) <= 'z') {
			   numToResult = str.charAt(i) - charValue;
//			   System.out.println((char)numToResult);
		   } else if(str.charAt(i) >= 65 && str.charAt(i) <= 'Z') {
			   numToResult = str.charAt(i) + charValue;
//			   System.out.println((char)numToResult);
		   } else {
			   numToResult = str.charAt(i);
		   }
		   
		   System.out.print((char)numToResult);
	   }
	   
	   
	   
	   
//     2. 정수를 한글로 변경
//     입력 예) 1024
//     출력 예) 일공이사
     String input2 = null, message2 = "정수를 입력하세요.\nex)1024",
           result2 = "", hangle = "공일이삼사오육칠팔구";
     System.out.println(message2);
     input2 = sc.nextLine();
     
     for(int i = 0; i < input2.length(); i++) {
        result2 += hangle.charAt(input2.charAt(i) - 48);
     }
     System.out.println(result2);
     
//     for(int i = 0; i < input2.length(); i++) {
//        int c = input2.charAt(i) - 48;
//        
//        switch (c) {
//        case 1:
//           result2 += "일";
//           break;
//        case 2:
//           result2 += "이";
//           break;
//        case 3:
//           result2 += "삼";
//           break;
//        case 4:
//           result2 += "사";
//           break;
//        case 5:
//           result2 += "오";
//           break;
//        case 6:
//           result2 += "육";
//           break;
//        case 7:
//           result2 += "칠";
//           break;
//        case 8:
//           result2 += "팔";
//           break;
//        case 9:
//           result2 += "구";
//           break;
//        case 0:
//           result2 += "공";
//           break;
//
//        default:
//           result2 += c;
//           break;
//        }
//     }
//     
//     System.out.println(result2);
  }
}