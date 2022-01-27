package com.kh.example.person.run;

import com.kh.example.person.controller.PersonController;

public class Run {
	public static void main(String[] args) {
		PersonController pc = new PersonController();
//		pc.method1();	// person값에 대한 null이 출력 됨
		pc.method2();	// pc = PersonController 객체를 의미
		
	}
}
