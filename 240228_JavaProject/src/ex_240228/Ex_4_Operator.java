package ex_240228;

import java.util.Scanner;

public class Ex_4_Operator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 클래스명 참조형변수 = new 클래스명(인자값)
		// System.in : 표준입령, 키보드로 입력된 값을 바이트로 변환
		System.out.println("정수를 입력해주세요>>");
		// 콘솔에 입력한 정수를 담을 변수를 지정
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		System.out.println("입력하신 정수의 초는 : " + second);
		System.out.println("입력하신 정수의 분은 : " + minute);

	}

}
