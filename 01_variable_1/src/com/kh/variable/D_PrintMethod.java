package com.kh.variable;

public class D_PrintMethod {
	public void printlnExample() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str2);
		System.out.println();
		System.out.println(str1);
		
	}
	public void printExample() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		System.out.print(str1);
		System.out.print(str2);
		
		System.out.print(str1 + "\n"); // \n �ٹٲ�
		System.out.print(str2);
			
		}
	public void printfExample() {
		String str1 ="�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		// �ȳ��ϼ���, �������Դϴ�. �ݰ����ϴ�.
		System.out.printf("%s, �������Դϴ�. %s.", str1, str2);
		// �ݰ����ϴ�, ģ�ϰ� ������.
		System.out.printf("%s, ģ�ϰ� ������. ", str2);
		System.out.println();
		
		int age = 20;
		String name = "������";
		String job = "�л�";
		
		// �ȳ��ϼ���, ���� 20�� ������ �л��Դϴ�. ������ �ݰ����ϴ�.
		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s", str1, age, name, job, str2);
		
	}
	
		
	
}
