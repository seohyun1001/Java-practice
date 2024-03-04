package ex_240304;

public class Circle {
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// set으로 해당 필드에 값 설정 후 get으로 가져옴

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int radius;
	private String name;
	private final static Double PI = 3.14;
	
	// 기능1 : 면적구하기
	public void calcGetArea() {
		System.out.println("원의 넓이 : " + this.radius*this.radius*PI);
	}
	
	// 기능2 : 정보(이름, 크기, 면적)
	public void showInfo() {
		System.out.println("이름 : " + this.name + " 크기 : " + this.radius + " 넓이 : " + this.radius*this.radius*PI);
		
	}
	
	// 클래스의 필드에 접근 지정자를 private으로 해서
	// 외부에서 접근이 안되는 부분 확인하고 따로 접근해서
	// 1) 값을 설정하는 방법
	// 2) 값을 가지고 오는 방법
	// getter/setter
	// 지금은 수동으로 만들어서 사용하지만
	// 1) 시스템에서 반자동으로 만들어서 사용하는 방법
	// 2) 라이브러리, lombok 외부로 완전히 분리해서 시스템이 동작하면 자동으로 생성해줌
	// 결론. 1)번 반자동으로 연습하고
	// 나중에 

}
