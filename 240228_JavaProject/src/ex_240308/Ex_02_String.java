package ex_240308;

import java.util.Iterator;

public class Ex_02_String {

	public static void main(String[] args) {
		// String : 참조형 클래스
		// 변경이 불가능 -> 새로 생성해야 함
		// -> 메모리 소모가 심함
		
		// 관련 메서드 확인
		// 선언 방식에 따라서 리터럴 테이블에 저장해서 공유 재사용 할지 여부
		// 1) String str = "HELLO"; 리터럴 테이블에 저장해서 공유
		
		
		String str = "HELLO";
		String str2 = "HELLO";
		Object obj1 = (Object) str;
        Object obj2 = (Object) str2;
			System.out.println("str1.hashCode : " + obj1.hashCode());
			System.out.println("str2.hashCode : " + obj2.hashCode());
		// -> 같은 메모리 위치 주소값을 바라보고 있음
			
		// 어제 string의 hashcode를 object의 hashcode로 재정의하여 사용한 부분?
		
			
		System.out.println();
		
		
		String str3 = new String("Hi");
		String str4 = new String("Hi");
			System.out.println("str3.hashCode : " + str3.hashCode());
			System.out.println("str4.hashCode : " + str4.hashCode());

			System.out.println("str3 System.identityHashCode : " + System.identityHashCode(str3));
			System.out.println("str4 System.identityHashCode : " + System.identityHashCode(str4));
			
		
		System.out.println();
		
		
		Object objStr3 = str3;
		Object objStr4 = str4;
			System.out.println("objStr3.hashCode : " + objStr3.hashCode());
			System.out.println("objStr4.hashCode : " + objStr4.hashCode());

			System.out.println("objStr3 System.identityHashCode : " + System.identityHashCode(objStr3));
			System.out.println("objStr4 System.identityHashCode : " + System.identityHashCode(objStr4));
		
			
		System.out.println();
		
		
		// concat 함수 확인 : 문자열이 변경이 안되는 부분 확인
		String str3Concat‎ = str3.concat(" world");
		String str4Concat‎ = str4.concat(" world");
			System.out.println("str3Concat‎.hashCode : " + str3Concat‎.hashCode());
			System.out.println("str4Concat‎.hashCode : " + str4Concat‎.hashCode());
			
			System.out.println("str3Concat System.identityHashCode : " + System.identityHashCode(str3Concat‎));
			System.out.println("str4Concat System.identityHashCode : " + System.identityHashCode(str4Concat‎));
		
			
		System.out.println();
		
		
		// test
		String str5 = new String("hello");
		String str6 = new String("hello");
			System.out.println("str5.hashCode : " + str5.hashCode());
			System.out.println("str6.hashCode : " + str6.hashCode());
			
			System.out.println("str5 System.identityHashCode : " + System.identityHashCode(str5));
			System.out.println("str6 System.identityHashCode : " + System.identityHashCode(str6));
			
		System.out.println();
			
		// equals 문자열 비교하기
		// 주의) 정수형을 비교하듯이 "==" 등위 연산자를 사용하면 안됨
		String str7 = new String("hello1");
		String str8 = new String("hello2");
		String str9 = new String("hello1");
		System.out.println("str7.equals(str8) 비교 : " + str7.equals(str8));
		System.out.println("str7.equals(str9) 비교 : " + str7.equals(str9));
		
		
		System.out.println();
		
		
		// charAt(int index) :해당 인덱스에 있는 문자 리턴
		String str10 = "HELLO";
		String str11 = "HOUSE";
		char char1 = str10.charAt(3);
		System.out.println("char1(HELLO) [str10.charAt(3)] : " + char1);

		// codePointAT(int index) : 해당 인덱스에 있는 유니코드값 리턴
		System.out.println("str10.codePointAT : " + str10.codePointAt(3));
		
		// compareTo(String anotherString)
		// : 두 스트링을 사전적 순서를 기준으로 비교
		// 같으면 0
		// 현재 스트링이 비교 스트링보다 먼저 나오면 음수
		// 나중에 나오면 음수
		int strCompareTo = str10.compareTo(str11);
		int strCompareTo2 = str11.compareTo(str10);
		int strCompareTo3 = str10.compareTo(str10);
		System.out.println("str10.compareTo(str11); : " + strCompareTo);
		System.out.println("str11.compareTo(str10); : " + strCompareTo2);
		System.out.println("str10.compareTo(str10); : " + strCompareTo3);
		
		
		System.out.println();
		
		
		// contains : 찾기 기능을 구현할 때 이용하는 메서드
		// boolean contains(CharSequence s) : s에 지정된 문자들을 포함하고 있으면 리턴
		// String str10 = "HELLO";
		boolean str10Contains = str10.contains("H");
		boolean str10Contains2 = str10.contains("HL");
		boolean str10Contains3 = str10.contains("Hello");
		boolean str10Contains4 = str10.contains("HELL");
		boolean str10Contains5 = str10.contains("HELOL");
		boolean str10Contains6 = str10.contains("HELLO");
		boolean str10Contains7 = str10.contains("H,E,L,L,O");
		System.out.println("str10.contains(\"H\"); : " + str10Contains);
		System.out.println("str10.contains(\"HL\"); : " + str10Contains2);
		System.out.println("str10.contains(\"Hello\"); : " + str10Contains3);
		System.out.println("str10.contains(\"HELL\"); : " + str10Contains4);
		System.out.println("str10.contains(\"HELOL\"); : " + str10Contains5);
		System.out.println("str10.contains(\"HELLO\"); : " + str10Contains6);
		System.out.println("str10.contains(\"H,E,L,L,O\"); : " + str10Contains7);
		
		
		System.out.println();
		
		
		// 응용 검색 기능(임시 더미 DB)
		// apple 검색해보기
		System.out.println("apple 검색해보기 : " + searchFruit("apple"));
		System.out.println("apple2 검색해보기 : " + searchFruit("apple2"));
		// apple 나옴
		System.out.println("app1 검색해보기 : " + searchFruit("app1"));
		
		System.out.println("banana 검색해보기 : " + searchFruit("banana"));
		System.out.println("bnn 검색해보기 : " + searchFruit("bnn"));
	
		
		System.out.println();
		
		
		// length : 해당 문자열의 길이를 리턴
		// String str10 = "HELLO";
		System.out.println("str10.length : " + str10.length());
		

		System.out.println();
		
		
		// replace(Charsequence target Charsequence replacement)
		// : 문자열을 변경한 문자열로 대체하기
		String replace1 = str10.replace("HE", "PI");
		System.out.println("str10.replace(\"HE\", \"PI\"); : " + replace1);
		

		System.out.println();
		
		
		// String[] spilt(String regex : 정규 regex에 일치하는 부분을 중심으로 문자열 분리하기
		String str12 = "H,E,L,L,O";
		String[] resultArray1 = str10.split("");
		String[] resultArray2 = str12.split(",");
		
		showArray(resultArray1);
		System.out.println();
		showArray(resultArray2);
		
		
	}
	
	// 베열의 요소를 출력 해주는 메서드
	public static void showArray(String[] array) {
		System.out.println("=== 배열 출력하는 기능 ===");
		for(String string : array) {
			System.out.println(string);
			}
	}
	
	
	// 검색하는 메서드 만들기(생자바)
	public static String searchFruit(String search) {
		// 성공 유무를 체크하는 변수
		int resultCheck = 0;
		String resultSuccessString ="";
		String resultFailString ="";
		// 원래 검색 기능을 이용시 해당 디비에 접근을 해서 해당 내용이 있는지 유무를 확인
		String[] fruitArray = {"apple", "banana", "grape"};
		for(int i = 0; i < fruitArray.length; i++) {
			if(search.contains(fruitArray[i])) {
				resultSuccessString = fruitArray[i];
				resultCheck = 1;
			}else {
				resultFailString = "No result";
			}
		}	
		if(resultCheck == 1) {
		return resultSuccessString;
		} else {
			return resultFailString;
		}
	}
	// -> 실무에서는 
	// 화면에 검색 키워드를 전달하면(프론트)
	// 메서드 입력값에 키워드를 DB로 전달하고(백)
	// DB에서 select 구문에서 LIKE 절로 내용을 비교 -> true/false 반환(DB)
	// 위의 내용을 다시 화면으로 전달
}
