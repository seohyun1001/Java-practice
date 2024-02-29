package ex_240229;

public class Ex_6_array {

	public static void main(String[] args) {
		// 배열 : 크기 고정, 변경 불가
		// 계란판 -> 같은 타입의 데이터만 담을 수 있음
		// 생성 방법
		// 1. int [] array : 선언만 한 것
		// 2. int array [] = new int[4] : 선언 후 배열 생성(초기화)
		// 3. int array [] = {1,2,3,4} : 선언 후 배열 생성 및 값 할당
		// 인덱스 : 0부터 시작, 순서가 있음
		// 선언 부분에 int array [4] 이런 식으로 크기를 지정하면 안 됨
		int array [] = new int [5];
	//  타입 배열이름 [] = new 타입 [크기];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		System.out.println("array[0]의 값 불러오기 : " + array[0]);
		
		int array2 [] = {1,2,3,4,5};
		for (int i = 0; i<array2.length; i++) {
			System.out.println("array[" + i + "] = " + array2[i]);
		}
		
		// 문자열 배열 선언 해보기 / 점심 메뉴 출력
		String arrayLunchMenuString [] = {"김밥","국밥","우동","아구찜","된장찌개","비빔밥"};
		System.out.println("======= 점심 메뉴 =======");
		for (int i = 0; i<arrayLunchMenuString.length; i++) {
			System.out.println("메뉴 목록[" + i + "] = " + arrayLunchMenuString[i]);
		}
	}

}
