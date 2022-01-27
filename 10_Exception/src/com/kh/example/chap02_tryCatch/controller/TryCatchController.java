package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		try {
			method2();
			System.out.println("에외 발생 시에는 출력되지 않음");
			// 아직 폭탄 처리가 안되었기 때문에 출력이 안됨
		}// catch (Exception e) {
		  //	System.out.println("Exception으로 잡음");
			// Exception은 부모 클래스이기 때문에 IOException가 하는 일이 없어짐
		// 그래서 상속관계를 고려해 IOException 밑에 넣어줌
		
		 catch (IOException e) {	
//		Unreachable catch block for IOException. 
//		It is already handled by the catch block for Exception
		// 
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception으로 잡음");
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행");
		}
		System.out.println("method1() 종료됨...");
	}
	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
//		throw new NullPointerException();
		// NullPointerException클래스RunTimeException클래스의 후손 클래스이기때문에
		// Unchecked Exception으로 분류되어 예외처리가 필요 없음
		
		throw new IOException();
		
//		System.out.println("method2() 종료됨...");
		// Unreachable code : 에러가 떠서 도달할 수 없는 코드
	}
}
