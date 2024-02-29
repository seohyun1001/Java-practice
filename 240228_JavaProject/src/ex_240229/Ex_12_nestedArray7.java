package ex_240229;

public class Ex_12_nestedArray7 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 3과목의 점수를 입력받아서 총점, 평균
		// 1. 기본 배열을 만듦 -> 1번 학생 : {70, 80, 90} -> 5명 의 점수를 더미로 입력
		// 출력 형식 : 1번 학생의 총점 : 점, 평균 : 점
		int score [][] = {
				{70, 80, 90}, // score [0][]
				{90, 80, 90},
				{100, 80, 90},
				{60, 70, 80},
				{70, 50, 50}
		};
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
				System.out.println((i+1) + "번 학생의 총점 : " + sum + "점 / 평균 : " + sum/score[i].length + "점");
		}
		// 2. 스캐너에서 학생수를 몇 명인지 입력 받고, 해당 임의의 점수를 직접 입력 후 집계
		// 3. 학생 수도 임의로 1 이상 10미만으로 자동 설정, 점수도 
		// 4. 

	}

}
