package ex_240308;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex_08_Collection_HashMap {

	public static void main(String[] args) {
		// HashMap : 키와 값의 구조 형태오 이루어진 컬렉션
		// 요소로는 참조형으로 가지고 있다
		// 가변 크기 / 추가, 수정, 삭제, 조회 등 속도가 빠르다
		// 문법
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		// 추가
		hashMap.put("apple", "사과");
		hashMap.put("banana", "바나나");
		hashMap.put("grape", "포도");
		
		// 출력
//		for(int i = 0; i < hashMap.size(); i++) {
//			hashMap
//		}
		System.out.println("hashMap[\"apple\"] : " + hashMap.get("apple"));
		
		// 반복문으로 변경
		// iterator를 이용해서 출력 해보기
		// 맵이 가지고 있는 모든 키를 조회
		// 집합이라는 컬렉션에 키들을 다 모아두기
		Set<String> keys = hashMap.keySet();
		// 반복 가능하게 만들어서 순차 조회를 하기
		Iterator<String> it2 = keys.iterator();
		while(it2.hasNext()) {
			String keyString =  it2.next();
			// 모든 키를 조회를 했고
			String value = hashMap.get(keyString);
			System.out.println("key : " + keyString + " / value : " + value);
		}
		
		
		System.out.println();
		
		
		// remove banana
		// grammer : remove(key)
		hashMap.remove("banana");
		// 삭제 후 출력
		Set<String> keys2 = hashMap.keySet();
		Iterator<String> it3 = keys.iterator();
		while(it3.hasNext()) {
			String keyString2 =  it3.next();
			// 모든 키를 조회를 했고
			String value2 = hashMap.get(keyString2);
			System.out.println("key : " + keyString2 + " / value : " + value2);
		}
		
		
		// search
		System.out.println("apple 키 존재 유무 : " + hashMap.containsKey("apple"));
		
		
		// 값으로 검색
		System.out.println("사과 값 존재 유무 : " + hashMap.containsValue("사과"));
		
		

	}

}
