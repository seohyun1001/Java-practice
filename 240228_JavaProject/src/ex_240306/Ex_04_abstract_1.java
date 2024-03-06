package ex_240306;

public class Ex_04_abstract_1 extends Idol_abstract{
	// 일반 클래스는 상속을 받고, 재정의 의무성(강제성)이 없었다면,
	// 추상 클래스를 상속을 받으면, 재정의할 메서드를 반드시 구현해야 하는 의무성이 생김
	// 재정의를 구현 하지 않을 시 컴파일러 오류가 발생한다
	
	// 클래스 설계의 유연성을 위해
	// 반드시 자식 클래스에서 재정의를 한다면 굳이 부모 클래스에서 구현을 할 필요가 없음
	// 추상 클래스로 선언만 하고 -> 자식 클래스에서 재정의 하여 사용함

	public Ex_04_abstract_1(String groupName, String[] groupMembers, String[] groupAlbums) {
		super(groupName, groupMembers, groupAlbums);
		// TODO Auto-generated constructor stub
	}

	@Override // 강제적으로 추가된 부분(부모클래스에서 선언만 한 추상 메서드)
	public void introduceActivityArea() {
		// TODO Auto-generated method stub
		
	}

}
