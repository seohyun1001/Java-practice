package ex_240307_review;

import java.time.LocalDate;

public class Util {
	
	// 현재 날짜 등록 해주는 기능
	public static void showDate() {
		LocalDate currentDate = LocalDate.now();
		String createTime = currentDate.toString();
		System.out.println("sign up date : " + createTime);
	}
	
	// 개막 시즌 알려주는 기능
	public static void showSeason(Sports sports, int season) {
		switch (season) {
		case 1: {
			Season spring = Season.Spring;
			sports.setSeason(spring);
			break;
		}
		case 2: {
			Season summer = Season.Summer;
			sports.setSeason(summer);
			break;
		}
		case 3: {
			Season fall = Season.Fall;
			sports.setSeason(fall);
			break;
		}
		case 4: {
			Season winter = Season.Winter;
			sports.setSeason(winter);
			break;
		}
		default:
			System.out.println("1~4번을 선택해주세요");
		}
		System.out.println("season open : " + sports.getSeason());
	}

}
