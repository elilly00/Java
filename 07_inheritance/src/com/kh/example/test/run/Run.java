package com.kh.example.test.run;

import com.kh.example.test.controller.InheritanceTest;

public class Run {
	public static void main(String[] args) {
//		InheritanceTest it = new InheritanceTest();
//		it.method();	// it = new InheritanceTest()�� ���� ��ü
		// ���  ��ü���� �ҷ��� �޼ҵ尡 ���� �� ���
		
		new InheritanceTest().method();	// ������ ������ �ʰ�  �ٷ� ��ü�� ������ ���
		// ��� �� ��ü���� �ϳ��� �޼ҵ常 �ҷ��� �� ���� ���
		
	}
}
