package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		// Parent 클래스의 num필드에 접근하기
		System.out.println("Parent클래스의  num필드에 접근");
		Parent p = new Parent();
		p.setNum(9);	// p라는 객체에 값 9가 들어감
		System.out.println("Parennt 안에 있는 num : " + p.getNum());	
	
		System.out.println();
		
		System.out.println("Child1클래스의 str필드에 접근");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 안에 있는 str : " + c1.getStr());
		
		System.out.println();
		
		System.out.println("Child2클래스의 str필드에 접근");
		Child2 c2 = new Child2();
		c2.setStr("World");	
		System.out.println("Child2 안에 있는 str : " + c2.getStr());
		System.out.println("Child2클래스가 상속받은 Parent클래스의 필드에 접근");
//		c2.num; -> 접근할 수 없음 
		// The field Parent.num is not visible
		// Parent클래스에 필드로 num이 존재해서 Child2한테 상속은 해줬으나 num의 접근제한자가 private이기 때문에 외부 접근 불가
		c2.setNum(999);
		System.out.println("Child2 안에 있는 num : " + c2.getNum());
		System.out.println("Parent 안에 있는 num : " + p.getNum());	// 주소 값이 달라 child2안에 있는 num 값이 달라져도 Parent의 num값이 변하지 않는다
		
	}
	
}
