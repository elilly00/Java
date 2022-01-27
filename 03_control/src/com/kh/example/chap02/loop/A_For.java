package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
// for(초기식; 조건식; 증감식){
//	실행문장;
//	}
//	초기식 -> 조건식 확인-> (조건식이 true일 때) 실행문장 수행-> 증감식-> 조건식 확인 -> (반복)
	
//	for문 안에 있는 초기식, 조건식, 증감식 생략 가능
//	초기식은 무엇인지, 조건은 무엇인지. 증감은 얼마나 되는지 다 표기 해야함
//	결국 for문의 소괄호() 안에서만 생략될 뿐, 모두 필요한 요소임
	public void method1() {		
		// 1부터 5까지 출력 : 1 2 3 4 5 
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		for(int i = 1; i <= 5; i++) {  // 후위 연산으로 일반적으로 사용되기 때문에 사용 -> 딱히 이유는 없음 (전위 연산으로 사용해도 값이 똑같이 나옴)
		for(int i = 1; i <= 5;) {	// // '1부터'이기때문에 시작이 1로 시작하는게 편함
			System.out.println(i);
			i++;
		 }
	}
	
	public void method1_1() {
//		// 자기 소개 다섯 번 하기 : 내 이름은 박신우야
//		for(int i = 1; i <= 5; i++) {	// 1 2 3 4 5
//		for(int i = 2; i <= 6; i++) {	// 2 3 4 5 6	// 어떤 숫자를 넣든 상관 없음
//		for(int i = 0; i <= 4 ; i++) {	// 0 1 2 3 4
		for(int i = 0; i < 5; i++) {	// 0 1 2 3 4
			System.out.println("내 이름은 박신우야");
		}
	}
	
	public void method2() {
		// 5부터 1까지 출력 : 5 4 3 2 1 
		for(int i = 5; i >=1; i--) {  // 조건식이 i > 0;도 가능
			System.out.println(i);
		}
	}
	public void method2_1() {
		// 8부터 3까지 출력
//		for(int i = 8; i >= 3; i--) {
//			System.out.println(i);
//		}
		for(int i = 0; i < 6; i++) {
		System.out.print(8 - i);
		}
	}
	
	public void method3() {
		// 1부터 10사이의 숫자 중 홀수만 출력 : 1 3 5 7 9
		
		// for문만 이용
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		// for문+ if문
		for(int i = 1; i <=10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			} 
		}
	}
	
	public void method4() {
		// 정수 두개를 입력 받아 그 사이 숫자 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		// for문
		for(int i = start; i <= end; i++) {
			System.out.println(i);	// 문제점 : 두 번째 숫자가 더 작을 경우 안나옴 -> 조건식이 false라서 문장이 끝남
		}
		
		int max = 0;	// 두 숫자 중 큰 숫자 저장 
		int min = 0;	// 두 숫자 중 작은 숫자 저장
		// 비교하기 : if문 사용
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
//			↓ 더 간단하게 
		for(; min <= max; min++) {
			System.out.println(min);
		}
	}
	
	public void method4_1() {
		//	정수를 하나 입력받아 그 수가 1~9사이의 수일때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 양수를 하나 입력하세요 : ");
		int dan = sc.nextInt();
		
		// 입력된 숫자가 1~9 사이의 숫자인지 확인 : if문
		if(dan >= 1 && dan <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d%n", dan, i, (dan * i));  // 오른쪽으로 정렬 : %2d%n
			}
		} else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다");
		}
		
	}
	public void method5() {
		// 1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		// 난수? 랜덤한 숫자  -> Math.random();
//		double random = Math.random();
//		System.out.println(random);		
		
//		(0단계) 0 <= Math.random() < 1 : double값을 반환함
//		(1단계) 0 <= Math.random() * 10 < 10 : 0 ~ 9.999999..... 
//		(2단계) 1 <= Math.random() * 10 + 1 < 11 : 1 ~ 10.99999.....
//		(3단계) 1 <= (int)(Math.random() * 10 + 1) < 11 : 1 ~ 10		// 소수점을 떼기 위해 int로 강제 형변환
//		2단계와 3단계 순서는 바뀌어도 상관 없음
		
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1부터 " + random + "까지의 정수 합계 : " + sum);
		
	}
		// 중첩 반복문
	public void method6() {
		// 2단부터 9단까지 출력
		// 2*1=2 2*2=4 .... 2*9=18
		// 3*1=3 3*2=6 .... 3*9=27
		// 크게 도는 것 : 단	-> 큰 for문
		// 작게 도는 것 : 수 -> 작은 for문
		for(int i = 2; i <= 9; i++) { // 단에 대한 큰 for문
//			for(int i = 1); // i라고 쓰면 겹쳐서 다른 단어 사용
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
	}
	
	public void method7() {
		// 0시 0분 ~ 23시 59분
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분%n", i, j);
			}
		}
	}
	
	public void method8() {
		// 한 줄에 별표(*)가 5번 출력 되는데 그 줄은 사용자가 입력한 수만큰 출력
		/*
		 * 	출력할 줄 수 : 3		출력할 줄 수: 5
		 *  *****			*****
		 *  *****			*****
		 *  *****			*****
		 *  				*****
		 *  				*****
		 */
		
		// 틀린 답안
//		for(int i = 1; i <= 3; i++){
//			System.out.println("*****");  // 별표를 한 번 찍어서 다섯 번이 나온 후 다음줄로 넘어가게 해야함
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		//  한 줄이 큰 for문에 별표는 작은 for문에 입력
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <=5; j++) {
//				System.out.println('*');	// print()를 사용해서 5개가 붙어서 출력 되도록 한다
				System.out.print('*');
			}
			System.out.println();	// 5번씩 찍히고 다른 줄로 줄 바꿈 하기 위해 사용
		}
	}
	
	public void method9() {
		// 한 줄에 별표 문자를 입력된 줄 수와 칸 수 만큼 출력
		// 단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수 출력
		/*
		 *  줄 수 : 6		줄 수  : 5		줄 수 : 4
		 *  칸 수 : 6		칸 수 : 4		칸 수 : 5
		 *  1*****		1***		1*****
		 *  *2****		*2**		*2****
		 *  **3***		**3*		**3***
		 *  ***4**		***4		***4*
		 *  ****5*
		 *  *****6
		 */
		

		
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
//			System.out.print('*');  // 무조건적으로 별표를 찍겠다는 문장
			 // 조건을 달아서 줄,칸 수가 일치하는 위치에 줄 번호에 대한 정수 출력 하기
				if(i == j) {	// 줄 수 와  칸 수가 같으면 
					System.out.print(i);	// 줄 수를 적고
				} else {				// 아니면
					System.out.print('*');	// 별표를 찍어라
				}
			}
			System.out.println();
		}
	}
	
}

	
	

