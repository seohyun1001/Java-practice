package ex_240311_Test;

import java.util.Scanner;


public class PhoneManager extends Phone{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        PhoneManager phoneManager = new PhoneManager();

        System.out.print("인원수 >> ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
            String[] input = scanner.nextLine().split(" ");

            phoneManager.addPhone(input[0], input[1], input[2]);
        }

        System.out.println("저장되었습니다...");
        System.out.println();

        while (true) {
            System.out.print("검색할 이름 >> ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            
            phoneManager.searchPhone(name);
        }

        scanner.close();
		
	}

}
