package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child4 extends Parent {
	public Child4() {
//		super.num = 10;	
//		super.dNum = 0.0;	// ���� ��Ű�� �������� ��� ���� (���� �������� �Ѿ��)
		super.bool = false;	// protceted�� ����� �̷������ �� �ٸ� ��Ű������ ���� ������
		super.ch = 'A';
	}
}
