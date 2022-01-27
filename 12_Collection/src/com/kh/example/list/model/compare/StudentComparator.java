package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;
// ���� �������� ���� �ϰ� ���� �� ���
public class StudentComparator implements Comparator<Student> {	// ���׸� ���ֱ�

	@Override
	public int compare(Student o1, Student o2) {
		// 1. �� ��ü : o1
//		int standard = o1.getScore();	//1.  score ���ؼ� �����ϱ�
		Integer standard = o1.getScore();	// 2. wrapperŬ������ �޾Ƽ� �����ϱ� (��ü�� �ƴϱ⶧���� int�� ��� x)
		// 2. �� ��� : o2
//		int object = o2.getScore();
		Integer object = o2.getScore();
		
		// ���� <��������>
		// �� ��ü�� �� ��󺸴� ũ�� 1
		// �� ��ü�� �� ���� ������ 0
		// �� ��ü�� �� ��󺸴� ������ -1 ��ȯ
//		1. 
//		if(standard > object) {		
//			return 1;
//		} else if(standard == object) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		// ���� <��������>
//		if(standard > object) {		
//			return -1;
//		} else if(standard == object) {
//			return 0;
//		} else {
//			return 1;
//		}
		
//		return standard.compareTo(object);	// 2. wrapperŬ������ �̿��� ���� ����(��������)
//		return -standard.compareTo(object);	// (��������)
		
		// ���� ������ ����� ���� �̸����� �������� �ϰ� �ʹٸ�? -> �̸��� ���� ������ �߰� ��
		int result =  -standard.compareTo(object);	// ���� ��������
		String standardName = o1.getName();		// �� ��ü �̸�
		String objectName = o2.getName();	// �� ��� �̸�
		
		if(result == 0) {	// ������ ���ٸ�
			return standardName.compareTo(objectName);	// �̸��� ������������ ����
		} else {
			return result;
		}
	}
	
//	@Override
//	public int compare(Object o1, Object o2) {
//		return 0;
//	}
	
	
}
