package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	// �ܵ� if��
	//		if(���ǽ�){
	//			������ ����;
	//		}
	//		���ǽ��� ��� ���� ��(true)�̸� { } �ȿ� �ִ� �ڵ� ����
	//		���ǽ��� ��� ���� ����(false)�̸� { } �ȿ� �ִ� �ڵ� �����ϰ� �Ѿ
	
	// if~else��
	//		if(���ǽ�){
	//			������ ����1;
	//		} else {
	//			������ ����2;
	//		}
	//		�� �� �Ѱ��� �����ϴ� ���ǹ�
	//		���ǽ��� ��� ���� ��(true)�̸� if �ȿ� �ִ� ���๮��1 ����
	//		���ǽ��� ��� ���� ����(false)�̸� else �ȿ� �ִ� ���๮��2 ����
	
	// if~else if~else��
	//		if(���ǽ�){
	//			������ ����1;
	//		} else if(���ǽ�){
	//			������ ����2;
	//		} else{
	//			������ ����3;
	//		}
	//		���� ������ �� �� �ִ� ���ǹ�
	//		if���� ���ǽ��� ��� ���� ��(true)�̸� if �ȿ� �ִ� ���๮��1 ����
	//		if���� ���ǽ��� ��� ���� ����(false)�̸鼭 else if���� ���ǽ� ��� ���� ��(true)�̸鼭 else if �ȿ� �ִ� ���๮��2 ����
	//		�� �� ����(false)�̶�� ���๮��3 ����
	//		=> if������ true��� ����Ǿ����� �� �Ʒ� ������� ���ǽ��� true�� �ϴ���/�����ϴ��� ������� ����
	//		=> else if���� ���� ���� �� �ְ�, else���� ���� �� ����
	
	public void method1() {
		// Ű����� �Է��� ���ڰ� ������� �������� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �� �Է� : ");
		int num = sc.nextInt();
		
		// ���� if�� ����
		// �������
//		if(num > 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");  
//		}
//		
//		// 0����
//		if(num == 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");  
//		}
//		// ��������
//		if(num < 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�"); // int = 0; �̶�� false�� ���� ���� �ʰ� �Ѿ 
//		}
		
//		// if~else�� ����
//		if(num > 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
//		} else { // num <= 0
		// ��ø if��
//		if(num == 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
//		} else {
//			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
//		}
//		}
		
		// if~else if~else ����
		if(num > 0) {
//		if(num >= 0) {	// else if���� ��ġ���� ����� ����� ������ �� �� ������ ��� ���� �ʴ´�
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
		} else if(num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		}	else {
				System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
		}
	}
	
	public void method2() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		// ���� if�� ����
		// ¦��
//		if(num % 2 == 0) {
//			System.out.println("¦���Դϴ�");
//		}
//		// Ȧ��
//		if(num % 2 != 0) {  // = (num % 2 == 1)
//			System.out.println("Ȧ���Դϴ�");
//		}
		
		// if~else��
//		if(num % 2 == 1) {
//			System.out.println("Ȧ���Դϴ�");
//		} else {
//			System.out.println("¦���Դϴ�");
//		}
		
		// if~else if~else�� 
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else if(num % 2 != 0) {
			System.out.println("Ȧ���Դϴ�");
		}  // ���ǽ��� 2���� �ۿ� ���� ������ if~else���� �� �����ϴ�
		
		
		
	}
	
	public void method3() {
		//����ڿ��� �ֹι�ȣ�� �޾Ƽ� �������� �������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է�(-����) : ");
		//000514-4000000 -> ������ �˱� ���ؼ� 7��° ���ڸ� �����;���
//		String str = sc.nextLine();
//		char pId = str.charAt(7); 
		// �� �����ϰ� ǥ��
		char pId = sc.nextLine().charAt(7);  
		
		if(pId == '1' || pId == '3') { // ������ ��� = pId 1�̳� 3�� ��� 
			// �ֹι�ȣ�� ���ڷ� �νĵǱ� ������ '�� �ٿ�����
			System.out.println("�����Դϴ�");
		} else if(pId == '2' || pId == '4') {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}
	// if�� -> switch������
	public void method3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է�(-����) : ");
		char pId = sc.nextLine().charAt(7); 
		
		switch(pId) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�");
		case '2': case '4':
			System.out.println("�����Դϴ�");
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}
	
	public void method4() {
		// �̸��� �Է��Ͽ� �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		
//		if(name == "�ڽſ�") {  // ���ڿ��� �񱳴� == ���� �Ұ���, equals()�θ� ����
//		if(name.equals("�ڽſ�")) { // name�� �ڽſ�� ����?
		if("�ڽſ�".equals(name)) { // �ڽſ�� name�̶� ����?
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("������ �ƴմϴ�");
		}
	}
	
		
}
		

