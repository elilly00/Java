package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	
	public void method1() throws Exception {
		System.out.println("method1() 호출됨...");
		method2();
		System.out.println("method1() 종료됨...");
		
	}
	public void method2() throws Exception {
		System.out.println("method2() 호출됭...");
		mehtod3();	
		System.out.println("method2() 종료됨...");
		
	}
	public void mehtod3() throws Exception {
		System.out.println("method3() 호출됨...");
		// 강제 Exception 발생 -> throw 사용 : try~catch X -> 강제 발생 시킨 의미가 없기 때문에 
		// 위임을 시키면 됨
		throw new Exception();	// 강제 발생 시키면 throws만 가능
		// Unhandled exception type Exception 
		// : Exception 타입에 처리되지 않은 예외가 있다.
//		System.out.println("method3() 종료됨...");
		// Unreachable code : 도달하지 못하는 코드 
		// 예외가 발생이 되면 비정상 종료가 되기때문에 밑에 코드가 있더라도 실행이 안됨
		// 위임을 시켜도 똑같은 이유로 빨간 줄이 뜨기 때문에 주석 처리 시킴
	}
}

