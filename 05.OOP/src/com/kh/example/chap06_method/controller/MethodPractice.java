package com.kh.example.chap06_method.controller;

import com.kh.example.chap06_method.medel.vo.Trainee;

public class MethodPractice {
	// 매개변수 유무와 반환 값 유무에 따른 구분
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		// 반환 값x	     매개변수x		// void는 절대로 무언가 안에 담길 수 없음
		String str = "매개변수와 반환 값 둘 다 없는 메소드입니다.";
		System.out.println(str);
//		return;
	}
	// 2. 매개변수 없고 반환 값 있는 메소드
	public int method2() {		// This method must return a result of type int : 빨간 줄이 뜨는 이유는 return이 없어서 뜸
		// 반환 값o      매개변수x
		
//		int i = 0;
//		return i;	// 변수로 반환
//		System.out.println("method2 : " + 0);	// run에 호출을 해도 syso사용 가능(쓰던 안쓰던 상관없음) // but, 값이 출력이 되고 호출된 run의 값도 출력됨
		return 0;	// 값만 반환 
		
	}
	// 3. 매개변수 있고 반환 값 없는 메소드
	public void method3(int num1, int num2) {
		// 반환 값x             매개변수o
		// 매개변수 : 호출하는 쪽에서 넘긴 데이터를 받아오는 역할
		System.out.println(num1);
		System.out.println(num2);
		int sum = num1 + num2;
		System.out.println(sum);
	}
	// 4. 매개변수 있고 반환 값 있는 메소드
	public String method4(String name, int age) {
		String str = name + "님은 " + age + "살입니다";
		return str;
	}
	
	// 심화 1. 반환 값이 배열일 때
	public char[] method5() {
		char[] chArr = {'j', 'a', 'v', 'a'};	// 선언과 동시에 초기화
		System.out.println("MethodPractice chArr : " + chArr);	// chArr 주소값
		
		return chArr;
	}
	
	// 심화 2. 반환 값이 클래스일 때
	public Trainee method6() {
		Trainee t = new Trainee("강건강", 'H', "오전", 98.5);
		System.out.println("MethodPractice t : " + t);
		
		return t;
	}
	
	
	
	
	
}
