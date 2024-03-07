package ex_240307_review;

public class Subsports extends Sports implements Interface {
	
	// add member
	// 1) info of season
	// 2) indoor or outdoor
	// 3) equipments
	// 4) member
	
	private String seasonInfo;
	private String inOrOut;
	private String[] itmes;
	private String[] members;

	public Subsports(
			String sportsName,
			int sportsMemberCount, 
			String sportsPlayTime,
			String sportsPlace,
			String seasonInfo,
			String inOrOut,
			String[] itmes,
			String[] members) {
		super(sportsName, sportsMemberCount, sportsPlayTime, sportsPlace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInOutPlace(int checkInOutPlace) {
		if(checkInOutPlace == 1) {
			System.out.println("This sport is indoor sports");
		} else {
			System.out.println("This sport is outdoor sports");
		}
		
	}

	@Override
	public void showUseItems(String[] items) {
		System.out.print("사용 장비 : ");
		for(String item :items) {
			System.out.print(item+", ");
		}
		System.out.println();
		
		
	}

	@Override
	public void showTeamNameOrMemberName(String[] teamOrMember) {
		System.out.print("팀명 및 팀원 소개 : ");
		for(String teamOrMembers :teamOrMember) {
			System.out.print(teamOrMembers + ", ");
		}
		System.out.println();
		
	}

}
