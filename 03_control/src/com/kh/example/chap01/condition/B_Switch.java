package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	// switch(조건식){
	// case 1: 실행문1; break; // 조건식의 결과 값이 1일 경우 실행
	// case 2: 실행문2; break; // 조건식의 결과 값이 2일 경우 실행
	// default: 실행문3;		 // 조건식의 결과 값이 case에 해당하지 않을 때 실행
	// }
	// 조건식의 결과 값을 case에서 찾아 명령을 수행하는 조건문
	// 해당하는 값이 case에 없을 경우 default의 명령문 수행
	// case와 수행문 사이에는 콜론(:)을 써줘야 함
	// break가 없으면 멈추지 않고 계속 실행
	public void method1() {
		// 정수 두 개와 연산 기호 문자 1개를 입력 받아(Sacnner) 연산 기호 문자에 해당하는 계산을 수행 후 출력
		Scanner sc = new Scanner(System.in);   // import후 스캐너의 위치가 어디에 있는지도 확인 해보기
		
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		System.out.print("연산자(+,-,*,/) : ");
//		char op = sc.nextLine().charAt(0);  // nextInt buffer에 줄바꿈이 남아 있는 상태에서 줄바꿈까지 문자로 인식하는 nextLine이 와서 index의 범위가 넘어가게 됨
		// 해결 방법1. int를 받아올 때 String으로 받아 파싱하기 
		// 해결 방법2. nextLine()으로 줄바꿈 없애기
		// 해결 방법3. nextLine() 대신 next()로 변경
		char op = sc.next().charAt(0);
		
		int result = 0; // 변수 선언 및 초기화
		switch(op) {  // op로 case를 나누겠다
		case '+':
			result = first + second;  // stack에 int result 변수(공간)를 모든 case에 선언하게 되면 변수가 중복이 되서 변수 선언 및 초기화를 한다
			break;
		case '-':					
			result = first - second; 
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			if(second == 0) {
				System.out.println("0으로는 나눌 수 없습니다. 결과가 정확하지 않습니다.");
			} else {
				result = first / second;
			}
			break;
		default:
			System.out.println("예시에 없는 연산자입니다. 결과가 정확하지 않습니다.");
		}
		
		System.out.printf("%d %c %d = %d", first, op, second, result);
		
	}
	
	public void method2() {
		System.out.println("****** 신우네 과일 가게 ******");
		System.out.println("사과, 바나나, 복숭아, 키위 있습니다! 가격 편하게 물어보세요 !");
		System.out.print("어떤 과일의 가격이 궁금하세요? : ");
		
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		
		// 사과 1000 / 바나나 3000/ 복숭아 2000 / 키위 5000
		// 없는 과일일 경우, "그 과일은 신우네 과일 가게에 없습니다 ㅠㅠ 옆에 신우마트로 가보세요!" 문구  출력
		// 최종 출력 : (ex) 사과의 가격은 1000원입니다.
		
		int price = 0;  
//		boolean flag = false;  // boolean의 기본값은 false이다
		boolean flag = true;
//		boolean flag;  -> 메소드안의 지역변수는 선언만 해서 사용할 수 없다
//		System.out.println(flag);
		switch(fruit) {
		case "사과":
			price = 1000; 
			break;
		case "바나나":
			price = 3000;
			break;
		case "복숭아": 
			price = 2000;
			break;
		case "키위": 
			price = 5000;
			break;
		default:
			System.out.println("그 과일은 신우네 과일 가게에 없습니다 ㅠㅠ 옆에 신우마트로 가보세요!");
//			flag = true;
			flag = false;
		}
		
//		if(flag == false) {
//		if(!false) {  
//		
		if(false)
			// flag : false -> 가격표시 o
			// flag : true  -> 가격표시 x
			System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		
		// 없는 과일을 입력했을 때 가격이 나오지 않게 하는 방법 
		// 1. 각 case안에 System.out.println(fruit + "의 가격은 " + price + "원 입니다."); 을 넣기
		// 2. boolean 값으로 처리해서 System.out.println(fruit + "의 가격은 " + price + "원 입니다.");을 if문으로 
	} 
	// switch문 -> if문
	public void method2_1() {
		System.out.println("****** 신우네 과일 가게 ******");
		System.out.println("사과, 바나나, 복숭아, 키위 있습니다! 가격 편하게 물어보세요 !");
		System.out.print("어떤 과일의 가격이 궁금하세요? : ");
		
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		
		int price = 0;
		boolean flag = true;
		
		if(fruit.equals("사과")) {
			price = 1000;
		} else if(fruit.equals("바나나")) {
			price = 3000;
		} else if(fruit.equals("복숭아")) {
			price = 2000;
		} else if (fruit.equals("키위")) {
			price = 5000;
		} else {
			System.out.println("그 과일은 신우네 과일 가게에 없습니다 ㅠㅠ 옆에 신우마트로 가보세요!");
			flag = false;
		}
		if(!flag) {
			System.out.println("그 과일은 신우네 과일 가게에 없습니다 ㅠㅠ 옆에 신우마트로 가보세요!");
		}
		
	}
	public void method3() {
		// 1부터 12까지 입력받아 해당하는 달의 마지막 날짜 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
//		int day = 0;
//		switch(num) {
//		case 1 :
//			day = 31;
//		break;
//		case 2 :
//			day = 28;
//		break;
//		case 3 :
//			day = 31;
//		break;
//		case 4 :
//			day = 30;
//		break;
//		case 5:
//			day = 31;
//			break;
//		case 6:
//			day = 30;
//			break;
//		case 7:
//			day = 31;
//			break;
//		case 8:
//			day = 31;
//			break;
//		case 9:
//			day = 30;
//			break;
//		case 10:
//			day = 31;
//			break;
//		case 11:
//			day = 30;
//			break;
//		case 12:
//			day = 31;
//			break;
//		}
//		
//		System.out.println(num + "월의 마지막 날짜는 " + day + "일 입니다.");  // 비효율적임 일일히 다 쓰기 힘들어~~~

		int day = 0;
		
		switch(num) {
		case 1: case 3: case 5: case 7: case 8:		// break가 없는 이유: 값을 묶어서 하나로 처리
		case 10: case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("1~12 사이이 숫자가 아닙니다.");
		}
	
		System.out.println(num + "월의 마지막 날짜는 " + day + "일 입니다.");
		}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		// 회원에 대한 메뉴
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 수정");
		System.out.println("3. 회원 삭제");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("회원 등록 메뉴입니다.");
			break;
		case 2:
			System.out.println("회원 수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("회원 삭제 메뉴입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void method5() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 연산하기");
		System.out.println("2. 신우네 과일가게");
		System.out.println("3. 마지막 날짜");
		System.out.println("4. 메뉴 출력");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {  // 만들어 놓은 메소드들 호출하기  // 같은 클래스에서 메소드를 호출하기 때문에 알맹이를 만들 필요가 없다
		case 1: 
			method1();
			break;
		case 2: method2(); break;
		case 3: method3(); break;
		case 4: method4(); break;
		default: System.out.println("잘못 입력하셨습니다."); 
		}
	}		
}
	
	

		


