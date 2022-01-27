package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();	// Account�� ������ �� �ֵ��� ��ü �����
		
		a.displayBalance();	// ���� �� ������ �ƹ��͵� �����ʴ� �ɷ� ���� �߱� ������ ()�ȿ� ���� �־ ��µ��� �ʴ´�
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		a.balance -= 5000000;	// ����ȭ�� ���� ���� ���¿��� ����� �ƴ� �޼ҵ�� ����
		// �ܺο����� �� �����Ϳ� ���������� ������ �� ���� 
		//   �� �������� ���ϵ��� �ؾ���(����ȭ)��
		// The field Account.balance is not visible -> private�� ���ؼ� ����ȭ�� �Ǿ��� ���� (������ �ʰ� ��)
		
		a.withdraw(100000);
		a.displayBalance();
		
	}
}
