package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		// Parent Ŭ������ num�ʵ忡 �����ϱ�
		System.out.println("ParentŬ������  num�ʵ忡 ����");
		Parent p = new Parent();
		p.setNum(9);	// p��� ��ü�� �� 9�� ��
		System.out.println("Parennt �ȿ� �ִ� num : " + p.getNum());	
	
		System.out.println();
		
		System.out.println("Child1Ŭ������ str�ʵ忡 ����");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 �ȿ� �ִ� str : " + c1.getStr());
		
		System.out.println();
		
		System.out.println("Child2Ŭ������ str�ʵ忡 ����");
		Child2 c2 = new Child2();
		c2.setStr("World");	
		System.out.println("Child2 �ȿ� �ִ� str : " + c2.getStr());
		System.out.println("Child2Ŭ������ ��ӹ��� ParentŬ������ �ʵ忡 ����");
//		c2.num; -> ������ �� ���� 
		// The field Parent.num is not visible
		// ParentŬ������ �ʵ�� num�� �����ؼ� Child2���� ����� �������� num�� ���������ڰ� private�̱� ������ �ܺ� ���� �Ұ�
		c2.setNum(999);
		System.out.println("Child2 �ȿ� �ִ� num : " + c2.getNum());
		System.out.println("Parent �ȿ� �ִ� num : " + p.getNum());	// �ּ� ���� �޶� child2�ȿ� �ִ� num ���� �޶����� Parent�� num���� ������ �ʴ´�
		
	}
	
}
