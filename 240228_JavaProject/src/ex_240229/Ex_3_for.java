package ex_240229;

import java.util.Scanner;

public class Ex_3_for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력한 n까지 더하는 프로그램 / 숫자를 입력해주세요 >>");
		int number = scanner.nextInt();
		int result = sumN(number);
		System.out.println("결과는 : " + result);
		}

	// 입력한 n까지 더하는 프로그램 만들기 1+2+3+...+n
	public static int sumN(int number) {
		// 초기값, 합의 값을 할당
		int i, sum = 0;
		for(i=0; i<=number; i++) {
			// 초기값 : i=0;
			// 조건 : i가 number(입력한 값)가 될 때까지;
			// 반복 후 작업 : i + 1
			sum += i;
			// 반복문 : 
		}
		return sum;
	}
}
