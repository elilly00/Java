package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age;
		final int AGE;
		
		age = 10;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		System.out.println("-------------------------------");
		
		// ���� �� ����
	
		age = 18;
//		AGE = 10;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
	}
	

}
