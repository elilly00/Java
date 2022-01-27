package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	// 단독 if문
	//		if(조건식){
	//			실행할 문장;
	//		}
	//		조건식의 결과 값이 참(true)이면 { } 안에 있는 코드 실행
	//		조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드 무시하고 넘어감
	
	// if~else문
	//		if(조건식){
	//			실행할 문장1;
	//		} else {
	//			실행할 문장2;
	//		}
	//		둘 중 한개를 선택하는 조건문
	//		조건식의 결과 값이 참(true)이면 if 안에 있는 실행문장1 수행
	//		조건식의 결과 값이 거짓(false)이면 else 안에 있는 실행문장2 수행
	
	// if~else if~else문
	//		if(조건식){
	//			실행할 문장1;
	//		} else if(조건식){
	//			실행할 문장2;
	//		} else{
	//			실행할 문장3;
	//		}
	//		다중 조건을 줄 수 있는 조건문
	//		if문의 조건식의 결과 값이 참(true)이면 if 안에 있는 실행문장1 수행
	//		if문의 조건식의 결과 값이 거짓(false)이면서 else if문의 조건식 결과 값이 참(true)이면서 else if 안에 있는 실행문장2 수행
	//		둘 다 거짓(false)이라면 실행문장3 수행
	//		=> if문에서 true라고 수행되었으면 그 아래 문장들은 조건식이 true라 하더라도/존재하더라도 수행되지 않음
	//		=> else if문은 여러 개일 수 있고, else문은 없을 수 있음
	
	public void method1() {
		// 키보드로 입력한 숫자가 양수인지 음수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력 : ");
		int num = sc.nextInt();
		
		// 단일 if문 버전
		// 양수인지
//		if(num > 0) {
//			System.out.println("입력하신 숫자는 양수입니다");  
//		}
//		
//		// 0인지
//		if(num == 0) {
//			System.out.println("입력하신 숫자는 0입니다");  
//		}
//		// 음수인지
//		if(num < 0) {
//			System.out.println("입력하신 숫자는 음수입니다"); // int = 0; 이라면 false라서 실행 되지 않고 넘어감 
//		}
		
//		// if~else문 버전
//		if(num > 0) {
//			System.out.println("입력하신 숫자는 양수입니다");
//		} else { // num <= 0
		// 중첩 if문
//		if(num == 0) {
//			System.out.println("입력하신 숫자는 0입니다");
//		} else {
//			System.out.println("입력하신 숫자는 음수입니다");
//		}
//		}
		
		// if~else if~else 버전
		if(num > 0) {
//		if(num >= 0) {	// else if값과 겹치지만 출력은 양수로 나오고 그 뒤 내용은 출력 되지 않는다
			System.out.println("입력하신 숫자는 양수입니다");
		} else if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다");
		}	else {
				System.out.println("입력하신 숫자는 음수입니다");
		}
	}
	
	public void method2() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
		int num = sc.nextInt();
		
		// 단일 if문 버전
		// 짝수
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다");
//		}
//		// 홀수
//		if(num % 2 != 0) {  // = (num % 2 == 1)
//			System.out.println("홀수입니다");
//		}
		
		// if~else문
//		if(num % 2 == 1) {
//			System.out.println("홀수입니다");
//		} else {
//			System.out.println("짝수입니다");
//		}
		
		// if~else if~else문 
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
		} else if(num % 2 != 0) {
			System.out.println("홀수입니다");
		}  // 조건식이 2가지 밖에 없기 때문에 if~else문에 더 적합하다
		
		
		
	}
	
	public void method3() {
		//사용자에게 주민번호를 받아서 여자인지 남자인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력(-포함) : ");
		//000514-4000000 -> 성별을 알기 위해선 7번째 숫자를 가져와야함
//		String str = sc.nextLine();
//		char pId = str.charAt(7); 
		// ↓ 간단하게 표현
		char pId = sc.nextLine().charAt(7);  
		
		if(pId == '1' || pId == '3') { // 남자인 경우 = pId 1이나 3일 경우 
			// 주민번호는 문자로 인식되기 때문에 '를 붙여야함
			System.out.println("남자입니다");
		} else if(pId == '2' || pId == '4') {
			System.out.println("여자입니다");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	// if문 -> switch문으로
	public void method3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력(-포함) : ");
		char pId = sc.nextLine().charAt(7); 
		
		switch(pId) {
		case '1':
		case '3':
			System.out.println("남자입니다");
		case '2': case '4':
			System.out.println("여자입니다");
		default:
			System.out.println("잘못 입력하셨습니다");
		}
	}
	
	public void method4() {
		// 이름을 입력하여 본인인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		String name = sc.nextLine();
		
//		if(name == "박신우") {  // 문자열의 비교는 == 으로 불가능, equals()로만 가능
//		if(name.equals("박신우")) { // name이 박신우랑 같니?
		if("박신우".equals(name)) { // 박신우는 name이랑 같니?
			System.out.println("본인입니다");
		} else {
			System.out.println("본인이 아닙니다");
		}
	}
	
		
}
		

