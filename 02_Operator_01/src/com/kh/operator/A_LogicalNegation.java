package com.kh.operator;

public class A_LogicalNegation {
	// �� ���� ������ : !
		// �� ���� �ݴ�� �ٲٴ� ������
	public void method() {
		System.out.println("true�� ���� : " + !true);
		System.out.println("false�� ���� : " + !false);
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("bool1 : " + bool1);  // true
		System.out.println("bool2 : " + bool2);  // false
		System.out.println("!bool1 : " + !bool1);  // false
		System.out.println("!bool2 : " + !bool2);  // true
		System.out.println("!!bool1 : " + !!bool1);  // true
		System.out.println("!!bool2 : " + !!bool2);  // false
		
		
	}
	public void method2() {
		System.out.println("������ �������Ѱ�? : " + !false);
		System.out.println("������ ���� ��ϴ°�? : " + !true);
		System.out.println("�ƺ��� �ǳ� �԰��ڰ�԰��ڴ°�? : " + !false);
		System.out.println("������ �ʰ� �Ͼ�°�? : " + !true);
		
	}


}
