package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ��� (�Ҽ��� ù°�ڸ����� �Է�) : ");
		double height = sc.nextDouble();
		
		// ���� ���̸�, Ű�� cm�Դϴ�.
		System.out.println(name + "����" + age + "���̸�, Ű��" + height + "cm�Դϴ�.");
		
	}
	public void inputScanner2() {
		// next()�� nextLine() ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine(); 
		
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next();
		
		// ���� ���̸�, ��� ���� �Դϴ�.
//		System.out.println(name + "����" + "���̸�, ��� ���� " + address + "�Դϴ�. ");
		
	}

}
