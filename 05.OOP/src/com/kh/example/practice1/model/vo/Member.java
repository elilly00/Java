package com.kh.example.practice1.model.vo;

public class Member {
	// �Ӽ� �κ�
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gneder;
	private String phone;
	private String email;
	
	// ��� �κ�
	public void changeName(String name) {	// �ܺηκ��� �޾ƿ�
		memberName = name;
		
	}
	public void printName() {
		System.out.println("name : " + memberName);		// name�� changeName���� �P���� ������ memberName�� �޾ƿ;���
	}
}
