package ex_240229;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Ex_02_switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======= 날씨에 따른 메뉴 선택하기 =======");
		System.out.println("숫자를 선택하세요");
		System.out.println("1.sunny, 2. cloudy, 3.rainy, 4:default");
		int pickNumber = scanner.nextInt();
		String resultPickMenuString = pickLunchMenuWeather(pickNumber);
		System.out.println("오늘 점심은 : " + resultPickMenuString);
	}
	
	
	// 날씨에 따라 메뉴를 정해주는 프로그램 만들기
	public static String pickLunchMenuWeather(int number) {
		switch (number) {
		case 1:
			String menuString = "된장찌개";
			return menuString;

		case 2:
			String menuString2 = "김밥";
			return menuString2;

		case 3:
			String menuString3 = "삼선우동";
			return menuString3;

		default:
			String menuString4 = "돼지국밥";
			return menuString4;
		}
	}


}