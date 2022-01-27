package com.kh.example.family.controller;

import com.kh.example.family.model.vo.Baby;
import com.kh.example.family.model.vo.Basic;
import com.kh.example.family.model.vo.Family;
import com.kh.example.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();	// 임포트 해도 객체가 만들어 지지 않음
		// Cannot instantiate the type Family 
		// 추상 클래스는 객체 생성 불가, 참조형 변수 가능
		
		Family f1 = new Mother("엄마", 50, 70, "출산");
		Family f2 = new Baby("아기", 3.5, 70);
		
		// 동적 바인딩 
//		f1.eat();
//		f2.eat();
		
//		Basic b = new Basic();
		// 인터페이스는 객체 생성 불가, 참조형 변수 가능
		Basic b1 = new Mother("엄마", 50, 70, "출산");
		Basic b2 = new Baby("아기", 3.5, 70);
		
		// 동적 바인딩
		b1.sleep();
		b2.sleep();
	}
}
