package com.kh.example.chap03_user.model.exception;

public class MyException extends Exception {	// Exception을 상속해야 예외클래스가 됨
	public MyException() {}		// 기본 생성자
	public MyException(String msg) {	// 매개변수가 있는 생성자만 있으면 됨
		super(msg);
	}
	
}
