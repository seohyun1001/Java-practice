package ex_240229;

public class Ex_7_array2 {

	public static void main(String[] args) {

		int intArray[];

		intArray = new int[2];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100);
		}
		// 값 변경 전.
		System.out.println("======= 값 변경 전========");
		// 원본 : intArray
		System.out.println("======= intArray =======");
		showArrayElement(intArray);

		// 얕은 복사 : 원본의 값이 변경되면 copyArray1도 영향을 받는다
		System.out.println("======= copyArra1 =======");
		int copyArray1[] = intArray;
		// intArray가 가리키는 메모리 위치의 주소값만 복사
		showArrayElement(copyArray1);

		// 깊은 복사 : 원본의 값이 변경되면 copyArray2는 영향을 받지 않는다
		System.out.println("======= copyArray2 =======");
		int copyArray2[] = intArray.clone();
		showArrayElement(copyArray1);
		
		System.out.println("");

		// 값 변경하기.
		System.out.println(" ======= 값 변경 후 intArray[0] = 1000; ========");
		intArray[0] = 1000;
		System.out.println(" ======= intArray ========");
		showArrayElement(intArray);
		System.out.println(" ======= copyArray1 ========");
		showArrayElement(copyArray1);
		System.out.println(" ======= copyArray2 ========");
		showArrayElement(copyArray2);
	}

	public static void showArrayElement(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
