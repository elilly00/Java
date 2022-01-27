package com.kh.example.test.controller;

import java.util.Scanner;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class PolyController {
	public void method() {
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü �ٷ�� ���");
		Parent p1 = new Parent();
		// ��> �θ�Ÿ�� ���۷���   ��> �θ�ü
		p1.printParent();
		
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���");
		Child1 c1 = new Child1();
		// ��> �ڽ�Ÿ�� ���۷���   ��> �ڽİ�ü	
		c1.printChild1();
		c1.printParent();
		
		
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���");
		Parent p2 = new Child2();	// ������ ����
		// ��> �θ�Ÿ�� ���۷���   ��> �ڽİ�ü
		// �� ĳ���� : �θ�Ÿ���� ������ ������ ��� �ڽ� ��ü�� ���� �� �ִ� ��

		p2.printParent();
//		p2.printChild2();	// p2 -> Parent Ÿ�Ը� �� �� ����
		((Child2)p2).printChild2();		// p2�� Child2�� �ٲ� ��
		// �ٿ� ĳ���� 
		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü �ٷ�� ���");
//		Child2 c2 = new Parent();
		// ��> �ڽ�Ÿ�� ���۷���   ��> �θ�ü
		
		System.out.println();
		System.out.println("== ���� ���� ==");
		System.out.println();
		
		Parent[] pArr = new Parent[4];		// pArr�� 4��¥�� �迭�� ��
		// �� ĳ������ ����� ����
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		
//		((Child1)pArr[0]).printChild1();
//		((Child2)pArr[1]).printChild2();
//		((Child2)pArr[2]).printChild2();
//		((Child1)pArr[3]).printChild1();
		// �ٿ� ĳ������ �ؾ� ���� ��µȴ�.	// �ϳ��ϳ��� ĭ�� � ���� ����ִ��� �˶� ���
		
		for(int i = 0; i < pArr.length; i++) {
			// instanceof ������ : ������ ������ ������ � Ŭ�������� ��ü�� �����ϰ� �ִ��� Ȯ���� �� ���
//			pArr[0] instanceof Child1		// pArr[0]�� ���ִ� ��ü�� Child1�� Ÿ���̴�?  => true
//			pArr[1] instanceof Child1		// pArr[1]�� ���ִ� ��ü�� Child2�� Ÿ���̴�?  => true
//			pArr[2] instanceof Child1		// pArr[2]�� ���ִ� ��ü�� Child1�� Ÿ���̴�?  => false
//			pArr[3] instanceof Child2		// pArr[3]�� ���ִ� ��ü�� Child2�� Ÿ���̴�?  => false
			// instanceof �������� ��� ���� true/false -> ���ǽĿ� ���� ��� ��
			
			if(pArr[i] instanceof Child1) {		// pArr[i]�� ���ִ� ��ü�� Child1�̸�
				((Child1)pArr[i]).printChild1();	// �ٿ� ĳ���� ���
			} else if(pArr[i] instanceof Child2){	
				((Child2)pArr[i]).printChild2();
			}
//			pArr[i].printParent();		// parent ���� ���� ��
		}
		
		System.out.println();
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();	// Parent���� print�� �� �� �˾Ҵµ� Child1, 2�� ��� �ȴ� 
		//   ��> Person ���۷��� `
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
