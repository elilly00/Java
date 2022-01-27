package com.kh.operator;

public class D_comparison {
	public void method() {
		int a = 10;
		int b = 25;
		boolean result1;
		boolean result2;
		boolean result3;
		
		result1 = ( a == b );
		result2 = a <= b;
		result3 = (a > b);
		
		System.out.println(result1);  // false
		System.out.println(result2);  // true
		System.out.println(result3);  // false
		
		System.out.println("b가 짝수인가? : " + (b % 2 == 0)); // 짝수는 나머지가 0으로 떨어지기 때문에 %(모듈러)를 이용해서 나머지 값을 구한다
		System.out.println("b가 홀수인가? " + (b % 2 == 1));
		System.out.println("b가 홀수인가? : "+ (b % 2 != 0));	
		System.out.println("b가 홀수인가? : " + !(b % 2 == 0));
		
	}

}
