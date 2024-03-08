package ex_240308;

import java.util.ArrayList;

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
		

	}

}
