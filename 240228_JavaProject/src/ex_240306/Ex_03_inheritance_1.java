package ex_240306;

// 부모 클래스 
// 클래스 1) 정의.

// 클래스 구조 : C -> B -> A2
class A2 {
	// 모든 클래스는 묵시적으로 Object 클래스를 상속 받고 있음.
	public A2(int x) {
		System.out.println("생성자 A2 입니다.");
	}
	// 디폴트 생성자를 컴파일러가 안만들어주니,
	 // 우리가 수동으로 만들기. 
	public A2() {
		// TODO Auto-generated constructor stub
	}
}

class B extends A2 {
	
	public B(int x) {
		// 첫번째 방법, 부모 클래스의 생성자에 타입 맞춤
		// 표현, 깔맞춤.
//		int x2 = 0;
		// super(); 약속이라서, 항상 자식의 생성자 호출전에 반드시 부모의 생성자가 호출되는 것. 
//		super(x);
//		x = 0;
		super();
		
		
		 // 생략이 되어 있고, 묵시적
		System.out.println("생성자 B 입니다.");
	}
	
	// 기본 생성자 없어서, 아래의 클래스에서 오류가 남. 만들기. 
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	public void showInfo() {
		System.out.println("showInfo() B 클래스 메서드 호출 ");
		
	}
}

class C extends B {
	public C() {
		super(); // 생략이 되어 있고, 묵시적
		System.out.println("생성자 C 입니다.");
	}
	
	// 부모클래스의 메서드를 오버라이딩 했음.
	// 애너테이션 , 시스템에게 메세지를 전달함. 
	// 내가 부모 메서드를 재정의 했으니, 시스템에게 알려줌. 
	// 혹시라도, 컴파일러 체크시 문제가 있다면 알려달라고. 
	@Override
	public void showInfo() {
		System.out.println("showInfo() C 클래스 메서드 호출 ");
		
	}
}

public class Ex_03_inheritance_1 {

	public static void main(String[] args) {
		// 클래스 2) 사용
		C c = new C();
		System.out.println("부모 클래스 먼저 생성자 호출 확인.");
		// 디버깅 방법 
		// 1) 라인 번호 앞에 더블 클릭을한다. 브레이크 포인트 지정. 
		//예시 27번 라인 앞에 지정한다.
		// 2) 디버그 실행(모드), f11 -> Perspective , 오른쪽 상단에 벌레 모양 아이콘 으로 변경됨.  
		// step into, 메서드, 생성자 호출시 
		// 안으로 들어가기. f5 
		// step over, 단순 넘기기(skip) f6
		// 변수등을 넘어갈 때, 또는 메서드를 실행만
		//하고 넘어갈 때. 
		
		//  instaceof 연산자 예제 
		// 클래스 구조 : C -> B -> A2
		// 큰집 = 작은집 , 다형성, 업캐스팅. 
		// 문제점, test1, test2, test3 의 원래의 객체를 알기가 어렵다. 
		A2 test1 = new A2();
		A2 test2 = new B();
		A2 test3 = new C();
		
		boolean result1 = (test2 instanceof B) ? true : false;
		System.err.println("test2 instanceof B :  " + result1 );
		
		boolean result2 = (test2 instanceof A2) ? true : false;
		System.err.println("test2 instanceof A2 :  " + result2 );
		
		boolean result3 = (test2 instanceof C) ? true : false;
		System.err.println("test2 instanceof C :  " + result3 );
		
		
		// 오버라이딩
		// 부모 클래스의 메서드를 , 자식 클래스에서 재정의해서 사용함. 
		// 이름이 똑같아서, 시스템 입장에서는 , 이 기능이 , 부모 꺼인지 , 아니면 자식 꺼인지 구분어려운데.
		// 결론, 자식의 재정의한 메서드를 사용한다. 
		
		// B 클래스, C 클래스, 같은 이름의 메서드가 있음. 
		// C는 부모 클래스의 메서드를 재정의 했음. 
		
		// 원래 자기 타입으로 인스턴스를 생성. 작은집 = 작은집
		System.out.println("======오버라이딩 확인중.================");
		
		B testB = new B();
		testB.showInfo();
		
		// 부모 타입으로 인스턴스를 생성, (다형성) 큰집 = 작은집 
		B testC = new C();
		// 부모꺼만 보입니다.
		testC.showInfo();
		// 결론, 자식 클래스, 부모 클래스의 메서드를 오버라이딩 하면, 
		// 누가 우선인가요? 자식. 
		

	}

}