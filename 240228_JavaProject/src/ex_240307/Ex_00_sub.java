package ex_240307;

public class Ex_00_sub extends Ex_00_sports implements Ex_00_interface{

	public Ex_00_sub(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
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
		System.out.print("사용 장비 : ");
		for(String item: items) {
			System.out.print(", " + item);
		}
		
	}

	@Override
	public void showTeamNameOrMemberName(String[] teamOrMember) {
		System.out.print("팀명 또는 선수 소개 : ");
		for(String teamOrMember1 : teamOrMember) {
			System.out.print(", " + teamOrMember);
		}
		
	}
	
	

}
