package ex_240308;

public class Ex_01_wrapper_1 {

	public static void main(String[] args) {
		// Wrapper Class : 기본형 -> 참조형 변환
		// OOP(Object Oriented Programing)
		// 꽃 ? 상속, 재사용
		// 반환 타입이 -> Integer
		Integer i1 =  Integer.valueOf(100);
		// i1. -> 보이는 시점이 object, integer 둘 다 보임
		System.out.println("i1 : " + i1);
		// -> 참조형을 출력해보지 해당 기본형의 정수값이 100이 출력됨
			// -> 왜? 참조형에서 기본형으로 자동 언박싱(변환)
		
		Object i2 = Integer.valueOf(100);
		// i2. -> object만 보임
		System.out.println("i2 : " + i2);
		
		
		// 문자열(참조형) -> wrapper(참조형)
		Integer i3 = Integer.valueOf("1000");
		System.out.println("i3 : " + i3);
		// -> 언박싱
		
		
		// 실수(기본형) -> 
		// 3.14의 기본형 -> double
		// 작은 집인 float으로 다운캐스팅
		Float float1 = Float.valueOf((float)3.14);
		System.out.println("float1 : " + float1);
		// 언박싱
		
		
		// 많이 사용되는 parsing 메서드
		// static int parseInt(String s)
		// : 스트링
		Integer i4 =  Integer.valueOf(100);
		int num = i4.parseInt("1000");
		System.out.println("num : " + num);
		
		// static으로 선언된 메서드는
		// -> 가급적 겁근을 클래스명으로 하는 것을 원칙으로 함
		// 인스턴스로 접근이 가능하지만 권장x
		// 왜? static은 클래스가 로드될 때부터 있는 메모리 위치 주소값(참조형)
		// 인스턴스는 생성시 메모리 위지 주소값이 할당이 됨
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		System.out.println("num3 : " + num2);
		
		
		// 참조형 -> 기본형 메서드 이용하기
		Integer num4 = Integer.valueOf(100);
		int num5 = num4.intValue();
		System.out.println("num5 : " + num5);
		// -> 자동 언박싱
		System.out.println("Integer num4 : " + num4 );
		// -> Wrapper 클래스 메서드 이용하여 참조형을 기본형으로 변경
		
		
		// 배열로 Integer 들을 다 담아보기
		Integer[] arrayInteger = {i1, i3, i4, num4}; 
		// 반복자 패턴(iterable)
		for(Integer x:arrayInteger) {
			System.out.println("자동 형 변환으로 x 출력하기 : " + x);
		}

	}
	

}
