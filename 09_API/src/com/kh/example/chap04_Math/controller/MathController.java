package com.kh.example.chap04_Math.controller;

import java.util.Random;

//Math클래스는 수학연산을 위해 사용 하는 것

public class MathController {
	public void method() {
		// Math클래스 : 수학 연산을 하기에 유용ㅇ한 메소드들을 모아놓은 클래스
		// 싱글톤 패턴으로 구성
		// 		static을 이용해 애플리케이션이 시작할 때 딱 한 번만 인스턴스를 만들어 메모리 할당
		//		딱 한 번 만든 인스턴스(객체)를 사용하게끔 만든 패턴
		//		-> 생성자 : private, 멤버 : public static
		
		double num = 4.949;
		double num2 = 4.123;
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);	// int의 최대 값
		System.out.println(Integer.MIN_VALUE);	// int의 최소 값
		
		System.out.println(Math.abs(-num));	// abs : 절대값을 뽑아주는 메소드(부호에 상관없이 순수 값만 가져오는 것)
		System.out.println(Math.ceil(num));	// 올림
		System.out.println(Math.round(num)); // 반올림
		System.out.println(Math.floor(num)); // 내림
		
		System.out.println(Math.abs(-num2));	
		System.out.println(Math.ceil(num2));
		System.out.println(Math.round(num2));	// long값이기 때문에 정수 값으로 출력 됨
		System.out.println(Math.floor(num2)); 
		
		int random = (int)(Math.random()*4) + 1;
		System.out.println(random);
		
		Random r = new Random();	// Random 이라는 클래스도 존재 함
//		System.out.println(r.nextInt());	// Int 범위에 있는 모든 수가 나옴
		System.out.println(r.nextInt(4));	// 1~3까지의 수가 나옴
		System.out.println(r.nextInt(4) + 1);	// 1~4까지의 수가 나옴
		
		System.out.println(Math.rint(num));		// 가장 가까운 값이 나옴
		System.out.println(Math.rint(num2));
		
		System.out.println(Math.sqrt(3));	// 루트 값
		System.out.println(Math.pow(2, 3)); // 2의 3승 
		
		System.out.println(Math.max(10, 4));	// 두 개의 값 중 큰 값
		System.out.println(Math.min(10, 4));	// 두 개의 값 중 작은 값
		
		
	}
}
