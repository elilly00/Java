package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
//	while(���ǽ�){
//		���๮��;
//		[������ or �б⹮;]		// ���� ����
//	}
//	���ǽ� Ȯ�� -> (���ǽ��� true�� ��) ���๮�� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
//	���ǽ��� ����� false�� �� ������ �ݺ�
	
//	do{
//		���๮��;
//		[������ or �б⹮;]
//	} while(���ǽ�);
//	���๮�� -> ���ǽ� Ȯ�� -> (���ǽ��� true�� ��) do�� ���๮�� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
//	���ǽ��� ����� false�� �� ������ �ݺ�
//	while�� do~while�� ������ : do~while�� ������ �� �� �̻� ����
	
	public void method1() {
		// 1���� 5���� ���
		int i = 1;	// �ʱⰪ�� �˷� �ִ� �ʱ�� (������ ����)
		while(i <= 5) {
			System.out.println(i);	// �������� ������ ��� 1�� �ݺ� ��
			i++;
		}
	}
	public void method1_1() {
		// �ڱ� �Ұ� �ټ� �� �ϱ�: �� �̸��� �ڽſ��
		int i = 0;
		while(i < 5) {
			System.out.println("�� �̸��� �ڽſ��");
			i++;
		}
	}
	public void method2() {
		// 5���� 1���� ���
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		} 
	}
	
	public void method3() {
		// ���ڿ��� �Է¹޾� �ε��� ���� ���� ���
		// Java
		// 0 : j
		// 1 : a
		// 2 : v
		// 3 : a
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		// ���ڿ��� ���̸� ��ȯ�Ѵ� : String Ŭ������ length()
//		int length = str.length();
//		System.out.println(length);
		// apple
		int i =0;
//		while(i < length) {
		while(i < str.length()) {  // �� ����� �� ���� ���δ�
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}  
		// for������ 
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
	}
	
	public void method4() {
		// ������
		int i = 2;
		while(i <= 9) {
			int j = 1;  // while�� �ۿ� �θ� ���ȯ�� �Ǹ� j�� �ν��� �ȵ� ������ �ȿ� �Է��Ѵ�
			while(j < 10) {
				System.out.println(i +" X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}
	// while�� �̿��ؼ� �޴��� �ݺ� ��� 
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;	
		while(menuNum != 9) { 
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menuNum = sc.nextInt();		// int menuNum���� ���� ���� ������ ������ �ߺ��� �Ǳ⶧���� menuNum���� �������
			
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			
			// 9���� ������ ������ ��� �ݺ� ��
			// �޴��� ��� �ݺ��ǰ� �ϸ� ���� (����ġ�� ���� ������)
			// while������ ������
			
			}
		}
	}
	// do ~ while��
	public void method5_1() {
		Scanner sc = new Scanner(System.in);
	
		int menuNum = 0;	
		do {
				
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menuNum = sc.nextInt();		
				
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");	
			}
		} while(menuNum != 9);	
	}
//	return;		//  ���� ȣ������ �޼ҵ�� ���ư��� ���� (���� �� ������ ���ư�)
				// (��� �޼ҵ� ���� ��ġ������ ������(����)�ִ�) 
	
	//while�� �ٸ��� ���
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		// ������ true�� ����� �ʹٸ� ���ǹ��� true�� �ֱ� (���ѹݺ���)
		// ���� ���� ��Ű�� -> return; ���
		
		while(true) { 	
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			int menuNum = sc.nextInt();		
			
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); return; 
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			} // !�޼ҵ尡 ���� �����ϸ� ���� ȣ������ �޼ҵ����� ���ư���!
		}
	}
	
	public void method6_1() {
		//method6�� do~while����
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); return; 
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
		} while(true);
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		
		int i = 1;
		while(i <= row) {
			int j = 1;
			while(j <= 5) {
				System.out.print('*');
				j++;	// �������� ����ؾ� ������ ���� �ݺ� ���� �ʴ´�
			}
			System.out.println();
			i++;
		}
	}

	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		int i = 1;
		while(i <= row) {
			int j = 1;
			while(j <= col) {
				if(i == j) {
					System.out.print(i);
				} else {
					System.out.print('*');
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public void method9() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����	// �� �� �ݺ��� �� �˼� ���� �� while�� ���
		// exit�� ���� �ݺ� ���� -> exit�� �ƴϸ� ��� ����
		Scanner sc = new Scanner(System.in);
		
//		String str = null;	// ��κ� �ش� �ڷ����� ���� �⺻ ������ �ʱ�ȭ �Ѵ�.  // ���� �ڷ��� ��, String�� �⺻ ���� null	
		// null : �ƹ� �͵� �ȴ�� ��(=���� ����)  // -> String�� �ƹ��͵� �ȴ���	// �ƹ��͵� �ȴ���ֱ�  ������ ������ ����
		String str = "";	// "" : ����ִ� �� (null�� ���� �ٸ� -> null�� �� ���� X)
		while(!str.equals("exit")) {	// str�� exit�� �ƴϸ� ���ƶ�!
		System.out.print("���ڿ� �Է�: ");		
		str = sc.nextLine();
		System.out.println("str : " + str);

		}
	}	
//	 method9 do~while������
	public void method10() {
		Scanner sc = new Scanner(System.in);
			
		String str = null;	// NullPointerException�� �ȶߴ� ���� : do���� ���� ���� �Ǿ� ����ڰ� �Է��� ���� str�� ���� �Ǳ� ����  
		// �Է� ���� null�� ���´ٸ�? ���ڿ� null�� �ν� ��
		do {				// do�� ���� �����ؼ� str�� ���ڿ��� ���� ���� ��
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while(!str.equals("exit"));
	}
	
}
