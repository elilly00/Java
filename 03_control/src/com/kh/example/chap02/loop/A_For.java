package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
// for(�ʱ��; ���ǽ�; ������){
//	���๮��;
//	}
//	�ʱ�� -> ���ǽ� Ȯ��-> (���ǽ��� true�� ��) ���๮�� ����-> ������-> ���ǽ� Ȯ�� -> (�ݺ�)
	
//	for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ���� ����
//	�ʱ���� ��������, ������ ��������. ������ �󸶳� �Ǵ��� �� ǥ�� �ؾ���
//	�ᱹ for���� �Ұ�ȣ() �ȿ����� ������ ��, ��� �ʿ��� �����
	public void method1() {		
		// 1���� 5���� ��� : 1 2 3 4 5 
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		for(int i = 1; i <= 5; i++) {  // ���� �������� �Ϲ������� ���Ǳ� ������ ��� -> ���� ������ ���� (���� �������� ����ص� ���� �Ȱ��� ����)
		for(int i = 1; i <= 5;) {	// // '1����'�̱⶧���� ������ 1�� �����ϴ°� ����
			System.out.println(i);
			i++;
		 }
	}
	
	public void method1_1() {
//		// �ڱ� �Ұ� �ټ� �� �ϱ� : �� �̸��� �ڽſ��
//		for(int i = 1; i <= 5; i++) {	// 1 2 3 4 5
//		for(int i = 2; i <= 6; i++) {	// 2 3 4 5 6	// � ���ڸ� �ֵ� ��� ����
//		for(int i = 0; i <= 4 ; i++) {	// 0 1 2 3 4
		for(int i = 0; i < 5; i++) {	// 0 1 2 3 4
			System.out.println("�� �̸��� �ڽſ��");
		}
	}
	
	public void method2() {
		// 5���� 1���� ��� : 5 4 3 2 1 
		for(int i = 5; i >=1; i--) {  // ���ǽ��� i > 0;�� ����
			System.out.println(i);
		}
	}
	public void method2_1() {
		// 8���� 3���� ���
//		for(int i = 8; i >= 3; i--) {
//			System.out.println(i);
//		}
		for(int i = 0; i < 6; i++) {
		System.out.print(8 - i);
		}
	}
	
	public void method3() {
		// 1���� 10������ ���� �� Ȧ���� ��� : 1 3 5 7 9
		
		// for���� �̿�
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		// for��+ if��
		for(int i = 1; i <=10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			} 
		}
	}
	
	public void method4() {
		// ���� �ΰ��� �Է� �޾� �� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
		// for��
		for(int i = start; i <= end; i++) {
			System.out.println(i);	// ������ : �� ��° ���ڰ� �� ���� ��� �ȳ��� -> ���ǽ��� false�� ������ ����
		}
		
		int max = 0;	// �� ���� �� ū ���� ���� 
		int min = 0;	// �� ���� �� ���� ���� ����
		// ���ϱ� : if�� ���
		if(start > end) {
			max = start;
			min = end;
		} else { // start <= end
			max = end;
			min = start;
		}
//		
//		for(int i = min; i <= max; i++) {
//			System.out.println(i);
//		}
//			�� �� �����ϰ� 
		for(; min <= max; min++) {
			System.out.println(min);
		}
	}
	
	public void method4_1() {
		//	������ �ϳ� �Է¹޾� �� ���� 1~9������ ���϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9������ ����� �Է��Ͽ��� �մϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9������ ����� �ϳ� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		// �Էµ� ���ڰ� 1~9 ������ �������� Ȯ�� : if��
		if(dan >= 1 && dan <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d%n", dan, i, (dan * i));  // ���������� ���� : %2d%n
			}
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�");
		}
		
	}
	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1���� ���������� ���� �հ�
		// ����? ������ ����  -> Math.random();
//		double random = Math.random();
//		System.out.println(random);		
		
//		(0�ܰ�) 0 <= Math.random() < 1 : double���� ��ȯ��
//		(1�ܰ�) 0 <= Math.random() * 10 < 10 : 0 ~ 9.999999..... 
//		(2�ܰ�) 1 <= Math.random() * 10 + 1 < 11 : 1 ~ 10.99999.....
//		(3�ܰ�) 1 <= (int)(Math.random() * 10 + 1) < 11 : 1 ~ 10		// �Ҽ����� ���� ���� int�� ���� ����ȯ
//		2�ܰ�� 3�ܰ� ������ �ٲ� ��� ����
		
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1���� " + random + "������ ���� �հ� : " + sum);
		
	}
		// ��ø �ݺ���
	public void method6() {
		// 2�ܺ��� 9�ܱ��� ���
		// 2*1=2 2*2=4 .... 2*9=18
		// 3*1=3 3*2=6 .... 3*9=27
		// ũ�� ���� �� : ��	-> ū for��
		// �۰� ���� �� : �� -> ���� for��
		for(int i = 2; i <= 9; i++) { // �ܿ� ���� ū for��
//			for(int i = 1); // i��� ���� ���ļ� �ٸ� �ܾ� ���
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
	}
	
	public void method7() {
		// 0�� 0�� ~ 23�� 59��
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d�� %2d��%n", i, j);
			}
		}
	}
	
	public void method8() {
		// �� �ٿ� ��ǥ(*)�� 5�� ��� �Ǵµ� �� ���� ����ڰ� �Է��� ����ū ���
		/*
		 * 	����� �� �� : 3		����� �� ��: 5
		 *  *****			*****
		 *  *****			*****
		 *  *****			*****
		 *  				*****
		 *  				*****
		 */
		
		// Ʋ�� ���
//		for(int i = 1; i <= 3; i++){
//			System.out.println("*****");  // ��ǥ�� �� �� �� �ټ� ���� ���� �� �����ٷ� �Ѿ�� �ؾ���
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		//  �� ���� ū for���� ��ǥ�� ���� for���� �Է�
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <=5; j++) {
//				System.out.println('*');	// print()�� ����ؼ� 5���� �پ ��� �ǵ��� �Ѵ�
				System.out.print('*');
			}
			System.out.println();	// 5���� ������ �ٸ� �ٷ� �� �ٲ� �ϱ� ���� ���
		}
	}
	
	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ ���
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ���� ���
		/*
		 *  �� �� : 6		�� ��  : 5		�� �� : 4
		 *  ĭ �� : 6		ĭ �� : 4		ĭ �� : 5
		 *  1*****		1***		1*****
		 *  *2****		*2**		*2****
		 *  **3***		**3*		**3***
		 *  ***4**		***4		***4*
		 *  ****5*
		 *  *****6
		 */
		

		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
//			System.out.print('*');  // ������������ ��ǥ�� ��ڴٴ� ����
			 // ������ �޾Ƽ� ��,ĭ ���� ��ġ�ϴ� ��ġ�� �� ��ȣ�� ���� ���� ��� �ϱ�
				if(i == j) {	// �� �� ��  ĭ ���� ������ 
					System.out.print(i);	// �� ���� ����
				} else {				// �ƴϸ�
					System.out.print('*');	// ��ǥ�� ����
				}
			}
			System.out.println();
		}
	}
	
}

	
	

