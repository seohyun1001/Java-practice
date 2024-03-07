package ex_240307;

public class Ex_00_sports {
	// Sport : super
	// 공통 멤버 변수 : 1) 이름, 2) 인원수 3) 플레이 시간 4) 운동 장소
	private String sportsName;
	private int sportsMemberCount;
	private String sportsPlayTime;
	private String sportsPlace;
	
	// 생성자
	public Ex_00_sports(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		this.sportsName = sportsName;
		this.sportsMemberCount = sportsMemberCount;
		this.sportsPlayTime = sportsPlayTime;
		this.sportsPlace = sportsPlace;
	}
	
	// generate getter
	// skip setter
	public String getSportsName() {
		return sportsName;
	}

	public int getSportsMembercount() {
		return sportsMemberCount;
	}

	public String getSportsPlayTime() {
		return sportsPlayTime;
	}

	public String getSportsPlace() {
		return sportsPlace;
	}


	
	

	// 공통 기능
	// 1) 이름, 인원수, 플레이 시간을 알려주는 기능
	public void showInfo() {
		System.out.println("sports name : " + this.sportsName);
		System.out.println("member count : " + this.sportsMemberCount);
		System.out.println("play time : " + this.sportsPlayTime);
	}

	// 2) 운동 장소를 알려주는 기능
	public void showPlace() {
		System.out.println("sports place : " + this.sportsPlace);
	}

	// Enum으로 문자열로 만들기 
	// 3) 시즌별 개막 계절

	
	
	
	// Swimming : sub1
	// baseball : sub2

}
