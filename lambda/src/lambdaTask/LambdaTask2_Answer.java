package lambdaTask;
//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"


public class LambdaTask2_Answer {
 public static void main(String[] args) {
//    객체화
    PrintNum printNum = () -> {
       for(int i = 0; i < 10; i++) {
          System.out.println(i + 1);
       }
    };
    
//    printNum.printUpTo10();
    
    PrintString printString = (content, findC) -> {
       int count = 0;
       for(char c: content.toCharArray()) {
          if(c == findC) {
             count++;
          }
       }
       return count;
    };
    
//    System.out.println(printString.strCount("aaabcd", 'a'));
    
    Reverse reverse = (content) -> {
       String result = "";
       for(int i = 0; i < content.length(); i++) {
          result += content.charAt(content.length() - 1 - i);
       }
       return result;
    };
    
//    System.out.println(reverse.reverseString("abcde"));
    
    Remove remove = (content, c) -> {
//       return content.replaceAll(String.valueOf(c), "");
       String result = "";
       for(char charactor : content.toCharArray()) {
          if(charactor == c) {
             continue;
          }
          result += charactor;
       }
       return result;
    };
    
//    System.out.println(remove.removeStr("abcdabcd", 'a'));
    Dedupe dedupe = (content) -> {
       String result = "";
       for(int i = 0; i < content.length(); i++) {
          if(!result.contains(String.valueOf(content.charAt(i)))) {
             result += content.charAt(i);
          }
       }
       return result;
    };
    
    System.out.println(dedupe.getDedupe("abcdabcd"));
    
 }
}















