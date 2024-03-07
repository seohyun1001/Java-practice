package ex_240307;

public interface Ex_00_interface {
	// 인터페이스 설계 -> 1) 상수 2) 추상 메서드
	// 반드시 이 기능은 구현해야 하는 기능
	// 1) 실내인지 실외인지 알려주는 기능
	void showInOutPlace(int checkInOutPlace);
	
	// 2) 사용하는 운동 아이템을 알려주는 기능
	void showUseItems(String[] items);
	
	// 3) 팀명 또는 팀원들을 알려주는 기능
	void showTeamNameOrMemberName(String[] teamOrMember);
	
	

}
