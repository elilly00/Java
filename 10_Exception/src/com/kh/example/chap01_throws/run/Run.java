package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		ThrowsController tc = new ThrowsController();
		
		// throws Exception�� ����ϸ�
		// Exception in thread "main"�� ���� �� ������ ����.
		// -> ��¥�� ���ܰ� ó���� ���� �ʾƼ� �ߴ� ����
		
		try {
			tc.method1();
		} catch (Exception e) {	// Exception �κ��� ��ƶ�  // e�� ���� 
			
//			e.printStackTrace();	
			// printStackTrace() 
			// : ���� ���� �� �߻� ��ġ�� �ֿܼ� ������ִ� �޼ҵ�
			System.out.println("���ܻ�Ȳ�� �߻��߽��ϴ�.");
		}
		// try~catch���� ����ϸ� ���� �Ѱ��ִ� ��ź�� �����ؼ� �ؿ� �ִ� �ڵ带 ��½�ų �� �ְ� ��

		System.out.println("���������� �����...");
	}
}
