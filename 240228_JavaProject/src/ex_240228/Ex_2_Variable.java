package ex_240228;

import java.net.Inet4Address;

class Person {
	private String userName;
	private String userEmail;

	public Person(String name, String email) {
		this.userName = name;
		this.userEmail = email;

	}

	// 춤추는 함수
	public void doDance() {
		System.out.println("춤추기");
	}

	// 정보를 호출하는 함수.
	public void showInfo() {
		System.out.println("이름 : " + this.userName + " 메일 : " + this.userEmail);

	}

}

public class Ex_2_Variable {

	public static void main(String[] args) {

		// 변수 사용시 주의 사항
		// 1. 특수 문자는 _ 와 $만 사용가능
		// 첫 문자로 사용가능 하지만 잘 사용하지 않음
		// 2. 유니코드, 한글 사용 가능 하지만 잘 사용하지 않음
		// 3. 자바에서 예약어(키워드)는 변수 이름으로 사용불가
		// 4. 길이 제한은 특별히 없지만 의미 있게 이름 지을 것
		// 5. 숫자로 시작 안 됨
		// 6. 대소문자 구분을 함

		
		
		// 데이터 타입
		// 1) 기본형 8개
		// byte, short, int(정수형의 기본), long : 정수형
		// float, double : 실수형 (소수점으로 정밀하게 측저해야 하는 데이터 타입에 사용이 됨)
		// boolean : true / false
		// char

		// 2) 레퍼런스 타입 : 기본형 타입을 제외한 나머지 타입
		// 클래스, 인터페이스, 배열 등

		int i1, i2, i3;
		// 같은 타입의 변수를 연속해서 나열 가능

		// 문자열 + 숫자 = 문자열(연결 연산자)

		System.out.println("10을 각 진수로 표기하기");
		// 10진수
		int num1 = 10;
		System.out.println("10진수(10) : " + num1);
		// 2진수 표기법 : 0b를 앞에 붙이기
		int num2 = 0b1010;
		System.out.println("2진수(0b1010) : " + num2);
		// 8진수 표기법 : 숫자 0만 붙이기
		int num3 = 012;
		System.out.println("8진수(012) : " + num3);
		// 16진수 표기법 : 0x를 앞에 붙이기
		int num4 = 0xa;
		System.out.println("16진수(0xa) : " + num4);

		
		
		// long , 정수형
		long number5 = 1000000000000000000l;
		// float , 실수형
		float number6 = 1.2345f;
		// Double , 실수형
		double number7 = 1.12345678901234567890123456789012345678901234567890;
		// boolean , true, false
		boolean isChecked = false;

		
		
		// 레퍼런스 타입으로 선언하기.
		// 클래스명 참조형 변수 이름 = new(키워드) 클래스생성자(매개변수가2개인 생성자 호출.)
		// lsyPerson : 참조형 변수(레퍼런스 변수), 클래스에서, 인스턴스를 생성했다.
		Person lsyPerson = new Person("이상용", "lsy@naver.com");
		lsyPerson.doDance();
		lsyPerson.showInfo();
		
		
		
		// 특수 문자 출력해보기
		System.out.println("특수 문자 \b : " + '\b');
		System.out.println("특수 문자 \t : " + '\t' + "샘플");
		System.out.println("특수 문자 \n : " + '\n' + "샘플");
		System.out.println("특수 문자 \f : " + '\f' + "샘플");
		System.out.println("특수 문자 \r : " + '\r' + "샘플");
		System.out.println("특수 문자 \" : " + '\"' + "샘플");
		System.out.println("특수 문자 \\ : " + '\\' + "샘플");
		
		
		
		// null : 레퍼런스가 할당이 아직 안 됨
		//	기본형에서 사용 안 함
		String strTest = null;
		
		
		
		// 상수 : 변하지 않는 수
		// final 키워드를 사용하여 선언.
		// 선언 시 초기값을 설정하며, 재할당이 불가하다
		final int finalNum = 0;
		
		
		
		// var 동적 변수 할당 : 일단 패스
		
		
		
		// 타입 변환(캐스팅)
		// 작은 집 -> 큰 집 : 문제x
		// 큰 집 -> 작은 집 : 문제o

		// 타입 변환 테스트
		// 작은 집 -> 큰 집(문제x)
		byte byteNum = 10;
		long longNum = byteNum;
		System.out.println("작은 집 -> 큰 집(문제x) : " + longNum);
		
		// 큰 집 -> 작은 집(문제o) -> 강제 형 변환시킴
		int intNum = 130;
		byte byteNum2 = (byte)intNum;
		System.out.println("큰 집 -> 작은 집(문제o) : " + byteNum2);
		
		// 레퍼런스에서는 포함관계로 설명을 하는데,
		// 상속에 대해서 설명 후 구체적으로 하기
		// 부모 클래스 / 자식 클래스 개념이 나오고
		// 자식 타입 -> 부모 타입 or 부모 타입 -> 자식 타입

	}

}
