package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	// 기존 데이터에 있으면 수정, 없으면 추가하는 문법
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "pwg223");
		userMap.put("name", "박웅규");
		userMap.put("password", "1234");
		userMap.put("age", 30);
		userMap.put("rich", true);
		
		System.out.println(userMap);				// HashMap은 {}형태
		System.out.println(userMap.get("age"));
		System.out.println(userMap.entrySet());		// HashMap-->Set변환돼서 []형태
		// 제네릭에 Entry가 없는데 entrySet()되는 이유 : Map 인터페이스 내장 메서드
		
		// Entry : key value 한 쌍으로 묶은 자료구조
		// Map은 엔트리에 담아야지만 Iterator로 순회가능하며, 몇 번 반복할지 모르기에 while문으로 반복한다. 
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		while(userMapIter.hasNext()) {
			Entry<String, Object> entry = userMapIter.next();
			System.out.println(entry.getKey());
		}
	}
}

