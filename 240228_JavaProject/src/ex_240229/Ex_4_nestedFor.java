package ex_240229;

import java.util.Scanner;

public class Ex_4_nestedFor {

	public static void main(String[] args) {

		// 입력받은 수까지 구구단 출력하기(1~9) 숫자 하나 정하기

		while (true) {
			// while문은 보통은 무언가 계속 실행하게 하고,
			// 특정 조건에서 빠져나올 때 많이 사용함.
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력받은 수까지 구구단 출력하기");
			System.out.println("1 : 프로그램 실행 / 2 : 종료) >>");
			int number = scanner.nextInt();

			// 조건문 분기
			if (number == 1) {
				// 입력 받은 수로 구구단 출력하기
				System.out.println("숫자를 입력해주세요 >>");
				int number2 = scanner.nextInt();
				int result = gugudan(number2);
				System.out.println("결과는 : " + result);
			} else if (number == 2) {
				System.out.println("프로그램을 종료합니다.");
				// 사용 안 하는 메모리는 반납을 꼭 해주기
				scanner.close();
				break;
			} else {
				System.out.println("*주의) 숫자는 1 또는 2 중에서 입력해주세요.");
			}
		}
	}

	// 입력 받은 수로 구구단 출력하기
	public static int gugudan(int Number) {
		// 중첩 for 문 활용하기
		int multiple = 0;
		for (int i = 1; i <= Number; i++) {
			for (int j = 1; j > 10; j++) {
				multiple = i * j;
				System.out.println(i + "x" + j + "=" + multiple);
				System.out.println('\t');
			}
			System.out.println(); // 한단 끝나면 줄넘김
		}
		return multiple;
	}

}
