package com.kh.example.test.model.vo;

// Ŭ���� child2�� ParentŬ������ ��ӹ޴´�.
// ���� ��Ű�� �ȿ� �־ import�� �ؼ� ��ġ�� ��� ��  �ʿ䰡 ����.
public class Child2  extends Parent{
	private String str;
	
	public Child2() {
//		super.num = 10;
		super.dNum = 0.0;
		super.bool = false;
		super.ch = 'A';
		
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
