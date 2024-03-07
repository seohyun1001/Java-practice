package ex_240307_review;

import java.util.Scanner;

public class Main2_Console_Mode {

	public static void main(String[] args) {
		// 1. 스포츠 등록하기  -> 메서드로 만들기
		while(true) {
			System.out.println("============= Sports =============");
			System.out.println("해당 번호 1~3번 중 하나를 선택해주세요.");
			System.out.println("1. 스포츠 등록하기");
			System.out.println("2. 등록된 스포즈 검색하기");
			System.out.println("3. 종료하기");
			
			Scanner scanner = new Scanner(System.in);
			int checkNum = scanner.nextInt();
			if (checkNum == 3) {
				System.out.println("종료합니다.");
				scanner.close();
				break;				
				
				
			} else if(checkNum == 1) {
				// 스포츠 등록하는 메서드
				System.out.println("스포츠 등록하기");
				
				
			} else if(checkNum == 2) {
				// 스포츠 검색하는 메서드
				System.out.println("스포츠 검색하기");
				
				
			} else {
				System.out.println();
				System.out.println("*주의) 1~3번 숫자를 입력해주세요!");
				System.out.println();
				continue;
			}
		}
	}
}
