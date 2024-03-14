package ex_240311_Test;

public class StudentScore {

	public static void main(String[] args) {
		int[][] scores = {
				 {80,60,70}, 
				 {90,95,80}, 
				 {75,80,100}, 
				 {80,70,95}, 
				 {100,65,80}
				};
		
		System.out.println("학생번호  국어  영어  수학  총점  평균");
		System.out.println("=================================");
		showSumAndAvg(scores);
	}
	
	public static void showSumAndAvg(int[][] scores) {

		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			
			int avg = sum / scores[i].length;
			System.out.println(
					(i+1) + "번 학생: "
					+ scores[i][0] + "   "
					+ scores[i][1] + "   "
					+ scores[i][2] + "   "
					+ sum + "   "
					+ avg);
		}
	}

}
