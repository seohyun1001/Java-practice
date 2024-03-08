package ex_240308;

public class Ex_03_StringBuffer {

	public static void main(String[] args) {
		String str3 = new String("Hi");
		String str4 = new String("Hi");
		String str3Concat‎ = str3.concat(" world");
		String str4Concat‎ = str4.concat(" world");
		
		System.out.println("str3Concat‎ : " + str3Concat‎);
		System.out.println("str4Concat‎ : " + str4Concat‎);
			System.out.println("str3Concat‎.hashCode : " + str3Concat‎.hashCode());
			System.out.println("str4Concat‎.hashCode : " + str4Concat‎.hashCode());
			
			System.out.println();
			
			System.out.println("identityHashCode of str3,4 before concat");
			
			System.out.println("str3 System.identityHashCode : " + System.identityHashCode(str3));
			System.out.println("str4 System.identityHashCode : " + System.identityHashCode(str4));

			System.out.println();

			System.out.println("identityHashCode of str3,4 after concat");

			System.out.println("str3Concat System.identityHashCode : " + System.identityHashCode(str3Concat‎));
			System.out.println("str4Concat System.identityHashCode : " + System.identityHashCode(str4Concat‎));

	}

}
