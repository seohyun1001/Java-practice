package ex_240228;

import java.util.Scanner;

public class Ex_5_Operator2 {

	public static void main(String[] args) {
		
	System.out.println("전위 및 후위 연산자 확인해보기");
	int a = 2;
	int b = ++a;
	// a의 값을 먼저 1 증가 시키고, 그 다음에 b에 할당
	
	int a2 = 2;
	int b2 = a2 ++;
	// b에 할당 먼저, 그 다음에 a의 값을 1 증가시킴
	
	
	
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("a2 : " + a2);
	System.out.println("b2 : " + b2);
	
	
	
	// char 값 : 유니코드
	char charTest1 = 'a';
	char charTest2 = 'b';
	int charTest1ToInt = charTest1;
	System.out.println("char a에 해당하는 유니코드 값 십진수 표현 : " + charTest1ToInt);
	int charTest2ToInt = charTest2;
	System.out.println("char b에 해당하는 유니코드 값 십진수 표현 : " + charTest2ToInt);	
	System.out.println("char a는 char b보다 큰가? " + ('a' > 'b'));
	
	
	
	// 삼항 다항식
	int x = 10;
	int y = 12;
	int result = (x>y) ? x : y;
	System.out.println("삼항 다항식 result : " + result);
	
	if(x>y) {
		System.out.println("if문 result : " + x);
	} else {
		System.out.println("if문 result : " + y);
	}
	}

}
