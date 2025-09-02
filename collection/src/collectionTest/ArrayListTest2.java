package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest2 {
   public static void main(String[] args) {
      ArrayList<Integer> datas = new ArrayList<Integer>();
      System.out.println(datas.size());
//      .add(값)
      datas.add(10);
      datas.add(30);
      datas.add(50);
      datas.add(60);
      datas.add(40);
      datas.add(20);
      datas.add(70);
      datas.add(80);
      datas.add(90);
      try {
         System.out.println(datas.get(0));
      } catch (IndexOutOfBoundsException e) {
         System.out.println("ArrayList2 예외 발생");
         System.out.println("인덱스 범위를 똑바로 작성하세요!");
      } catch (Exception e) {
         e.printStackTrace();
      }
      
//      실습
//      추가(삽입)
//      50뒤에 500을 삽입
      Collections.shuffle(datas);
      if(datas.contains(50)) {
         datas.add(datas.indexOf(50) + 1, 500);
      }
      
      
//      수정
//      90을 9로 수정
      int prev = 0;
      try {
         if(datas.contains(90)) {
            prev = datas.set(datas.indexOf(90), 9);
            System.out.println("수정 완료!");
         }
      } catch (IndexOutOfBoundsException e) {
         System.out.println("인덱스 똑바로 삽입!");
      } catch (Exception e) {
         e.printStackTrace();
      }
      
//      삭제
//      80을 삭제
//      1. 인덱스 삭제
//      if(datas.contains(80)) {
//         datas.remove(datas.indexOf(80));
//      }
      
//      2. 값으로 삭제
      if(datas.contains(80)) {
//			datas.remove(80);	// 매개변수를 값으로 안보고 인덱스로 보고있음. Object클래스와 Integer클래스가 동급이고 int는 기본자료형으로 급이 다르니까,
								// 진짜 값으로 보려면 int를 Integer클래스로 형변환 해줘야된다. remove()메서드 ctrl space하면 오브젝트랑 인트형 두 가지로 오버로딩 되어있음
//         정수 -> 정수
//         Wrapper Class
         datas.remove(Integer.valueOf(80));
      }
      System.out.println(datas);
      
   }
}








