package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("������", 9 , 6.3);
//		System.out.println(a.inform());
//		System.out.println(a.toString());
		System.out.println(a);		// �ּҰ��� ���;� �ϴµ� toString()�� ����
									// ���� ���� toStirng()���� �ʾƵ� ���۷��� ������ ��ڴٰ� �ϴ��� �� �ȿ� �ִ� toString�� ������ 
									// ���� objcet�� toString�� Overrid�� �޼ҵ带 ���ۼ��߱� ������ toSting()�� ���� �ʾƵ� Overrid�� toStirng() ���� ��µȴ�.
		Dog d = new Dog();
		d.setName("����");
		d.setAge(1);
		d.setWeight(5.2);
		d.setHeight(50);
		d.setHair("���");
//		System.out.println(d.inform());
//		System.out.println(d.toString());
		System.out.println(d);
		
		// �Ű������� �ִ� �����ڸ� �̿��� ���� ���� �� �ֵ�.
		Dog d2 = new Dog("����", 2, 2.5, 30, "�ܸ�");
//		System.out.println(d2.inform());	
		// DogŬ�������� �̸�,����,�����Դ� �ʱ�ȭ�� ���� �ʾƼ� �⺻������ ��µ�
		// -> ���� �����ϱ� -> setter�� �ʿ� -> super�� �̿��� setter�� �ҷ�����
//		System.out.println(d2.toString());
		System.out.println(d2);
		
		Snake s = new Snake();
		s.setName("�����");
		s.setAge(1);
		s.setWeight(6.3);
		s.setPattern("����");
//		System.out.println(s.inform());
//		System.out.println(s.toString());
		System.out.println(s);
		
		Snake s2 = new Snake("�����", 2, 3.6, "����");
//		System.out.println(s2.inform());		
		// dog&Snack�� inform�� ��� Animal�� �ִ� inform�� ������ ���⶧���� ����� ��
		// but Ȯ��� ���� ��µ��� ���� -> ���� ���ϴ� Ȯ�� ������ ��� �ǰ� �ϵ��� �ϱ�
//		System.out.println(s2.toString());
		System.out.println(s2);
		
	}
}
