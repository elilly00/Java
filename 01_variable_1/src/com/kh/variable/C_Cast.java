package com.kh.variable;

public class C_Cast {
	public void rlue1() {
		boolean flag = true;
//		flag = 20;
		// �ڵ� ����ȯ
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;
		System.out.println("ch : " + ch);
		
//		char ch = -97;
//		System.out.println("ch : " + ch);
		
		
		// ���� ����ȯ
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		
	}
		public void rlue2() {
			int iNum = 10;
			long lNum = 100L;
	
//			int lSum = iNum + lNum; 
			
			// ���1: ���� ����� long �ڷ������� �ޱ�
			long lSum = iNum + lNum;
			System.out.println("lSum : " + lSum);
			
			// ���2 : long���� int������ ���� ����ȯ
			int iNum1 = iNum + (int)lNum;
			System.out.println("iNum1 : " + iNum1);
			
			// ���3 : ���� ����� int�� ���� ����ȯ
			int iNum2 = (int)(iNum + lNum);
			System.out.println("iNum2 : " + iNum2);
		}

}
