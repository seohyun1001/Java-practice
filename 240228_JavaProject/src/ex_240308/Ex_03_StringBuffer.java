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


			System.out.println();

			
			// 문제점을 개선한 StringBuffer 사용해보기
			StringBuffer str1 = new StringBuffer("HELLO");
			int str1HashCode = System.identityHashCode(str1);
			
			System.out.println("str1 : " + str1);
			System.out.println("str1 HashCode : " + str1HashCode);


			System.out.println();

				
			StringBuffer testAppend = str1.append(" WORLD");
			System.out.println("Add str1.append(\" WORLD\"); : " + testAppend);

			System.out.println("==== After adding append ====");
			System.out.println("str1 : " + str1);
			int str1HashCode2 = System.identityHashCode(str1);
			System.out.println("str1 HashCode : " + str1HashCode2);


			System.out.println();

						
			// 메서드 기능 간단히 확인
			// 현재 str1 = HELLO WORLD
			StringBuffer testInsert = str1.insert(5, " MY");
			System.out.println("Add str1.insert(5, \" MY\"); : " + testInsert);
			
			System.out.println("==== After adding insert ====");
			System.out.println("str1 : " + str1);
			int str1HashCode3 = System.identityHashCode(str1);
			System.out.println("str1 HashCode : " + str1HashCode3);
			

			System.out.println();

						
			StringBuffer testReplace = str1.replace(1, 5, "I");
			System.out.println("Add str1.replace(1, 5, \"I\"); : " + testReplace);
			System.out.println("==== After adding replace ====");
			System.out.println("str1 : " + str1);
			int str1HashCode4 = System.identityHashCode(str1);
			System.out.println("str1 HashCode : " + str1HashCode4);
			
	}

}
