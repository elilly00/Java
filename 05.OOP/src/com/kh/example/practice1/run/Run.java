package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member();	// �ʱ�ȭ�� ���� �� �� ���� ����
//		m.printName();	// printName�� �Ҿ���� memberName�ȿ� ���Ե� ���� ���⶧���� null�̶�� ��� �� 
		m.changeName("������");	// �׷��� changeName�� �ҷ��ͼ� ���� �Է��ϰ� 
		m.printName();			// printName�� �ҷ����� �Է��� ���� ��� ��
	}
}
