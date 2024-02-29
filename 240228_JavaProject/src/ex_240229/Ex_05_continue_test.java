package ex_240229;

import java.util.Scanner;

public class Ex_5_continue_test {

	public static void main(String[] args) {
		while (true) {
			// while문은 보통은 무언가 계속 실행하게 하고,
			// 특정 조건에서 빠져나올 때 많이 사용함.
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력한 n까지 더하는 프로그램");
			System.out.println("1 : 숫자 입력 / 2 : 종료) >>");
			int number = scanner.nextInt();
			
			// 조건문 분기
			if (number == 1) {
				System.out.println("숫자를 입력해주세요 >>");
				int number2 = scanner.nextInt();
				int result = sumN(number2);
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

	// 입력한 n까지 더하는 프로그램 만들기 1+2+3+...+n
	public static int sumN(int number) {
		// 초기값, 합의 값을 할당
		int i, sum = 0;
		for (i = 0; i <= number; i++) {
			// 초기값 : i=0;
			// 조건 : i가 number(입력한 값)가 될 때까지;
			// 반복 후 작업 : i + 1
			sum += i;
			// 반복문 :
		}
		return sum;
	}
}
