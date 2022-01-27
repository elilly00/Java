package com.kh.example.chap01_encapsulation;

public class Account {		// 외부에서 내 데이터에 직접적으로 접근 할 수 있음  -> 접근 하지 못하도록  
//	String name = "박신우";
//	String phone = "010-1111-2222";
//	String pwd = "q1w2e3";
//	int backCode = 3030;
//	int balance = 0;	// 잔액			// 멤버 변수에선 무조건 private을 붙여야 함 
	// ↓ 은닉화 
	private String name = "박신우";
	private String phone = "010-1111-2222";
	private String pwd = "q1w2e3";
	private int backCode = 3030;
	private int balance = 0;	// 잔액
	
	// 입금을 위한 메소드
	public void deposit(int money) {	// (int money)는 데이터(값)를 받아오는 역할
		if(money > 0) {		//	money가 0보다 크다면
			balance += money;	// 잔액에 money만큼 추가가 되고
			System.out.println(name + "님의 계좌에" + money + "원 입금되었습니다.");
		} else {	// 아니면
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	// 출금을 위한 메소드
	public void withdraw(int money) {
		if(money <= balance) {	// money가 내가 가지고 있는 잔액보다 작거나 같으면
			balance -= money;	// 잔액에 money만큰 빠지고
			System.out.println(name +"님의 계좌에서" + money + "원이 출금되었습니다.");
		} else {	// money가 내가 가지고 있는 잔액보다 크면
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	// 잔액 조회를 위한 메소드
	public void displayBalance() {
		System.out.println(name + "님의 계좌에 잔액은" + balance + "원입니다.");
	}
}
