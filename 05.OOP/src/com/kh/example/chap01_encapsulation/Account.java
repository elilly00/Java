package com.kh.example.chap01_encapsulation;

public class Account {		// �ܺο��� �� �����Ϳ� ���������� ���� �� �� ����  -> ���� ���� ���ϵ���  
//	String name = "�ڽſ�";
//	String phone = "010-1111-2222";
//	String pwd = "q1w2e3";
//	int backCode = 3030;
//	int balance = 0;	// �ܾ�			// ��� �������� ������ private�� �ٿ��� �� 
	// �� ����ȭ 
	private String name = "�ڽſ�";
	private String phone = "010-1111-2222";
	private String pwd = "q1w2e3";
	private int backCode = 3030;
	private int balance = 0;	// �ܾ�
	
	// �Ա��� ���� �޼ҵ�
	public void deposit(int money) {	// (int money)�� ������(��)�� �޾ƿ��� ����
		if(money > 0) {		//	money�� 0���� ũ�ٸ�
			balance += money;	// �ܾ׿� money��ŭ �߰��� �ǰ�
			System.out.println(name + "���� ���¿�" + money + "�� �ԱݵǾ����ϴ�.");
		} else {	// �ƴϸ�
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	// ����� ���� �޼ҵ�
	public void withdraw(int money) {
		if(money <= balance) {	// money�� ���� ������ �ִ� �ܾ׺��� �۰ų� ������
			balance -= money;	// �ܾ׿� money��ū ������
			System.out.println(name +"���� ���¿���" + money + "���� ��ݵǾ����ϴ�.");
		} else {	// money�� ���� ������ �ִ� �ܾ׺��� ũ��
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	// �ܾ� ��ȸ�� ���� �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ���¿� �ܾ���" + balance + "���Դϴ�.");
	}
}
