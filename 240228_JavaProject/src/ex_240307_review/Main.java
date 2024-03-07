package ex_240307_review;

//import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
//		Util util = new Util();
		// -> Util에서 static 변수로 만들어줌
		// -> Util.showDate();만 쓰면 됨
		
		Sports swimming = new Swimming("수영", 1, "10분 이내", "사직실내수영장");
		swimming.showInfo();
		swimming.showPlace();
		
		// 시즌 설정
//		Season summer = Season.Summer;
//		sub.setSeason(summer);
//		System.out.println("open season : " + sub.getSeason());
		Util.showSeason(swimming, 2);
		
		// 시간 설정
		// date 타입 -> 문자열로 변환
//		LocalDate currentDate = LocalDate.now();
//		String createTime = currentDate.toString();
//		sub.setCreateTime(createTime);
//		System.out.println("sign up date : " + sub.getCreateTime());
		Util.showDate();
		
		// 인터페이스에서 정의한 추상 메서드 사용
		// showInOutPlace showUseItems showTeamNameOrMemberName
		// -> 현재 다형성으로 부모 타입으로 받아서 현재 보이는 메서드는 부모만 보임
		// 그래서 다운캐스팅 함
		Swimming swimming2 = (Swimming)swimming;
		// 다시 메서드를 조회 해보면, 자식이 재정의한 메서드가 보힘
		swimming2.showInOutPlace(1);
		
		// 수영선수 소개
		String [] members = {"황선우", "김우민"};
		swimming2.showTeamNameOrMemberName(members);
		
		// 사용 장비
		String [] items = {"수모", "수영복", "수경", "귀마개", "핀"};
		swimming2.showUseItems(items);
		
		System.out.println();
		System.out.println("======================================");
		
		// generate instance of baseball
		
		Sports baseball = new Baseball("야구", 9, "약 3시간", "사직야구장");
		baseball.showInfo();
		baseball.showPlace();
		Util.showSeason(baseball, 1);
		Util.showDate();
		
		Baseball baseball2 = (Baseball)baseball;
		// 다시 메서드를 조회 해보면, 자식이 재정의한 메서드가 보힘
		swimming2.showInOutPlace(2);
		
		// 수영선수 소개
		String [] members2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		baseball2.showTeamNameOrMemberName(members2);
		
		// 사용 장비
		String [] items2 = {"배트", "글러브", "야구모자","유니폼","야구신발","야구공"};
		baseball2.showUseItems(items2);
		
		System.out.println();
		System.out.println("======================================");
		
	}
}
