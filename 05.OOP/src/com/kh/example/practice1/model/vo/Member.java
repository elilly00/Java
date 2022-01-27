package com.kh.example.practice1.model.vo;

public class Member {
	// 속성 부분
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gneder;
	private String phone;
	private String email;
	
	// 기능 부분
	public void changeName(String name) {	// 외부로붙터 받아옴
		memberName = name;
		
	}
	public void printName() {
		System.out.println("name : " + memberName);		// name은 changeName에서 긑났기 때문에 memberName을 받아와야함
	}
}
