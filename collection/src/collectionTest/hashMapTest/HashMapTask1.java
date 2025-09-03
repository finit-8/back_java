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
		
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		while(userMapIter.hasNext()) {
			Entry<String, Object> entry = userMapIter.next();
//			System.out.println(entry.getValue());
			ArrayList<Object> arrValue = entry.getValue();
//			arrValue.entry.getValue();
		}
//	어떻게 entry.getValue()의 반환 타입을 Object로 알고 ArrayList에 제네릭으로 <Object>를 준거지?
//	내가 HashMap 객체 생성할 때 벨류의 제네릭으로 Object줌..ㅋㅋ
	}
}
