package com.kh.example.chap04_filed.controller;

// 변수 선언 위치에 따른 구분
public class KindsOfVariable1 {	// <-- 클래스 영역의 시작
	
	// 클래스 영역에 작성하는 변수 : 필드 = 멤버 변수 = 멤버 필드 = 전역 변수
//	int global;	// 접근제한자를 붙이지 않았음  // 특별한 설계 목적이 있지 않는 한 무조건 private을 사용해야 함
	private int global;
	
	public void method1(int num) {	// <-- 메소드 영역의 시작
//						------- <- 외부에서 데이터를 받아오는 변수 : 매개 변수
		
		// 메소드 영역에 작성하는 변수 : 지역변수
		// 매개변수도 일종의 지역변수
		// 지역변수는 선언 외에 다시 사용하기 위해서는 꼭 초기화 필요 (쓰레기 값이 들어갈 수 있기 때문)
		// 예외적으로 매개변수는 초기화 필요 x
		
		int local;
//		System.out.println(local);	// The local variable local may not have been initialized : 초기화를 안해서 에러나 난다

		System.out.println(num);	// num은 외부에서 데이터를 받아오기 때문에 넘어올때부터 초기화가 되어있는 상태
		
		System.out.println(global);	
	}	// <-- 메소드 영역의 끝
	
	public void method2() {
		System.out.println(global);	// global은 클래스 영역에 작성한 변수이기 때문에 전체 영역에 영향을 줌
//		System.out.println(local);
//		System.out.pritnln(num);	// local과 num은 method1까지만 영향을 줌
	}
}	// <-- 클래스 영역의 끝
