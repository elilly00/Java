package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member();	// 초기화를 먼저 한 후 값을 넣음
//		m.printName();	// printName만 불어오면 memberName안에 대입된 값이 없기때문에 null이라고 출력 됨 
		m.changeName("박정은");	// 그래서 changeName을 불러와서 값을 입력하고 
		m.printName();			// printName을 불러오면 입력한 값이 출력 됨
	}
}
