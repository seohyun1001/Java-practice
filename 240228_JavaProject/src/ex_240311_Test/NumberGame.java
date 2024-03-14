package ex_240311_Test;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * 100 + 1);

		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		
		if (randomNumber % 2 == 0) {
			System.out.println("힌트는 짝수입니다.");
		} else {
			System.out.println("힌트는 홀수입니다.");
		}

		int attempts = 0;
		
		while (true) {

			System.out.println("1~100 사이의 값을 입력 >>");
			int guessNumber = scanner.nextInt();
			attempts++;

			if (guessNumber <= 100) {

				if (guessNumber > randomNumber) {
					System.out.println("더 작은 수입니다.");

				} else if (guessNumber < randomNumber) {
					System.out.println("더 큰 수입니다.");

				} else {
					System.out.println(attempts + "회 만에 맞췄습니다.");
					System.out.println("=== 게임을 종료합니다. ===");
					scanner.close();
					break;
				} 
				
			} else {
				System.out.println("1에서 100 사이의 값을 입력해주세요 >>");
				attempts--;
			}
			
		}

	}
	
}
