package com.kh.example.family.model.vo;

import java.awt.event.MouseListener;
import java.io.Serializable;

// �������̽����� ��� ���� : extends -> ���� ���
//public class Basic {
public interface Basic extends Cloneable, Serializable {
	//							Marker Interface
	//							: ���ο� ����� �޼ҵ�� ���� �̸��� �ִ� �������̽�
	//							: �޼ҵ� ����(�ϼ�)(=��� ����)�� ������ �ƴ϶� Ŭ������ Ư���� ��Ÿ���ֱ� ����
	
	public static final double PI = 3.14;
	String nation = "���ѹα�";
	// interface �ȿ� �ִ� �ʵ�� ���������� public static fianl�� ��
	
	public abstract void eat();
	void sleep();
	// interface �ȿ� �ִ� �޼ҵ�� ���������� public abstract�� ��
}
