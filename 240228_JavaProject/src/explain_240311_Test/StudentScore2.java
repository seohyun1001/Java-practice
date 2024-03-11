package explain_240311_Test;

public class StudentScore2 {

	public static void main(String[] args) {
		int[][] scores = {
				// scores 라는 이름의 이중배열 생성
				// 아래는 scores의 값들
				 {80,60,70}, 
				 {90,95,80}, 
				 {75,80,100}, 
				 {80,70,95}, 
				 {100,65,80}
				};

		
		System.out.println("학생번호  국어  영어  수학  총점  평균");
		System.out.println("=============================================");
		showSumAndAvg(scores);
		// scores를 인자값으로 받는 메서드 실행
	}
	
	public static void showSumAndAvg(int[][] scores) {
		// 이중배열인 scores를 매개변수로 받는 메서드 생성
		

		for (int i = 0; i < scores.length; i++) {
			// i가 scores의 길이(5)가 될 때까지 다음 문장 반복
			
			
			int sum = 0;
			// sum이라는 이름의 변수 선언 및 값 할당
			
			
			for (int j = 0; j < scores[i].length; j++) {
				// j가 scores[i]의 길이가 될 때까지 다음 문장 반복
				
				
				sum += scores[i][j];
				// sum이라는 변수에 값 재할당
				// scores[i][j]의 값을 전부 더 한다
			}
			
			int avg = sum / scores[i].length;
			// avg라는 변수 생성 및 값 할당
			// sum이라는 변수를 scores[i]의 길이(개수)만큼 나눈다
			
			
			System.out.println(
					(i+1) + "번 학생: "
					+ scores[i][0] + "   "
					+ scores[i][1] + "   "
					+ scores[i][2] + "   "
					+ sum + "   "
					+ avg);
			// 해당 문장 출력
		}
	}

}
