package ex_240307_review;

import java.util.Scanner;

public class Main2_Console_Mode {
	
	static Sports [] sportsArray;

	public static void main(String[] args) {		
		// 1. 스포츠 등록하기  -> 메서드로 만들기
		while(true) {
			System.out.println("============= Sports =============");
			System.out.println("해당 번호 중 하나를 선택해주세요.");
			System.out.println("1. 스포츠 등록하기");
			System.out.println("2. 종료하기");
			
			Scanner scanner = new Scanner(System.in);
			int checkNum = scanner.nextInt();
			
			if (checkNum == 2) {
				System.out.println("종료합니다.");
				scanner.close();
				break;				
				
				
			} else if (checkNum == 1) {
				// 스포츠 등록하는 메서드 
				System.out.println("스포츠 등록하기.");
				Input_Funcs.enrollSports();
				
			} else {
				System.out.println();
				System.out.println("*주의) 1번 또는 2번 숫자를 입력해주세요!");
				System.out.println();
				continue;
			}
		}
	}
}
