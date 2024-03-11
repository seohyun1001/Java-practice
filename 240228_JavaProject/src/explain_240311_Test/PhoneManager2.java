package explain_240311_Test;

import java.util.Scanner;

public class PhoneManager2 extends Phone2{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 스캐너 가동
		PhoneManager2 phoneManager2 = new PhoneManager2();
		
		
		System.out.println("인원수 >>");
		int peopleCount = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < peopleCount; i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력), 주소 >>");
			String [] inputed = scanner.nextLine().split(" ");
            // inputed라는 배열은 공백을 기준으로 다음 줄의 요소들을 나누어 받는다
            // ex) 사과 바나나 포도 입력
            //	-> inputed 배열의 요소에 [사과, 바나나, 포도]가 들어가게 됨
            // 그 inputed 배열을 가지고 phoneManager의 변수로 넣어줌
			phoneManager2.addInfo(inputed[0], inputed[1], inputed[2]);			
		}
		
		System.out.println("저장되었습니다...");
		System.out.println();
		
		while (true) {
			System.out.println("검색할 이름 >> ");
			String name = scanner.nextLine();
			if (name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			phoneManager2.searchInfo(name);
		}
		
		scanner.close();
	}

}
