package ex_240306;

public class Ex_07_interface_main_3 {

	public static void main(String[] args) {
		String groupName = "newIdol";
		String[] groupMembers = {"mem1","mem2","mem3"};
		String[] groupAlbums = {"album1","album2", "album3"};
		
	Ex_07_interface_subClass_3 makeNewIdol = new Ex_07_interface_subClass_3(groupName,groupMembers,groupAlbums);
	makeNewIdol.introduceMember();
	makeNewIdol.introduceAlbum();
	makeNewIdol.introduceActivityArea();
	makeNewIdol.song();
	makeNewIdol.doSign();
	makeNewIdol.dance();
	}

}
