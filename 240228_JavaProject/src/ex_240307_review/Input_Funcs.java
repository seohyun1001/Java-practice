package ex_240307_review;

import java.nio.channels.MembershipKey;
import java.util.Scanner;

public class Input_Funcs {
	// 1. 스포츠 등록하는 기능
	// the function of inputing sports informations at consoles
	public static void enrollSports() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input sports name(in string) >>");
		String sportsname = scanner.next();
		
		
		System.out.println("Input the number of people(in int) >>");
		int sportsMemberCount = scanner.nextInt();
		
		
		System.out.println("Input the play time(in string) >>");
		String sportsPlayTime = scanner.next();
		
		
		System.out.println("Input the place(in string) >>");
		String sportsPlace = scanner.next();
		
		
		System.out.println("Input the number of seasons open(in int) >>");
		System.out.println("1:Spring, 2:Summer, 3:autumn, 4:Winter");
		int sportsSeason = scanner.nextInt();
		
		
		System.out.println("Input the number of indoor or outdoor(in int) >>");
		System.out.println("1:Indoor sports, 2:Outdoor sports");
		int sportsInOut = scanner.nextInt();
		
		
		System.out.println("Input the representative 3 members' name(in string) >>");
		String[] members = new String[3];
		for(int i = 0; i < members.length; i++) {
			members[i]= scanner.next(); 
		}
		
		
		System.out.println("Input the representative 3 equipments(in string) >>");
		String[] items = new String[3];
		for(int i = 0; i < items.length; i++) {
			items[i]= scanner.next(); 
		}
		
		
		// apply inputed date at console to origin class
		
	}
	
	// 2. 스포츠 검색해서 출력하는 기능

}
