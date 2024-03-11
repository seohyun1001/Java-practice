package explain_240311_Test;

import ex_240311_Test.Point;

public class ColorPoint2 extends Point {
	// Colorpoint 클래스는 Point 클래스를 상속 받는다
	
	private String color;
	// 현재 Point 클래스에는 매개변수가 x와 y밖에 없기에
	// color를 넣어주기 위해 일단 선언을 먼저 해줌

	
	// 부모의 매개변수x,y를 받고, 새로운 매개변수 color를 받는 ColorPoint로 재정의
	public ColorPoint2(int x, int y, String color) {
		
		super(x, y);
		// Point 클래스에서 기본 생성자를 지정하지 않았기 때문에
		// 명시적으로 꼭 넣어줘야 함
		
		
		this.color = color;
		// color 값 할당
	}

	public static void main(String[] args) {
		 ColorPoint2 cp = new ColorPoint2(5, 5, "YELLOW");
		 // cp라는 인스턴스 생성, 매개변수는 5, 5, "YELLOW"를 가진다
		 		 
		 cp.setPoint(10, 20);
		 // cp에 setPoint() 메서드 실행
		 		 
		 cp.setColor("GREEN");
		 // cp에 setColor() 메서드 실행
		 		 
		 cp.show();
		 // cp에 show() 메서드 실행
		 }

	
	
	private void show() {
		// 현재 클래스에서만 볼 수 있는 show라는 이름의 메서드 생성
		// 매개변수는 없음
		
		
		System.out.println(color + "색으로 (" + getX() + ", " + getY() + ")");
		// 괄호 안의 매개변수 출력
		// Point의 x, y 매개변수가 private이라 보이지 않기 때문에
		// getter를 사용한 메서드를 매개변수로 넣음
		}

	
	private void setColor(String color) {
		this.color = color;
		// 매개변수로 받은 color를 해당 객체의 color로 변경해주는
		// setColor라는 이름의 메서드 생성
	}

	private void setPoint(int x, int y) {
		move(x, y);
		// move라는 메서드로 받은 x, y의 인자값을 setPoint의 매개변수로 받는 메서드
		// 위의 setColor와 같이 매개변수로 받은 x,y를 해당 객체의 x, y로 넣어주는 역할을 한다
	}
	
}
