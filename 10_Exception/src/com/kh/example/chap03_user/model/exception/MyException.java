package com.kh.example.chap03_user.model.exception;

public class MyException extends Exception {	// Exception�� ����ؾ� ����Ŭ������ ��
	public MyException() {}		// �⺻ ������
	public MyException(String msg) {	// �Ű������� �ִ� �����ڸ� ������ ��
		super(msg);
	}
	
}
