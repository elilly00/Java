package com.kh.operator;

public class A_LogicalNegation {
	// 논리 부정 연산자 : !
		// 논리 갑을 반대로 바꾸는 연산자
	public void method() {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("bool1 : " + bool1);  // true
		System.out.println("bool2 : " + bool2);  // false
		System.out.println("!bool1 : " + !bool1);  // false
		System.out.println("!bool2 : " + !bool2);  // true
		System.out.println("!!bool1 : " + !!bool1);  // true
		System.out.println("!!bool2 : " + !!bool2);  // false
		
		
	}
	public void method2() {
		System.out.println("정은은 부지런한가? : " + !false);
		System.out.println("지원은 매일 운동하는가? : " + !true);
		System.out.println("아빠는 맨날 먹고자고먹고자는가? : " + !false);
		System.out.println("엄마는 늦게 일어나는가? : " + !true);
		
	}


}
