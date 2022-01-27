package com.kh.example.test.run;

import com.kh.example.test.controller.InheritanceTest;

public class Run {
	public static void main(String[] args) {
//		InheritanceTest it = new InheritanceTest();
//		it.method();	// it = new InheritanceTest()에 대한 객체
		// ↑↑  객체에서 불러올 메소드가 많을 때 사용
		
		new InheritanceTest().method();	// 변수로 만들지 않고  바로 객체를 가져와 사용
		// ↑↑ 한 객체에서 하나의 메소드만 불러올 때 많이 사용
		
	}
}
