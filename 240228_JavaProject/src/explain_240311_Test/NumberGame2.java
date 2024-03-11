package explain_240311_Test;

import java.util.Scanner;

public class NumberGame2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int randomNum = (int) (Math.random() * 100 + 1);
		// -> 이름이 randomNum인 int타입 변수의 선언 및 값 할당
		// -> (int) : 뒤에 오는 값을 int타입으로 강제로 변환 시킴
		// -> Math.random : Math라는 클래스의 random이라는 메서드
		// * 100 + 1 : 1이상 101미만의 값
		
//		System.out.println(randomNum) - 확인용

		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		
		if (randomNum % 2 == 0) {
			// randomNum이라는 변수를 2로 나눴을 때의 몫이 0이라면
			System.out.println("힌트는 짝수입니다.");
			// "힌트는 짝수입니다." 출력
		} else {
			System.out.println("힌트는 홀수입니다.");
			// 그 외에는 "힌트는 홀수입니다." 출력
		}
		
		// if (조건식) {
		// 조건식이 참일 때 실행할 문장
		// } else if (조건식) {
		// else if (조건식)이 참일 때 실행할 문장
		// } else {
		// 위의 조건식에 부합하는 것이 없을 때 실행할 문장
		// }
		
				

		int attemptCount = 0;
		// attemptCount라는 이름을 가진 int 타입의 변수 선언 및 값 할당
		// while문 안에 넣으면 안 됨
		// -> while문의 값이 true로 돌 때마다 값이 0으로 초기화 된다. 
		
		while (true) {
			// while : 조건식이 true이면 반복실행함
			System.out.println("1~100 사이의 값을 입력 >>");
			int guessNum = scanner.nextInt();
			// 콘솔에 입력한 숫자를 guessNum이라는 이름의 int 타입 변수로 지정

			attemptCount++;
			// 콘솔에 입력할 때마다 입력 카운트 +1

			if (guessNum > 0 && guessNum <= 100) {
				// guessNum이 0 초과 그리고 100이하라면 다음 if문 실행

				if (guessNum < randomNum) {
					// guessNum이 randomNum보다 작다면

					System.out.println("더 큰 수입니다.");
					// 더 큰 수 입니다. 출력

				} else if (guessNum > randomNum) {
					// guessNum이 randomNum보다 크다면

					System.out.println("더 작은 수 입니다.");
					// 더 작은 수 입니다. 출력

				} else {
					// guessNum이 randomNum보다 작지도, 크지고 않는다면
					// 즉 guessNum과 randomNum이 같다면
					System.out.println(attemptCount + "회 만에 맞췄습니다.");
					// attempCount + 회 만에 맞췄습니다. 출력
					System.out.println("=== 게임을 종료합니다. ===");
					// 게임을 종료합니다. 출력
					scanner.close();
					// 스캐너 종료
					break;
					// while문 빠져나옴
				}

			} else {
				// guessNum이 0 초과 100 이하의 범위에 들어가지 않는다면,
				// 즉 guessNum이 0 이하, 100 초과의 값을 가진다면
				System.out.println("1에서 100 사이의 값을 입력해주세요.");
				// 1에서 100 사이의 값을 입력해주세요. 출력
				attemptCount--;
				// 입력 횟수 -1(입력 횟수로 치지 않기 위해)
			}

		}

	}

}
