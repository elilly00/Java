package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If_1 {
	public void method1() {
		// 키보드로 입력한 숫자가 양수인지 음수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력 : ");
		int num = sc.nextInt();
		
		// 단일 if문 버전
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		if(num < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		
		// if~else문 (중첩문 사용)
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else {
			if(num == 0) {
				System.out.println("입력하신 숫자는 0닙니다.");
			} else {
				System.out.println("입력하신 숫자는 음수입니다.");
			}
		}
		
		// if~else if~else문 
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else if(num == 0 ) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
	}
	
	public void method2() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 단일 if문 버전
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} 
		
		if(num % 2 > 0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		
		// if~else문
		if(num % 2 != 0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		} else {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}

		// if~else if~else문 
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} else if(num != 0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
	}
	
	public void method3() {
		//사용자에게 주민번호를 받아서 여자인지 남자인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String str = sc.nextLine();
		char pId = str.charAt(7);
		
		if(pId == '1' || pId == '3') {
			System.out.println("남자입니다.");
		} else if(pId == '2' || pId == '4') {
			System.out.println("여자입니다.");
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void method4() {
		// 이름을 입력하여 본인인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		if("박정은".equals(name)) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
	
	}
 }
