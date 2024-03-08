package ex_240308;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_07_Collection_Arraylist {

	public static void main(String[] args) {
		// ArrayList
		// 1) List / 2) Collection
		// 벡터와 동일하게 부모의 1번과 2번의 모든 기능을 다 상속
		// 크기는 가변 / 순서가 있으며 중복이 가능하다
		// 벡터와 다른 점은 스레드 동기화 기능이 없다
		// 추가, 삭제, 검색 등 유여한게 여러 요소들의 처리가 가능함

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("우럭회 맛있겠다..");
		arrayList.add("카스 마실까");
		arrayList.add("라면");

		// 츨력
		for (String string : arrayList) {
			System.out.println("arrayList의 요소값 : " + string);
		}

		
		System.out.println();
		
		
		// remove 카스 삭제 후 출력
		arrayList.remove(1);
		// 츨력
		for (String string : arrayList) {
			System.out.println("삭제 후 arrayList의 요소값 : " + string);
		}
		
		
		System.out.println();
		
		
		// 라면 검색 하기
		System.out.println("라면 검색 결과는 : " + arrayList.contains("라면"));
		
		
		System.out.println();
		
		
		// 현재 arraylist로 iterator 인터페이스 타입으로 변환 뒤
		// 모든 요소를 확인 후 조회하는 간단한 기능 구현
		// 문법 : Iterator 인터페이스를 상속받은 컬렉션들은
		// 해당 인스턴스에 기능으로
		// iterator() 메소드를 모두 가지고 있고
		// 이것을 호출하면 됨
		
		Iterator<String> it1 = arrayList.iterator();
		// ArrayList에 있는 모든 요소를 it1, 인스턴스에 다 들어가 있다
		// 비유하자면 특정의 테이블에 1번, 2번 순서대로 기록이 되어 있다.
		// 우리는 순서대로 기록된 테이블 차례차례 순차 검색이 가능하다
		// 조회 해보자!
		// 순서
		// 1. arrayList 인스턴스에 포함된 iterator() 호출
		// 2. hasNext로 존재 유무 확인
		// 3. 출력하기
		// hasNext : 해당 테이블의 1번 라인부터 해서 존재유무를 : true, false로 리턴
		while(it1.hasNext()) {
			String string = it1.next();
			System.out.println("iterator를 이용한 출력 : " + string);
		}
		

	}

}
