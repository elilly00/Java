package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	
	public void method1() throws Exception {
		System.out.println("method1() ȣ���...");
		method2();
		System.out.println("method1() �����...");
		
	}
	public void method2() throws Exception {
		System.out.println("method2() ȣ���...");
		mehtod3();	
		System.out.println("method2() �����...");
		
	}
	public void mehtod3() throws Exception {
		System.out.println("method3() ȣ���...");
		// ���� Exception �߻� -> throw ��� : try~catch X -> ���� �߻� ��Ų �ǹ̰� ���� ������ 
		// ������ ��Ű�� ��
		throw new Exception();	// ���� �߻� ��Ű�� throws�� ����
		// Unhandled exception type Exception 
		// : Exception Ÿ�Կ� ó������ ���� ���ܰ� �ִ�.
//		System.out.println("method3() �����...");
		// Unreachable code : �������� ���ϴ� �ڵ� 
		// ���ܰ� �߻��� �Ǹ� ������ ���ᰡ �Ǳ⶧���� �ؿ� �ڵ尡 �ִ��� ������ �ȵ�
		// ������ ���ѵ� �Ȱ��� ������ ���� ���� �߱� ������ �ּ� ó�� ��Ŵ
	}
}

