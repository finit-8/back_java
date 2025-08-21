package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		// 값을 알고 있을 때
		int[] arrData1 = {1, 2, 3, 4};
		System.out.println(arrData1); // 해시 = jvm이 관리하는 주소
		System.out.println(arrData1[0]); // [인덱스]로 값을 들고옴
		
		// 값은 모르고, 칸만 알고 있을 때
		int[] arrData2 = new int[5];
		System.out.println(arrData2); // 해시
		System.out.println(arrData2[2]);
		
		// 값, 칸 둘 다 모를 때
		int[] arrData3 = null; // null: 주소의 초기값 (내가 몇 칸을 만들지, 언제 만들지 모르지만, 
								// 					참조래퍼런스를 쓸 거 같아서, 선언할때 주소를 대체하기 위해 null입력)	
		
		
		
		// 변수, 값 구분
	    // 저장공간: 6개, 값: 11개
		 int[] arData = new int[100];
	      int result = 0;
	      for(int i = 0; i < arData.length; i++) {		// i < ar.Data.length 논리값, i++ 증감연산이 된 값
	         arData[i] = i + 1;							
	      }
	      
	      for(int i = 0; i < arData.length; i++) {
	         if(i % 2 != 0) {							// 논리식 boolean값
	            result += i;
	         }
	      }
	}
}
