package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 15;
		int num2 = 8;
		
		System.out.println("num1 + num2 = " + (num1 + num2));	// 23
		System.out.println("num1 - num2 = " + (num1 - num2));	// 7
		System.out.println("num1 * num2 = " + (num1 * num2));	// 120
		System.out.println("num1 / num2 = " + (num1 / num2));	// 1
		System.out.println("num1 % num2 = " + (num1 % num2)); 	// 7
		
		double a= 20;
		double b = 15;
		
		double add = a + b; 	// 35.0
		double sub = a - b;		// 5.0
		double mul = a * b;		// 300.0
		double div = a / b;		// 1.333333
		double mod = a % b;		// 5.0
		System.out.println("add : " + add);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
		System.out.println("mod : " + mod);
		
	}
	
	public void method2() {
		int a = 8;
		int b = 12;
		int c = (a++) + b;	// 8+12 = 20
		// a = 9 , c = 30
		int d = a * (++b);	// 9*13 = 117
		// b = 13, d = 117
		int e = (d--) / a;	// 117/9
		// d = 116 , e = 13
		int f = (a--) - c / (b++ * a) % (--d + e);	// 9
		// a = 8 , b = 14 , d = 115 , f = 9
		
		System.out.println("a : " + a);		// 8
		System.out.println("b : " + b);		// 14
		System.out.println("c : " + c);		// 20
		System.out.println("d : " + d);		// 115
		System.out.println("e : " + e);		// 13
		System.out.println("f : " + f);		// 9
		
	}
	

}
