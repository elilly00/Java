package com.kh.variable;

public class A_Variable {
	public void declarVariable() {
		// ���� ���� �� �ʱ�ȭ
		// A. ���� ����
		boolean isTrue;
		
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		float fNum;
		double dNum;
		
		char ch;
		String str;
		
		// B. �ʱ�ȭ(����)
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 8.0d; // dNum = 8.0;
		
		ch = 'A';
		str = "hello";
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		
	}
	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ
		boolean isTrue = false;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		float fNum = 4.0f;
		double dNum = 8.0;
		
		char ch = 'a';
		String str = "bonjour";
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		
	}	
}
