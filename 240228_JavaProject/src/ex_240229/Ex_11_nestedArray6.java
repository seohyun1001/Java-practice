package ex_240229;

public class Ex_11_nestedArray6 {

	public static void main(String[] args) {
		// 이중 배열
		int[][] array1 = new int [2][2];
		// -> int [][] array1 = {{0,0}, {0,1}}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				array1[i][j] =  j;
		// -> 반복문으로 임의로 이중배열 생성
			}
		}
		
		// 출력
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array1[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
		
		
		int [][] array2 = {{1,2}, {3,4}};
		// 출력
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						System.out.print(array2[i][j]);
						System.out.print('\t');
					}
					System.out.println();
				}
	}

}
