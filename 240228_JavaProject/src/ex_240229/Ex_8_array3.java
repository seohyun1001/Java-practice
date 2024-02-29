package ex_240229;

import java.util.Scanner;

public class Ex_8_array3 {

	public static void main(String[] args) {
		// 양수 5개 입력받아서 최대값, 최소값, 합계, 평균 구하기
		Scanner scanner = new Scanner(System.in);
		// 배열선언
		int intArray[];
		// 배열 생성
		intArray = new int[5];
		
		int max = 0;
		int min = 0;
		int sum = 0;
		int avg = 0;
		
		System.out.println("양수 5개를 입력하세요.");
		for (int i = 0; i < intArray.length; i++) {
			
			intArray[i] = scanner.nextInt();
			// 입력 받은 정수를 배열에 저장
			
			min = intArray[0];
			
			// 최대값 구하기
			if (intArray[i] > max) {
				max = intArray[i]; // max 변경
			} 
			else if (intArray[i] < min) {
                min = intArray[i]; // 현재까지의 최솟값보다 작은 값이 나오면 최솟값을 업데이트
            }
				
			sum += intArray[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평군 : " + sum/intArray.length);
		scanner.close();
	}
}