package com.kh.example.family.controller;

import com.kh.example.family.model.vo.Baby;
import com.kh.example.family.model.vo.Basic;
import com.kh.example.family.model.vo.Family;
import com.kh.example.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();	// ����Ʈ �ص� ��ü�� ����� ���� ����
		// Cannot instantiate the type Family 
		// �߻� Ŭ������ ��ü ���� �Ұ�, ������ ���� ����
		
		Family f1 = new Mother("����", 50, 70, "���");
		Family f2 = new Baby("�Ʊ�", 3.5, 70);
		
		// ���� ���ε� 
//		f1.eat();
//		f2.eat();
		
//		Basic b = new Basic();
		// �������̽��� ��ü ���� �Ұ�, ������ ���� ����
		Basic b1 = new Mother("����", 50, 70, "���");
		Basic b2 = new Baby("�Ʊ�", 3.5, 70);
		
		// ���� ���ε�
		b1.sleep();
		b2.sleep();
	}
}
