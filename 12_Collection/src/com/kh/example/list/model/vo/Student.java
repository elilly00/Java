package com.kh.example.list.model.vo;

//public class Student {
//public class Student implements Comparable {	// implements : �������̽� ��ӹ���(�������̽� �ȿ��� ����� �ʵ�, �߻� �޼ҵ尡 ��) // �߻� �޼ҵ� -> ���� �������̵� �ʿ�
	// The type Student must implement the inherited abstract method Comparable.compareTo(Object)
	// : �������̵��� ���߱�  ������ ������ �� ,�׷���  compareTo()�޼ҵ带 �������̵� �ؾ� ��. -> �׷��� Comparable�� ����� ���� ��
	// Comparable is a raw type. References to generic type Comparable<T> should be parameterized
	// : Comparable�� ���׸��� ����ؾ� ��
public class Student implements Comparable<Student> {	// 
	private String name;
	private int score;

	public Student() {
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "(" + score + "��)";
	}
	// ���� ������ �������̵� ��� �� ���� ������ ����� // �ʹ� ��ƴ� ������ ���� ���ص� ��(�������� ���⿡���� ����ϱ� ����) // but, �ǹ����� ����� ���� ����
	
	@Override // ����� ȣ�� ���� (= Student�� ���� ��ü(��)�� �ϳ� �������) 
	public boolean equals(Object obj) { // Object obj�� ���� ���� ���
		// 1. ��ü ���� (��ü ��ü�μ� �����ϴ� ���)
		if(this == obj) { // ���� ��(this)�� ���ٸ�(�ּҰ��� ���ٸ�) -> �ּҰ��� ����
			return true; // �׷��� true�� ��ȯ��
		}

		if(obj == null) { // ���� ���� ����� obj�� null�̶�� -> ���� �ٸ�
			return false; // �׷��� false�� ��ȯ��
		}

		if(getClass() != obj.getClass()) { // ���� ������ �ִ�  ������ obj�� ������ �ִ� ������ ���� �ʴٸ� -> ���� �ٸ�
			// getClass() : �� Ŭ������ ���� ������ ��Ƶδ� �޼ҵ�
			return false; // �׷��� false�� ��ȯ��
		}

		// 2. �ʵ�(������) ����	-> �ʵ忡 �ִ� ������ ��
		Student other = (Student)obj;	// (Student)obj : obj ��ü�� Student�� ����ȯ
		if(name == null) { // ������ �ִ� name�� null�̰�
			if(other.name != null) { // ���� ���� other�� name�� null�� �ƴ϶�� -> ���� ���� ����
				return false; // �׷��� false�� ��ȯ
			}
		} else if(!name.equals(other.name)) { // other�� �ִ� name�� �� name�� ���� �ʴٸ� -> ���� ����
			// name��ü�� String�̱⶧���� String�ȿ� �ִ� equals ���
			return false; // false�� ��ȯ��
		}	// name�� ����������(Stirng)�̱� ������ equals�� ����ؼ� ��

		// score�� �⺻������ �񱳿����ڸ� �̿��ؼ� ��
		if(score != other.score) { // other�� �ִ� score�� �� score�� ���� �ʴٸ�
			return false;
		}
		return true;	// ���� �ƹ��͵� �ɸ��� �ʴ´ٸ� ���ٰ� ��
	}
	
	// haseCode �Ծ� : equals �޼ҵ忡 ���� true�� ������ �� ��ü�� hashCode ���� ���ƾ� ��
	// �׷��� ���� equals �޼ҵ带 ���� true�� ������� ������ hashCode�� �������̵� �������
	@Override
	public int hashCode() {	
		final int PRIME = 31; // 31�̶� ���ڴ� ��ǻ�Ͱ� ����ϱ⿡ ������ ũ�鼭 �Ҽ��̱� ������ ���� �����
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result = PRIME * result + score;	// score�� ���������� �ƴϱ⶧���� score ��ü�� ���� ��

		return result;
	}

//	@Override		// ���׸����� Ÿ�Ԑk �������� ������ �Ű������� Object�� ��
//	public int compareTo(Object o) { // Object�� �����Ϸ��� ����ȯ�� �ϸ鼭 �ؾ��� -> ���׸��� �����ϸ� �̷��� ���ŷο� ������ ���ص� ��
//		Student other = (Student)o;
//		String otherName = other.name;
//	
//		return name.comaprTo(otherName);
//	}

	@Override		// ���׸����� Ÿ�� ���� �� �Ű������� Student�� ��
	public int compareTo(Student o) {
		// �̸�(String)���� ��������	-> String�� �̹� ������������ �ڱ�鳢�� ���ı����� ������ ����
		
		// compareTo�� �� ��ü(��)�� �� ���(o)�� ���ϴµ�
		// �� ��ü�� �� ���� ������ 0.
		// �� ��ü�� �� ��󺸴� ũ�� 1,
		// �� ��ü�� �� ��󺸴� ������ -1 ��ȯ
		
		return name.compareTo(o.name);	// ���� ������ �ִ� name�� �� ����� o�� �ִ� name�� ���� (��������)
//		return -name.compareTo(o.name);	// -�� �ٿ��� ���� �������� ��
		
	}
}
