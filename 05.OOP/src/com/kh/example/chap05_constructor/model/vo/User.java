package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
//	- userId:String
//	- userPwd:String
//	- userName:String
//	- enrollDate:Date(java.util)
	
	private String userId;	// 필드, 멤버필드, 멤버변수, 전역변수
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	{
		System.out.println(this);
	}
	// 생성자 사용 목적
	//		객체를 생성하면서 필드 초기화하기 위해 사용
	
	// 생성자 특징
	//		1. 생성자 명은 클래스 명과 동일
	//		2. 반환형 존재하지 않음
	
	// 기본 생성자
	//		아무 매개변수가 없는 생성자
	//		써주지 않아도 JVM이 기본적으로 생성해줌
	//		기본 생성자가 없는 상태에서 매개변수 있는 생성자만 만들어주면 기본생성자는 자동으로 생성되지 않음
	public User() {}		// 기본생성자는 습관처럼 항상 넣어 주기
	
	// 매개변수 있는 생성자
	//		매개변수가 있는 생성자
	//		넘겨 받은 매개변수를 이용하여 필드 초기화
	//		
	public User(String userId, String userPwd, String userName, Date enrolldate) {	// void는 쓰지 않음
//		this.userId = userId;		// 파란색 부분은 필드와 색이 같고, 갈색은 지역변수의 매개변수와 같음
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);	// this 생성자
		this.enrollDate = enrollDate;
	}
	
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd);		// this() 생성자
		this.userName = userName;
	}
	
	public User(String userId, String userPwd) {	// 오버로딩 안된거임 why? 매개변수의 개수, 타입, 순서 모두 같기 때문
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
//	public User(String id, String name) {	// 오버로딩 안된거임	// 매개변수의 이름은 관여하지 않음 (오로지 매개변수의 타입만 보면 됨)
//		userId = id;
//		userName = name;
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
}
