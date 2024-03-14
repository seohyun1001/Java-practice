package ex_240311_Test;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public static void main(String[] args) {
		 ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		 
		 cp.setPoint(10, 20);
		 
		 cp.setColor("GREEN");
		 
		 cp.show();
		 }

	
	
	private void show() {
		System.out.println(color + "색으로 (" + getX() + ", " + getY() + ")");
		}

	
	private void setColor(String color) {
		this.color = color;		
	}

	private void setPoint(int x, int y) {
		move(x, y);		
	}
	
}
