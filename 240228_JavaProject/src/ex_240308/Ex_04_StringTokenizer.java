package ex_240308;

import java.util.StringTokenizer;

public class Ex_04_StringTokenizer {

	public static void main(String[] args) {
		// query의 형식은 HTML의 웹브라우저에서 get방식으로 서버에 전달하면
		// 동적인 파라미터라고 함
		String query = "name=ksh&addr=busan&age=26";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		// 분리된 문자열의 전체 개수 구하기
		int n = st.countTokens();
		System.out.println("분리된 문자열의 전체 개수 : " + n);
		
		System.out.println("while문으로 값의 존재유무 확인 후");
		System.out.println("다음 토큰 값 호출 메서드로 확인");
		while (st.hasMoreTokens()) {
			String nextString = st.nextToken();
			System.out.println("출력하기 : " + nextString);
		}
//		String query = "name=ksh&addr=busan&age=26";
		StringTokenizer st2 = new StringTokenizer(query, "&=");
		System.out.println("while문으로 값의 존재유무 확인 후");
		System.out.println("다음 토큰 값 호출 메서드로 확인");
		while (st.hasMoreTokens()) {
			String nextString2 = st2.nextToken();
			System.out.println("출력하기 : " + nextString2);
		}
		

	}

}
