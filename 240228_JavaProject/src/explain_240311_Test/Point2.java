package explain_240311_Test;

public class Point2 {

    private int x, y;
    // x, y 선언

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    // x, y 값 할당
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    // getter 이용
    // setter는 생성자를 이용하여 할당 예정이기 때문에 불필요함

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // protected : 같은 패키지의 클래스, 같은/다른 패키지의 서브 클래스에서 접근 가능
    // 다른 패키지의 기본 클래스는 접근 불가
    // int x, int y를 매개변수로 받는 move라는 이름의 메서드 생성
    // 'Point'클래스의 인스턴스인 'x','y' 필드를 나타냄
    // -> 이렇게 함으로써 'move' 메서드는 현재 'Point' 객체의 위치를 변경할 수 있다

}
