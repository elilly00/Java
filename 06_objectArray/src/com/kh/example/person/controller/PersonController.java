package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		// person ��ü�� �� �� �ִ� 5���� ���� pArr����
		Person[] pArr = new Person[5];	//null ���� ���
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
//		System.out.println(pArr[0].getName()); 
		// java.lang.NullPointerException ������ �� -> why? �ʵ忡 �ʱ�ȭ�� �ȵǾ� �־ 
		//  ��>  pArr[0]�ִ� null�� �� �ֱ� ������ getName()�� ������ �� ���� 
		
//		pArr[0] = new Person();	// person ��ü�� �ּҰ��� ��� ��
		pArr[0] = new Person("���ǰ�", 25, '��', 185.6, 67.6);
		pArr[1] = new Person();
		pArr[2] = new Person();
		pArr[3] = new Person();
		pArr[4] = new Person();
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
	
		System.out.println(pArr[0].getName()); 
		// pArr[0]���� Person��ü�� �� �ֱ� ������ getName()�� ������ �� ����
		// null�� �ߴ� ������ Person �⺻ �����ڷ� ������� ������ �ʵ� �ʱ�ȭ x
		// ��, String name�� �⺻ ��  null�� �� �����Ƿ� null ��ȯ
	}	
	
	public void method2() {
		// �҉��� ���ÿ� �ʱ�ȭ
		Person[] pArr = {new Person("������", 14, '��', 167.7, 61.5),
						 new Person("�����", 31, '��', 182.4, 67.5),
						 new Person("�����", 18, '��', 172.4, 56.1)};
				
		for(int i = 0; i < pArr.length; i++) {	
			System.out.println(pArr[i]);					// Person ��ü�� �ּ� �� ���
		}
		
		for(int i = 0; i < pArr.length; i++) {		
			System.out.println(pArr[i].personInfo());		// Person ��ü�� �� ���
		}
		}
	
}
