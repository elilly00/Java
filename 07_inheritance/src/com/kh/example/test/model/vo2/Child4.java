package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child4 extends Parent {
	public Child4() {
//		super.num = 10;	
//		super.dNum = 0.0;	// 같은 패키지 내에서만 사용 가능 (접근 범위에서 넘어갔음)
		super.bool = false;	// protceted는 상속이 이루어졌을 때 다른 패키지여도 접근 가능함
		super.ch = 'A';
	}
}
