package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));  // 13
		System.out.println("num1 - num2 = " + (num1 - num2));  // 7
		System.out.println("num1 * num2 = " + (num1 * num2));  // 30
		System.out.println("num1 / num2 = " + (num1 / num2));  // 3
		System.out.println("num1 % num2 = " + (num1 % num2));  // 1
		
		double a= 35;
		double b = 10;
		
		double add = a + b;	// 35.0 + 10.0 = 45.0
		double sub = a - b;	// 35.0 - 10.0 = 25.0
		double mul = a * b;	// 35.0 * 10.0 = 350.0
		double div = a / b;	// 35.0 / 10.0 = 3.5
		double mod = a % b;	// 5.0
		System.out.println("add : " + add);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
		System.out.println("mod : " + mod);
		
		int what = 10/10; // -> 
	}
	
	public void method2() {
		int a = 5;
		int b = 10;
		int c = (++a) + b;  // 6+10 = 16  
		// a = 6, b = 10, c = 16
		
		int d = c / a;  // 16/6 = 2
		// a = 6, b = 10, c = 16, d = 2
		
		int e = c % a;  // 16%6 = 4
		// a = 6, b = 10, c = 16, d = 2, e = 4 
		
		int f = e++; // 4 + (1) = 4
		// a = 6, b = 10, c = 16, d = 3, e = 5, f = 4 
		
		int g = (--b) + (d--);  // 9+2 = 11
		// a = 6, b = 9, c = 16, d = 1, e = 5, f = 5, g = 11
		
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);  
		// 6+9 / (15/4) * (11-1) % (6+2) = 6+9 / 3*10%8 = 6+3 * 10 % 8 = 6+30%8 = 6+6 = 12
		// a = 7, b = 9, c = 15, d = 1, e = 6, f = 4, g = 10, h = 2, i = 12
		
		System.out.println(" a : " + a);  // 7
		System.out.println(" b : " + b);  // 9
		System.out.println(" c : " + c);  // 15
		System.out.println(" d : " + d);  // 1
		System.out.println(" e : " + e);  // 6
		System.out.println(" f : " + f);  // 4
		System.out.println(" g : " + g);  // 10
		System.out.println(" h : " + h);  // 2
		System.out.println(" i : " + i);  // 12
		
	}
}
