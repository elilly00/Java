package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자
	// 조건식 ? 참일 때 사용할 값 : 거짓일 때 사용할 값;
	
	public void method1() {
		// 입력한 정수가 양수인지 아닌지 판별
		// 양수면 "양수다", 양수가 아니면 "양수가 아니다"라는 문장 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
//		String result = num > 0 ? "양수다" : "양수가 아니다"; 
		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		
		System.out.println(num + "숫자는 " + result);
		
	}
	public void method2() {
		// 입력한 정수가 홀수인지 짝수인지 판별
		// 홀수이면, 홀수입니다
		// 짝수이면, 짝수입니다
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("정수 하나 입력 : "); // 안내문구 출력
		int num = sc.nextInt(); // 입력한 값을 받아올 변수 생성
		
		String result = num % 2 == 0? "짝수입니다" : "홀수입니다";
		
		System.out.println(num + " 숫자는 " + result);
		
		
	}
}
