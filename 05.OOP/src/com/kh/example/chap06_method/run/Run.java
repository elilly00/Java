package com.kh.example.chap06_method.run;

import com.kh.example.chap06_method.controller.MethodPractice;
import com.kh.example.chap06_method.medel.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice();

		mp.method1(); // print���� ���� ��µ��� ����
//		String str = mp.method1();	// ��ȯ���� ����  // void

//		mp.method2();	// ���� ��ȯ�ޱ� �ϳ� ������ ���� ���� �ʾ� �����Ͱ� ���ư�
//		int result1 = mp.method2();
//		System.out.println(result1);
		// �����ϰ�
		System.out.println(mp.method2());

		mp.method3(10, 20);

		String result2 = mp.method4("������", 20);
		System.out.println(result2);

		char[] result3 = mp.method5(); // chArr �� ��ȯ�ؿ� // ���� ����
		System.out.println("Run result3 : " + result3);
		for (int i = 0; i < result3.length; i++) {
			System.out.println(result3);
	}
	
		
		System.out.println();
	
		Trainee result4 = mp.method6();	// ���� ����
		System.out.println("Run result4 : " + result4);
		System.out.println(result4.inform());
		
//		Trainee t1 = new Trainee("���ǰ�", 'H', "����", 98.5);
		
		
		
		result4.setName("������");
		result4.setClassRoom('G');
		System.out.println(result4.inform());
		
		System.out.println(result4.getACADEMY());
		System.out.println(result4.getClassRoom());
		System.out.println(result4.getName());
		System.out.println(result4.getTime());
		System.out.println(Trainee.getScore());
	}
}
