package com.kh.example.chap04_filed.controller;

// ���� ���� ��ġ�� ���� ����
public class KindsOfVariable1 {	// <-- Ŭ���� ������ ����
	
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ� = ��� ���� = ��� �ʵ� = ���� ����
//	int global;	// ���������ڸ� ������ �ʾ���  // Ư���� ���� ������ ���� �ʴ� �� ������ private�� ����ؾ� ��
	private int global;
	
	public void method1(int num) {	// <-- �޼ҵ� ������ ����
//						------- <- �ܺο��� �����͸� �޾ƿ��� ���� : �Ű� ����
		
		// �޼ҵ� ������ �ۼ��ϴ� ���� : ��������
		// �Ű������� ������ ��������
		// ���������� ���� �ܿ� �ٽ� ����ϱ� ���ؼ��� �� �ʱ�ȭ �ʿ� (������ ���� �� �� �ֱ� ����)
		// ���������� �Ű������� �ʱ�ȭ �ʿ� x
		
		int local;
//		System.out.println(local);	// The local variable local may not have been initialized : �ʱ�ȭ�� ���ؼ� ������ ����

		System.out.println(num);	// num�� �ܺο��� �����͸� �޾ƿ��� ������ �Ѿ�ö����� �ʱ�ȭ�� �Ǿ��ִ� ����
		
		System.out.println(global);	
	}	// <-- �޼ҵ� ������ ��
	
	public void method2() {
		System.out.println(global);	// global�� Ŭ���� ������ �ۼ��� �����̱� ������ ��ü ������ ������ ��
//		System.out.println(local);
//		System.out.pritnln(num);	// local�� num�� method1������ ������ ��
	}
}	// <-- Ŭ���� ������ ��
