package com.kh.example.practice3.run;

import com.kh.example.practice3.mocel.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println(" == 초기 원 둘레 및 넓이 ==");
		System.out.println("둘레 : ");
		c.gerAreaOfCircle();
		System.out.println("넓이 : ");
		c.gerAreaOfCircle();
		
		System.out.println(" == 반지름 1 증가 ==");
		System.out.println();
		c.gerAreaOfCircle();
		System.out.println("넓이 : ");
		c.gerAreaOfCircle();
		
		System.out.println(" == 초기 원 둘레 및 넓이 ==");
		System.out.println("둘레 : ");
		c.gerAreaOfCircle();
		System.out.println("넓이 : ");
		c.gerAreaOfCircle();
		
		
		
	}
}
