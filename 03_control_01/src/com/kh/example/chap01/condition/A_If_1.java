package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If_1 {
	public void method1() {
		// Ű����� �Է��� ���ڰ� ������� �������� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �� �Է� : ");
		int num = sc.nextInt();
		
		// ���� if�� ����
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		}
		if(num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		if(num < 0) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		
		// if~else�� (��ø�� ���)
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		} else {
			if(num == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� 0�մϴ�.");
			} else {
				System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
			}
		}
		
		// if~else if~else�� 
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		} else if(num == 0 ) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
	}
	
	public void method2() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		// ���� if�� ����
		if(num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} 
		
		if(num % 2 > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		
		// if~else��
		if(num % 2 != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}

		// if~else if~else�� 
		if(num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else if(num != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
	}
	
	public void method3() {
		//����ڿ��� �ֹι�ȣ�� �޾Ƽ� �������� �������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String str = sc.nextLine();
		char pId = str.charAt(7);
		
		if(pId == '1' || pId == '3') {
			System.out.println("�����Դϴ�.");
		} else if(pId == '2' || pId == '4') {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}
	
	public void method4() {
		// �̸��� �Է��Ͽ� �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		if("������".equals(name)) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	
	}
 }
