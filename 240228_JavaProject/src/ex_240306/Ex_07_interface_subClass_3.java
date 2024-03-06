package ex_240306;

public class Ex_07_interface_subClass_3 extends Idol_abstract implements singer {

	// 상속, 인터페이스를 동시에 진행함
		// 부모 클래스를 가져다 사용하려면, 부모 클래스가 초기화가 되어야 하고
		// 또한 추상 메서드들이 재정의 되어야 함
		// 컴파일러가 제시 해주는 코드 템플릿을 이용하고
		// 우리는 구현부만 따로 정의해서 사용함
	
	public Ex_07_interface_subClass_3(String groupName, String[] groupMembers, String[] groupAlbums) {
		super(groupName, groupMembers, groupAlbums);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void song() {
		System.out.println("감미로움");
		
	}

	@Override
	public void doSign() {
		System.out.println("kindness");
		
	}

	@Override
	public void dance() {
		System.out.println("excellent");
		
	}

	// 추상 클래스에서 받은 것
	@Override
	public void introduceActivityArea() {
		System.out.println("Korea, Japan, America");
		
	}





}
