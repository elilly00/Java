package com.kh.example.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	public void method() {
		// ������ ���
		// ¦�� ��, ¦�� ���� �� ������ ��� (2�� X, 3�� 3x1, 3x3...)
		Scanner sc = new Scanner(System.in);
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i % 2 == 0 || j % 2 == 0) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
	
	}
}
