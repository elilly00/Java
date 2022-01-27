package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 (소수점 첫째자리까지 입력) : ");
		double height = sc.nextDouble();
		
		// 님은 세이며, 키는 cm입니다.
		System.out.println(name + "님은" + age + "세이며, 키는" + height + "cm입니다.");
		
	}
	public void inputScanner2() {
		// next()와 nextLine() 비교
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine(); 
		
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next();
		
		// 님은 세이며, 사는 곳은 입니다.
//		System.out.println(name + "님은" + "세이며, 사는 곳은 " + address + "입니다. ");
		
	}

}
