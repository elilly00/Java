package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
//	- userId:String
//	- userPwd:String
//	- userName:String
//	- enrollDate:Date(java.util)
	
	private String userId;	// �ʵ�, ����ʵ�, �������, ��������
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	{
		System.out.println(this);
	}
	// ������ ��� ����
	//		��ü�� �����ϸ鼭 �ʵ� �ʱ�ȭ�ϱ� ���� ���
	
	// ������ Ư¡
	//		1. ������ ���� Ŭ���� ��� ����
	//		2. ��ȯ�� �������� ����
	
	// �⺻ ������
	//		�ƹ� �Ű������� ���� ������
	//		������ �ʾƵ� JVM�� �⺻������ ��������
	//		�⺻ �����ڰ� ���� ���¿��� �Ű����� �ִ� �����ڸ� ������ָ� �⺻�����ڴ� �ڵ����� �������� ����
	public User() {}		// �⺻�����ڴ� ����ó�� �׻� �־� �ֱ�
	
	// �Ű����� �ִ� ������
	//		�Ű������� �ִ� ������
	//		�Ѱ� ���� �Ű������� �̿��Ͽ� �ʵ� �ʱ�ȭ
	//		
	public User(String userId, String userPwd, String userName, Date enrolldate) {	// void�� ���� ����
//		this.userId = userId;		// �Ķ��� �κ��� �ʵ�� ���� ����, ������ ���������� �Ű������� ����
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);	// this ������
		this.enrollDate = enrollDate;
	}
	
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd);		// this() ������
		this.userName = userName;
	}
	
	public User(String userId, String userPwd) {	// �����ε� �ȵȰ��� why? �Ű������� ����, Ÿ��, ���� ��� ���� ����
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
//	public User(String id, String name) {	// �����ε� �ȵȰ���	// �Ű������� �̸��� �������� ���� (������ �Ű������� Ÿ�Ը� ���� ��)
//		userId = id;
//		userName = name;
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
}
