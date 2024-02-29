package ex_240229;

public class Ex_10_array5 {

	public static void main(String[] args) {

		int [] array = {1,2,3,4,5};
		System.out.println("for each 예제1");
		for(int i : array) {
			System.out.print(i +", ");
		}
		System.out.println();
		System.out.println("for each 예제2");
		String [] array2 = {"a", "b", "c", "d", "e"};
		for (String text : array2) {
			System.out.print(text);
		}
	}

}
