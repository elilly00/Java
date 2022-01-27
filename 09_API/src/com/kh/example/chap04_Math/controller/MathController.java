package com.kh.example.chap04_Math.controller;

import java.util.Random;

//MathŬ������ ���п����� ���� ��� �ϴ� ��

public class MathController {
	public void method() {
		// MathŬ���� : ���� ������ �ϱ⿡ ���뤷�� �޼ҵ���� ��Ƴ��� Ŭ����
		// �̱��� �������� ����
		// 		static�� �̿��� ���ø����̼��� ������ �� �� �� ���� �ν��Ͻ��� ����� �޸� �Ҵ�
		//		�� �� �� ���� �ν��Ͻ�(��ü)�� ����ϰԲ� ���� ����
		//		-> ������ : private, ��� : public static
		
		double num = 4.949;
		double num2 = 4.123;
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);	// int�� �ִ� ��
		System.out.println(Integer.MIN_VALUE);	// int�� �ּ� ��
		
		System.out.println(Math.abs(-num));	// abs : ���밪�� �̾��ִ� �޼ҵ�(��ȣ�� ������� ���� ���� �������� ��)
		System.out.println(Math.ceil(num));	// �ø�
		System.out.println(Math.round(num)); // �ݿø�
		System.out.println(Math.floor(num)); // ����
		
		System.out.println(Math.abs(-num2));	
		System.out.println(Math.ceil(num2));
		System.out.println(Math.round(num2));	// long���̱� ������ ���� ������ ��� ��
		System.out.println(Math.floor(num2)); 
		
		int random = (int)(Math.random()*4) + 1;
		System.out.println(random);
		
		Random r = new Random();	// Random �̶�� Ŭ������ ���� ��
//		System.out.println(r.nextInt());	// Int ������ �ִ� ��� ���� ����
		System.out.println(r.nextInt(4));	// 1~3������ ���� ����
		System.out.println(r.nextInt(4) + 1);	// 1~4������ ���� ����
		
		System.out.println(Math.rint(num));		// ���� ����� ���� ����
		System.out.println(Math.rint(num2));
		
		System.out.println(Math.sqrt(3));	// ��Ʈ ��
		System.out.println(Math.pow(2, 3)); // 2�� 3�� 
		
		System.out.println(Math.max(10, 4));	// �� ���� �� �� ū ��
		System.out.println(Math.min(10, 4));	// �� ���� �� �� ���� ��
		
		
	}
}
