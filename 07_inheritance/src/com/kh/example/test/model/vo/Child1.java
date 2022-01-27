package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	
	public Child1() {
		Parent p = new Parent(); // Object의 후손 클래스인 Parent와 Child1은 암
//		p.num = 10;	// 접근범위가 private이기 대문에접근  불가능
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
