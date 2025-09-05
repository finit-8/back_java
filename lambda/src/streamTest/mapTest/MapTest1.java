package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest1 {
   public static void main(String[] args) {
      
      ArrayList<User> users = new ArrayList<User>(); 
      
      User user1 = new User(1L, "홍길동", 17, "개발자");
      User user2 = new User(2L, "장보고", 20, "기획자");
      User user3 = new User(3L, "이순신", 35, "디자이너");
      User user4 = new User(4L, "이성계", 42, "개발자");
      User user5 = new User(5L, "이태희", 22, "사장");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);      
      users.stream().map((user) -> user.getName()).forEach((name) -> {System.out.println(name);});
      
      System.out.println();

      ArrayList<Integer> datas1 = new ArrayList<Integer>();
      IntStream.rangeClosed(1, 10).forEach((n) -> datas1.add(n));
//      System.out.println(datas1);
      datas1.stream().map((n) -> {return (int)n * 10;}).forEach(System.out::print);
      
      System.out.println();
      System.out.println();

      
//    2. .map()
//    ArrayList의 값을 알파벳으로 바꿔서 출력하기
//    ex)원본 [1, 2, 3, 4, 5, ..., 10]
//    ex)변경 ['A', 'B', 'C', ... 'J']
      ArrayList<Integer> alphabet = new ArrayList<Integer>();
      IntStream.rangeClosed(1, 10).forEach((n) -> {alphabet.add(n);});
      alphabet.stream().map((n) -> {return (char)((int)n + 64);}).forEach((c) -> {System.out.print(c);});		// 인티저 받고, 인티저에 += 64
   }
}
