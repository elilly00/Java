package com.kh.example.chap04_filed.run;

import com.kh.example.chap04_filed.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
		KindsOfVariable2 k2 = new KindsOfVariable2();
		int a1 = k2.staticNum;		// ����� �� : ��� (�����ϸ� �ȶߵ��� �ϴ°� ����)
//		The value of the local variable a1 is not used : ���� ���� ���� ������ �ʾҴ�
//		The static field KindsOfVariable2.staticNum should be accessed in a static way : staticNum�� static ������� �����ؾ� �Ѵ� 
//																						��, ������ static ���� ����� �ƴϴ�
		// static���� �� �ִ� �Ϳ� ���� ������ ��ü�� ���� �ʿ�x
		// ��ü ���� ���� 'Ŭ������.�ʵ��' / 'Ŭ������.�޼ҵ��'���� ���� ����
		int a2 = KindsOfVariable2.staticNum;
		
		k2.method();
		k2.method();
		
		KindsOfVariable2 k22 = new KindsOfVariable2();
		k22.method();
	}
}
// static�� ���α׷��� ���� ���� �� staic �޸� ������ �Ҵ�