package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() ȣ���...");
		try {
			method2();
			System.out.println("���� �߻� �ÿ��� ��µ��� ����");
			// ���� ��ź ó���� �ȵǾ��� ������ ����� �ȵ�
		}// catch (Exception e) {
		  //	System.out.println("Exception���� ����");
			// Exception�� �θ� Ŭ�����̱� ������ IOException�� �ϴ� ���� ������
		// �׷��� ��Ӱ��踦 ����� IOException �ؿ� �־���
		
		 catch (IOException e) {	
//		Unreachable catch block for IOException. 
//		It is already handled by the catch block for Exception
		// 
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception���� ����");
		} finally {
			System.out.println("���� �߻� ���ο� ������� ������ ����");
		}
		System.out.println("method1() �����...");
	}
	public void method2() throws IOException {
		System.out.println("method2() ȣ���...");
//		throw new NullPointerException();
		// NullPointerExceptionŬ����RunTimeExceptionŬ������ �ļ� Ŭ�����̱⶧����
		// Unchecked Exception���� �з��Ǿ� ����ó���� �ʿ� ����
		
		throw new IOException();
		
//		System.out.println("method2() �����...");
		// Unreachable code : ������ ���� ������ �� ���� �ڵ�
	}
}
