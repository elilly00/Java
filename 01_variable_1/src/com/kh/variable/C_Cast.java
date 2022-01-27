package com.kh.variable;

public class C_Cast {
	public void rlue1() {
		boolean flag = true;
//		flag = 20;
		// 자동 형변환
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;
		System.out.println("ch : " + ch);
		
//		char ch = -97;
//		System.out.println("ch : " + ch);
		
		
		// 강제 형변환
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
			
			// 방법1: 수행 결과를 long 자료형으로 받기
			long lSum = iNum + lNum;
			System.out.println("lSum : " + lSum);
			
			// 방법2 : long형을 int형으로 강제 형변환
			int iNum1 = iNum + (int)lNum;
			System.out.println("iNum1 : " + iNum1);
			
			// 방법3 : 수행 결과를 int로 강제 형변환
			int iNum2 = (int)(iNum + lNum);
			System.out.println("iNum2 : " + iNum2);
		}

}
