package ex_240307_review;

public class Swimming extends Sports implements Interface{

	public Swimming(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		super(sportsName, sportsMemberCount, sportsPlayTime, sportsPlace);
	}

	@Override
	public void showInOutPlace(int checkInOutPlace) {
		if (checkInOutPlace == 1) {
			System.out.println("실내 스포츠");
		}
		else {
			System.out.println("실외 스포츠");
		}
	}

	@Override
	public void showUseItems(String[] items) {
		System.out.println();
		System.out.print("사용 장비 : ");
		for(String item: items) {
			System.out.print(item + " ");
		}
	}
	
	@Override
	public void showTeamNameOrMemberName(String[] members) {
		System.out.print("팀명 또는 선수 소개 : ");
		for(String members1 : members) {
			System.out.print(members1 + " ");
		}
	}
}
