package com.kh.example.practice3.run;

import com.kh.example.practice3.mocel.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println(" == �ʱ� �� �ѷ� �� ���� ==");
		System.out.println("�ѷ� : ");
		c.gerAreaOfCircle();
		System.out.println("���� : ");
		c.gerAreaOfCircle();
		
		System.out.println(" == ������ 1 ���� ==");
		System.out.println();
		c.gerAreaOfCircle();
		System.out.println("���� : ");
		c.gerAreaOfCircle();
		
		System.out.println(" == �ʱ� �� �ѷ� �� ���� ==");
		System.out.println("�ѷ� : ");
		c.gerAreaOfCircle();
		System.out.println("���� : ");
		c.gerAreaOfCircle();
		
		
		
	}
}
