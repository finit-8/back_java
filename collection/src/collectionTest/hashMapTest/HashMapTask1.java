package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

// HashMap 자료구조 변경 실습1
//"street": "Victor Plains",
//"suite": "Suite 879",
//"city": "Wisokyburgh",
//"zipcode": "90566-7771",
//"lat": "-43.9509",
//"lng": "-34.4618"

// value들만 ArrayList로 변경 후 출력

public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("street", "Victor Plains");
		userMap.put("suite", "Suite 879");
		userMap.put("city", "Wisokyburgh");
		userMap.put("zipcode", "90566-7771");
		userMap.put("lat", "-43.9509");
		userMap.put("lng", "-34.4618");
		System.out.println(userMap);
		
		// 방법1.
		System.out.println("방법1" + new ArrayList(userMap.values()));	// 제네릭 안주면 원시타입(Object타입 자동으로 줌)
		
		// 방법2.
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		ArrayList<Object> arrValue = new ArrayList<Object>();
		//	어떻게 entry.getValue()의 반환 타입을 Object로 알고 ArrayList에 제네릭으로 <Object>를 준거지?
		//	내가 HashMap 객체 생성할 때 벨류의 제네릭으로 Object줌..ㅋㅋ
		
		while(userMapIter.hasNext()) {
			Entry<String, Object> entry = userMapIter.next();
//			System.out.println(entry.getValue());
			arrValue.add(entry.getValue());
		}
		System.out.println("방법2" + arrValue);
		
		// 불가능.
//		Iterator<Entry<String, Object>> userMapIter2 = userMap.entrySet().iterator();
//		while(userMapIter2.hasNext()) {
//			Entry<String, Object> entry = userMapIter2.next();
////			System.out.println(entry.getValue());
//		
//			ArrayList<Object> arrayList = new ArrayList<Object>();		// 반복 돌 때 마다 객체화돼서 앞선 객체의 값은 없어져서 절대 불가 
//			arrayList.add(entry.getValue());
//			System.out.println("방법3" + entry.getValue().getClass());		// 타입 출력확인
//			System.out.println("방법3" + entry.getValue());
//		}
	}
}
