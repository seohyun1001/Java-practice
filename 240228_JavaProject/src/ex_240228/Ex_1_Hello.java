package ex_240228;

public class Ex_1_Hello {

	
	public static int sum(int x, int y) {
		return x + y;
	}
	// public : (접근지정자) 모든 위치에서 접근이 가능
		// static : (전역처럼 사용이 됨) 클래스 메소드(함수), 매개변수 2개 이고, 리턴값도 있다
		// int : 리턴타입, sum 메소드를 수행 후 결과값의 반환 타입
		// sum : 메소드 명
		// (int x, int y) : 매개변수, 변수명은 임의로 작성가능
		// 이 메소드는 해당 클래스가 로더 : 클래스를 불러오는 역할
		// 실행 시 해당 static 붙은 메소드, 변수 등은 시스템에 불러와져 있어
		// 클래스명으로 바로 사용 가능
		// return : 결과값을 의미
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// void : 리턴 값이 없다는 뜻
		// main : 메소드 명
		// (String[] args) : 매개변수 정의 부분, 타입이 배열로 정의가 되어 있음
		// String[] : 배열의 타입이 문자열이라는 뜻
		// 문자열(string)과 한문자(char)를 따로 쓰고 있음
		// main 메소드는 자바 프로그램의 시작을 의미
		
		int i = 20;
		// 변수타입 변수명 = 값;
		// 변수 타입 : 1) 기본형, 2) 레퍼런스 타입
		// 레퍼런스 타입 : 기본형을 제외한 나머지 모든 타입
		// 변수 선언시 선언과 할당을 동시에 진행
		
		int i2;
		i2= 3;
		// -> 변수 선언과 할당을 따로 

		char a= 'a';
		// 한문자를 표기시 사용, 사용하는 기호는 작은 따옴표를 사용함
		
		String str = "김서현";
		// 문자열 표기시 사용
		// 기본형이 아니라 참조형임.
		// 큰 따옴표 사용
		
		int resultNum = sum(100,200);
		
		// 출력해보기
		System.out.println("출력 연습 (단축키 : syso ctrl + space)");
		System.out.println("i값 : " + i);
		// 문자열 + 숫자 -> 연결 연산자
		System.out.println("실행 단축키 : ctrl + f11");
		System.out.println("=======================================");
		System.out.println("i2값 : " + i2);
		System.out.println("a값 : " + a);
		System.out.println("resultNum 값 : " + resultNum);

	}

}
