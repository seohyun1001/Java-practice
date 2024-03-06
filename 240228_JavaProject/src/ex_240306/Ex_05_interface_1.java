package ex_240306;

public interface Ex_05_interface_1 {
	
	// 인터페이스 : 접점 / 특정의 표준, 규격
	// ex) 110v 변환하는 컨버터
	// ex2) JDBC라고 해서 자바와 데이터베이스를 연결하는 인터페이스
		// DB회사에서 JDBC 인터페이스의 규격에 맞게 클래스를 작성을 하면
		// 개발자는 인터페이스 규격, 표준은 그대로 두고,
		// DB의 클래스만 교체해서 사용을 함
	// 특징)
	// 1. 다중 상속 가능
	// 2. 추상 클래스 처럼 추상 메서드, 상수로 구성
	// 3. JDK 버전이 올라 기본, private, static 등 메서드 들도 같이 구성이 되게끔 추가 되었음
	// 4. 인터페이스도 추상 클래스처럼 실제 사용보다는 설계도로서 사용을 하는 것이 목적
	// 5. 규모가 작으면 추상 클래스, 인터페이스를 안 쓰는 경우도 가끔 있지만
	// 보통은 유지보수 등을 생각한다면 많이 사용하는 편
	
	// 구성품)
	// 상수
	public final int MAX = 100; 
	
	// abstract
	abstract public void showInfo()
	; 
	
	// default
	public default void introduceInfo() {
		System.out.println("default method");
		introduceHobby();
		introduceMember();
	}; 
	
	// private
	private void introduceHobby() {
		System.out.println("private method");
	};
	
	//static
	public static void introduceMember() {
		System.out.println("static method");
	};

}
