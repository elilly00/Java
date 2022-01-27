package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		ArrayList l = new ArrayList();	// �⺻ ������(����ִ� ������)�� ����� ũ�Ⱑ 10�� ArrayList�� �������	
		// Constructs an empty list with an initial capacity of ten.
		// ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		// ���׸��� ���� ���� �ʾұ� ������ Object�� ���� �Ǿ� ���� �ڷ����� �� �� �ְ� ��
		// ������, �̷� ������� �� ������� ����
		l.add("�ڽſ�");
		l.add(20);
		l.add(new Student());
//		System.out.println(l);
	
		ArrayList<Student> list = new ArrayList<Student>(3);	// ũ�Ⱑ 3�� ArrayList
		// add(E e):boolean   -> ����Ʈ ���� ������ �߰��ϴ� �޼ҵ�
		list.add(new Student("�׽�Ʈ", 0));		// ���׸��� ���� Student�� ������ E�κ��� Object -> Student�� �ٲ���
		list.add(new Student("�����", 60));
		list.add(new Student("������", 90));
		System.out.println(list);	// ���� ����
		
		list.add(new Student("����ȣ", 85));
		System.out.println(list);
		System.out.println("���� list�� ��� element ���� : " + list.size());		// size():int -> ��ü ��ü ����
		list.add(new Student("���̹�", 66));
		System.out.println(list);
		System.out.println("���� list�� ��� element ���� : " + list.size());
		// �÷��� ���� 1. ũ�� ������ ����
		
		// �÷��� ���� 2. �߰�/����/���� ���� ���ó�� ������
		// add(int index, E e):void	-> index��° ��ü�� E �߰��ϴ� �޼ҵ�
		list.add(0, new Student("�����", 100));
		System.out.println(list);
		list.add(3, new Student("���ǰ�", 40));
		System.out.println(list);
		
		// remove(int index):E		-> �ش� index��° ��ü �����ϴ� �޼ҵ�
		list.remove(1);
		System.out.println(list);   
		// remove(Object o):boolean		-> �ش� Object��ü �����ϴ� �޼ҵ�
		list.remove(new Student("���ǰ�", 40));
		// ���� ���� �ʰ� ��� ��	why? ��ǻ�ʹ� �ּҰ����� �����ϴµ� new �����ڸ� ���� ���ο� �ּҰ��� �����Ǿ��� ������ �ٸ� ��ü�� �ν��ؼ� ������������   
		
		System.out.println(list);				
		// �������̵��� equals()�޼ҵ带 ���ؼ� �ּҰ��� �ƴ� �ʵ� ������ �ν��ϵ��� ��	-> ���� equals�޼ҵ�� ObjectŬ������ �� ������ ��Ʈ������ �������̵��ؼ� �����
		// ��> �޾ƿ� Student Ŭ������ equals�� �������̵��� ����� ���� �������� �ƴ����� ���� �� ����
		// equals��� for���� ����� �� ����
		
//		ArrayList<String> test = new ArrayList<String>();
//		test.add("������");
//		test.add("������");
//		test.add("������");
//		test.add("������");
//		System.out.println(test);
//		Collections.sort(test);		// ������������ ���� ��
		// The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Student>)
		// Collections�ȿ� �ִ� sort�޼ҵ�� ArrayList<Music>�� ���ڷ��ؼ� ������ �� ����
		// String�� ���������� �����̶�� ���� �Ͽ� ���� ���� ���ı����� �������� �ʾƵ� ������ ��
		
		// ���� ��� 1. Collections��� Ŭ������ sort��� �޼ҵ� ����ؼ� ����
		Collections.sort(list);		// ������ ���������� ������ ���� x -> StudentŬ������ ���׸��� ���� Ÿ���� �����ϸ� ��
		System.out.println(list);

		Collections.sort(list, new StudentComparator());	// ���� ����
		System.out.println(list);
		
		list.add(new Student("�ں���", 85));	// ����ȣ�� ���� ����
		list.sort(new StudentComparator());	// sort() : ������ ������ ���� �޼ҵ�	
		System.out.println(list);	// StudentComparator�� ������������ ���ĵǾ� �ֱ⶧���� ������������ ���ĵǾ� ��µ�
	
		// set(int index, E e):E	-> index��°�� �ִ� ��Ҹ� E�� �����ϴ� �޼ҵ�
		list.set(3, new Student("���ǰ�", 45));
		System.out.println(list);
		list.set(3, new Student("�ں���", 85));	
		System.out.println(list);
	
		// get(int index):E		-> index��°�� �ִ� ��� ��ȯ�ϴ� �޼ҵ�
		Student s = list.get(2);
		System.out.println(s);
		System.out.println(list);	
		
		// contains(Object o): boolean		-> o�� ����Ʈ�� �����ϴ��� Ȯ���ϴ� �޼ҵ�, ������ true / ������ false
		// indexOf(Object o):int			-> o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, ������ 1 / ������ -1
		System.out.println(list.contains(new Student("������", 90)));		// true�� ��µǴ� ���� : equals�� �������̵� �߱� ����
		System.out.println(list.indexOf(new Student("������", 90)));
		System.out.println(list.indexOf(new Student("���ǰ�", 45)));		// ����Ʈ�� �������� �ʴ´ٸ� -1�� ��� ��
		
		// clear():void			 -> ����� ��� ��ü ����
		// isEmpty():boolean	 -> ����Ʈ�� ����ִ��� Ȯ��, ��������� true / ������� ������ false
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	}
	
	
	
	
	
}
