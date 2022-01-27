package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();	// Account에 접근할 수 있도록 객체 만들기
		
		a.displayBalance();	// 정의 할 때부터 아무것도 받지않는 걸로 정의 했기 때문에 ()안에 값을 넣어도 출력되지 않는다
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		a.balance -= 5000000;	// 은닉화가 되지 않은 상태에서 기능이 아닌 메소드로 빼감
		// 외부에서도 내 데이터에 직접적으로 접근할 수 있음 
		//   ↓ 접근하지 못하도록 해야함(은닉화)↓
		// The field Account.balance is not visible -> private을 통해서 은닉화가 되었기 때문 (보이지 않게 됨)
		
		a.withdraw(100000);
		a.displayBalance();
		
	}
}
