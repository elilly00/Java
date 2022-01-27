package com.kh.variable;

public class A_Variable {
	public void declarVariable() {
		// 변수 선언 후 초기화
		// A. 변수 선언
		boolean isTrue;
		
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		float fNum;
		double dNum;
		
		char ch;
		String str;
		
		// B. 초기화(대입)
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 8.0d; // dNum = 8.0;
		
		ch = 'A';
		str = "hello";
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		
	}
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		boolean isTrue = false;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		float fNum = 4.0f;
		double dNum = 8.0;
		
		char ch = 'a';
		String str = "bonjour";
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		
	}	
}
