package com.kh.example.chap06_method.controller;

import com.kh.example.chap06_method.medel.vo.Trainee;

public class MethodPractice {
	// �Ű����� ������ ��ȯ �� ������ ���� ����
	// 1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void method1() {
		// ��ȯ ��x	     �Ű�����x		// void�� ����� ���� �ȿ� ��� �� ����
		String str = "�Ű������� ��ȯ �� �� �� ���� �޼ҵ��Դϴ�.";
		System.out.println(str);
//		return;
	}
	// 2. �Ű����� ���� ��ȯ �� �ִ� �޼ҵ�
	public int method2() {		// This method must return a result of type int : ���� ���� �ߴ� ������ return�� ��� ��
		// ��ȯ ��o      �Ű�����x
		
//		int i = 0;
//		return i;	// ������ ��ȯ
//		System.out.println("method2 : " + 0);	// run�� ȣ���� �ص� syso��� ����(���� �Ⱦ��� �������) // but, ���� ����� �ǰ� ȣ��� run�� ���� ��µ�
		return 0;	// ���� ��ȯ 
		
	}
	// 3. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		// ��ȯ ��x             �Ű�����o
		// �Ű����� : ȣ���ϴ� �ʿ��� �ѱ� �����͸� �޾ƿ��� ����
		System.out.println(num1);
		System.out.println(num2);
		int sum = num1 + num2;
		System.out.println(sum);
	}
	// 4. �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ�
	public String method4(String name, int age) {
		String str = name + "���� " + age + "���Դϴ�";
		return str;
	}
	
	// ��ȭ 1. ��ȯ ���� �迭�� ��
	public char[] method5() {
		char[] chArr = {'j', 'a', 'v', 'a'};	// ����� ���ÿ� �ʱ�ȭ
		System.out.println("MethodPractice chArr : " + chArr);	// chArr �ּҰ�
		
		return chArr;
	}
	
	// ��ȭ 2. ��ȯ ���� Ŭ������ ��
	public Trainee method6() {
		Trainee t = new Trainee("���ǰ�", 'H', "����", 98.5);
		System.out.println("MethodPractice t : " + t);
		
		return t;
	}
	
	
	
	
	
}
