package com.kh.example.practice3.mocel.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius = 1;
	
	public void incrementRadius() {		
		radius++;
	}
	public void gerAreaOfCircle() {	// ����
		System.out.println(radius * radius * PI);
		
	}
	public void geSizeOfCircle() {	// �ѷ�
		System.out.println(2 * PI * radius);
	}
}
