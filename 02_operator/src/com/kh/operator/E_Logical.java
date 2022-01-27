package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// 입력한 정수 값이 1~100사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// 입력한 숫자가 1~100사이다
		// = 입력한 숫자가 1보다 크거나 같고 100보다 작거나 같다
		//						&&
		// = num >= 1 && num <= 100
		System.out.println("1부터 100사이의 숫자인지 확인 : " + (num >= 1 && num <= 100));
		
		
	}
	
	public void method2() {
		// 입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : " );
//		String strChar = sc.nextLine();
//		char ch = strChar.charAt(0);
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("영어 대문자가 맞습니가? : " + (ch >= 'A' && ch <= 'Z'));  // 숫자와 호환이 되서 문자도 쓸 수 있다.
		
		System.out.print("계속 하시려면 Y 또는 y를 입력하세요 : " );
		char ch2 = sc.nextLine().charAt(0);  // ch2인 이유는 한 문자이기 때문
		
		System.out.println("계속 하겠다고 하셨습니까? : " + (ch2 == 'Y' || ch2 == 'y'));
		
		
	}
	
	public void method3() {
		int a = 2;
		int b = 3;
		
		boolean c = a > b; // false
		boolean d = ++a <= b++;  // true
		//			a=3 	b=4
		
		System.out.println("a : " + a); // a = 3
		System.out.println("b : " + b); // 4
		System.out.println("c : " + c); // false
		System.out.println("d : " + d); // true
		
		System.out.println();
		
		System.out.println("!c : " + !c); // true
		System.out.println("c ! = d : " + (c != d)); //true
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // 3 % 4 == 3 -> false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); // true
		System.out.println("!d || (a - b) > 0 : " + ((!d || (a - b) > 0))); //  false
		//											false ||  -1 > 0  -> false
		
		System.out.println(!(c == d) && ((a * b == 10) || (b % 2 == 0))); //  true
		//				     ! false  &&    false	||		true -> true
		//						true &&  false  || 		true  -> true
		//							false    ||  true
	}								

}
