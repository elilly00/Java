package com.kh.example.chap04_filed.controller;

public class KindsOfVariable2 {
	public static int staticNum;	// 클래스 변수 // static은 private으로 사용할 수 도 있지만 public으로 더 많이 사용함
	
	private int testNum = 10;		// 인스턴스 변수
	private static int staticTestNum = 10;	// 클래스 변수
	
	public void method() {
		testNum++;
		System.out.println("testNum : " + testNum);
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
}
