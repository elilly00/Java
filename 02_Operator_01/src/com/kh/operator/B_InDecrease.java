package com.kh.operator;

public class B_InDecrease {
	public void method1() {
		int num1 = 20;
		
		// ���� ������ ����
		System.out.println("���� ���� ������ ���� �� : " + num1);	// 20
		System.out.println("++num1�� 1ȸ ���� �� ��� : " + (++num1));		// 21
		System.out.println("++num1�� 2ȸ ���� �� ��� : " +(++num1));		// 22
		System.out.println("++num1�� 3ȸ ���� �� ��� : " + (++num1));		// 23
		System.out.println("++num1�� 4ȸ ���� �� ��� : " + (++num1));		// 24
		System.out.println("++num1�� 5ȸ ���� �� ��� : " + (++num1));		// 25
		System.out.println("���� ���� ���� ���� �� num1�� �� : " +num1);		// 25
		
		// ���� ������ ����
		int num2 = 20;
		System.out.println("���� ���� ������ ���� �� : " + num2);	// 20
		System.out.println("num2++�� 1ȸ ���� �� ��� : " + (num2++));		// 20
		System.out.println("num2++�� 2ȸ ���� �� ��� : " + (num2++));		// 21
		System.out.println("num2++�� 3ȸ ���� �� ��� : " + (num2++));		// 22
		System.out.println("num2++�� 4ȸ ���� �� ��� : " + (num2++));		// 23
		System.out.println("num2++�� 5ȸ ���� �� ��� : " + (num2++));		// 24
		System.out.println("���� ���� ���� ���� �� num2�� �� : " + num2);		// 25
		
		}
	public void method2() {
		int age = 27;
		System.out.println("���� ���̴�? : " + age);	// 27
		System.out.println("++age : " + (++age));	// 28
		System.out.println("age++ : " + (age++));	// 28 
		// age = 29
		System.out.println("--age : " + (--age));	// 28
		System.out.println("age-- : " + (age--));	// 28
		// age = 27
		System.out.println("���� ���̴�? : " + age);	// 27
		
	}
	
	public void method3() {
		int num1 = 15;
		int result1 = num1++ * 4;	// 15*4 = 60
		// num1 = 16
		System.out.println("num1�� �� : " + num1);	// 16
		System.out.println("result1�� �� : " + result1);	// 60
		
		System.out.println();
		
		int num2 = 3;
		int result2 = num2-- + 2;	// 3+2 = 5
		// num2 = 2
		System.out.println("num2�� �� : " + num2);	// 2
		System.out.println("result2�� �� : " + result2);	// 5
		
	}
	public void method4() {
		int a = 10;
		int b = 24;
		int c = 16;
		
		System.out.println("a++ : " + (a++));	// 10
		// a = 11
		System.out.println("b-- : " + (b--));	// 24
		// b = 23
		System.out.println("--c : " + (--c));	// 15
		
		System.out.println("a�� �� : " + a);	// 11
		System.out.println("b�� �� : " + b);	// 23
		System.out.println("c�� �� : " + c);	// 15
	}
	
	public void method5() {
		int a = 15;
		int b = 34;
		int c = 7;
		
		System.out.println((++a) + (--c));	// 16+6 = 22
		// a = 16 , c = 6
		System.out.println((a--) + c + (b++));	// 16+7+34 = 57
		// a = 15 , b = 35
		System.out.println((a) + (c--) + (++b));	// 14+7+36 = 64
		// b = 36 , c = 5
		
		System.out.println("a�� �� : " + a);	// 15
		System.out.println("b�� �� : " + b);	// 36
		System.out.println("c�� �� : " + c);	// 5
		
		
	}

}
