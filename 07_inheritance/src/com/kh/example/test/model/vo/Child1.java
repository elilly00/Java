package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	
	public Child1() {
		Parent p = new Parent(); // Object�� �ļ� Ŭ������ Parent�� Child1�� ��
//		p.num = 10;	// ���ٹ����� private�̱� �빮������  �Ұ���
		p.dNum = 0.0;
		p.bool = false;
		p.ch = 'A';
		
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
