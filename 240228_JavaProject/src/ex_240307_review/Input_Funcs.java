package ex_240307_review;

import java.util.Scanner;

public class Input_Funcs {
	// 1. 스포츠 등록하는 기능
	// the function of inputing sports informations at consoles
	
	//해당 등록하는 함수에 입력 타입으로 스포츠 타입의 레퍼런스 변수(인스턴스)
	// 메서드 입력값
	// 들어갈 때는 빈 인스턴스가 들어가고
	// 메서드 반환값
	// 나올 때는 인스턴스에 콘솔에서 입력한 데이터가 나옴
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
		
		
		System.out.println("Input the number of indoor or outdoor(in string) >>");
		String sportsInOut = scanner.next();
		
		
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
		System.out.println("sports name : " + sportsname);
		System.out.println("member count : " + sportsMemberCount);
		System.out.println("play time : " + sportsPlayTime);
		System.out.println("place : " + sportsPlace);
		System.out.println("open season : " + sportsSeason);
		System.out.println("indoor or outdoor : " + sportsInOut);
		System.out.println("members : " + members);
		System.out.println("equipment : " + items);
	}
}
