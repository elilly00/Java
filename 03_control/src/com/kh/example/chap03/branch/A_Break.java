package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method(){
	// ���ڿ��� �Է� �޾� ���� ������ ����ϴ� �ݺ� ���α׷�
	// ��, end�� �ԷµǸ� �ݺ� ����
	Scanner sc = new Scanner(System.in);
	
//	String str = null;	// error
	String str = "";
//	while(!str.equals("end")) {
//		System.out.print("���ڿ� �Է� : ");
//		str = sc.nextLine();
//		System.out.println("���� ���� : " + str.length());
//	}
	
		while(true) {		
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			
			if(str.equals("end")) {
				break;
			}
			System.out.println("���� ���� : " + str.length());
		}
	
	}
}

 

