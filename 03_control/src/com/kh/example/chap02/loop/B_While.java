package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
//	while(조건식){
//		실행문장;
//		[증감식 or 분기문;]		// 생략 가능
//	}
//	조건식 확인 -> (조건식이 true일 때) 실행문장 수행 -> 조건식 확인 -> (반복)
//	조건식의 결과가 false가 될 때까지 반복
	
//	do{
//		실행문장;
//		[증감식 or 분기문;]
//	} while(조건식);
//	실행문장 -> 조건식 확인 -> (조건식이 true일 때) do의 실행문장 수행 -> 조건식 확인 -> (반복)
//	조건식의 결과가 false가 될 때까지 반복
//	while과 do~while의 차이점 : do~while은 무조건 한 번 이상 수행
	
	public void method1() {
		// 1부터 5까지 출력
		int i = 1;	// 초기값을 알려 주는 초기식 (변수를 선언)
		while(i <= 5) {
			System.out.println(i);	// 증감식이 없으면 계속 1이 반복 됨
			i++;
		}
	}
	public void method1_1() {
		// 자기 소개 다섯 번 하기: 내 이름은 박신우야
		int i = 0;
		while(i < 5) {
			System.out.println("내 이름은 박신우야");
			i++;
		}
	}
	public void method2() {
		// 5부터 1까지 출력
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		} 
	}
	
	public void method3() {
		// 문자열을 입력받아 인덱스 별로 문자 출력
		// Java
		// 0 : j
		// 1 : a
		// 2 : v
		// 3 : a
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		// 문자열의 길이를 반환한다 : String 클래스의 length()
//		int length = str.length();
//		System.out.println(length);
		// apple
		int i =0;
//		while(i < length) {
		while(i < str.length()) {  // 이 방식이 더 많이 쓰인다
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}  
		// for문으로 
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
	}
	
	public void method4() {
		// 구구단
		int i = 2;
		while(i <= 9) {
			int j = 1;  // while문 밖에 두면 재순환이 되면 j가 인식이 안되 때문에 안에 입력한다
			while(j < 10) {
				System.out.println(i +" X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}
	// while문 이용해서 메뉴를 반복 출력 
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;	
		while(menuNum != 9) { 
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menuNum = sc.nextInt();		// int menuNum으로 쓰면 위에 선언한 변수와 중복이 되기때문에 menuNum오로 적어야함
			
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력 하셨습니다.");
			
			// 9번을 누르기 전까지 계속 반복 함
			// 메뉴가 계속 반복되게 하면 좋음 (스위치가 끝날 때까지)
			// while문으로 감싸줌
			
			}
		}
	}
	// do ~ while문
	public void method5_1() {
		Scanner sc = new Scanner(System.in);
	
		int menuNum = 0;	
		do {
				
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menuNum = sc.nextInt();		
				
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력 하셨습니다.");	
			}
		} while(menuNum != 9);	
	}
//	return;		//  나를 호출해준 메소드로 돌아가는 역할 (값을 안 가지고 돌아감)
				// (모든 메소드 끝에 위치하지만 숨어져(생략)있다) 
	
	//while를 다르게 사용
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		// 무조건 true로 만들고 싶다면 조건문에 true를 넣기 (무한반복문)
		// 강제 종료 시키기 -> return; 사용
		
		while(true) { 	
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();		
			
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); return; 
			default : System.out.println("잘못 입력 하셨습니다.");
			} // !메소드가 끝에 도달하면 나를 호출해준 메소드한테 돌아간다!
		}
	}
	
	public void method6_1() {
		//method6을 do~while버전
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); return; 
			default : System.out.println("잘못 입력 하셨습니다.");
			}
		} while(true);
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		
		int i = 1;
		while(i <= row) {
			int j = 1;
			while(j <= 5) {
				System.out.print('*');
				j++;	// 증감식을 사용해야 문장이 무한 반복 되지 않는다
			}
			System.out.println();
			i++;
		}
	}

	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		int i = 1;
		while(i <= row) {
			int j = 1;
			while(j <= col) {
				if(i == j) {
					System.out.print(i);
				} else {
					System.out.print('*');
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public void method9() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 실행	// 몇 번 반복할 지 알수 없을 때 while문 사용
		// exit가 들어가면 반복 종료 -> exit가 아니면 계속 진행
		Scanner sc = new Scanner(System.in);
		
//		String str = null;	// 대부분 해당 자료형에 대한 기본 값으로 초기화 한다.  // 참조 자료형 즉, String의 기본 값은 null	
		// null : 아무 것도 안담긴 것(=진공 상태)  // -> String에 아무것도 안담겼다	// 아무것도 안담겨있기  때문에 오류가 난다
		String str = "";	// "" : 비어있는 값 (null과 전혀 다름 -> null은 값 조차 X)
		while(!str.equals("exit")) {	// str이 exit가 아니면 돌아라!
		System.out.print("문자열 입력: ");		
		str = sc.nextLine();
		System.out.println("str : " + str);

		}
	}	
//	 method9 do~while문으로
	public void method10() {
		Scanner sc = new Scanner(System.in);
			
		String str = null;	// NullPointerException이 안뜨는 이유 : do문이 먼저 실행 되어 사용자가 입력한 값이 str에 들어가게 되기 때문  
		// 입력 값에 null을 적는다면? 문자열 null로 인식 됨
		do {				// do를 먼저 실행해서 str에 문자열이 들어가서 실행 됨
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while(!str.equals("exit"));
	}
	
}
