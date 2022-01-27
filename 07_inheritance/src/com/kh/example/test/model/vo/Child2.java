package com.kh.example.test.model.vo;

// 클래스 child2는 Parent클래스를 상속받는다.
// 같은 패키지 안에 있어서 import를 해서 위치를 평시 할  필요가 없다.
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
