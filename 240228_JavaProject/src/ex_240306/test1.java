package ex_240306;

public interface test1 extends test2, test3 {
	// 인터페이스 구성품
	// 1) 상수, 2) 추상메소드
	String snackMenu = "nacho";
	void showSnackMenu();
	
	// test1 인터페이스에 여러가지 많은 기능을 다 넣으면 유지보수가 어려움
	// -> 상속으로 해당 기능을 다 묶을 수 있지만
	// 유지보수 등을 고려하여 느슨한 결합으로 설계

}
