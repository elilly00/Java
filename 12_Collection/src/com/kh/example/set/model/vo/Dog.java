package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog>{
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return name + "(" + weight + "kg)";

	}
	@Override
	public boolean equals(Object obj) {
		// ��ü ����
		if(this== obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			
		}
		
		// �ʵ�(������) ����
		Dog other = (Dog)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)) {	// �� �̸��� null�� �ƴ� ���¿��� �ٸ����� �̸��� ���ؼ� �����ʴٸ�
			return false;	// false ��ȯ
		} 
		if(weight != other.weight) {
			return false;
		}
		
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;	// ����� �빮�ڷ� ���°� ��Ģ������ �ҹ��ڷ� ��� �ȵǴ°� �ƴ�
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (int)weight;	// weight�� double�̱� ������ int�� ����ȯ
	
		return result;
		
	}
	@Override
	public int compareTo(Dog o) {	
//		double object = o.weight;	// �񱳴�� �����
		
		// ��������
//		if(weight > object) {
//			return 1;
//		} else if(weight == object) {
//			return 0;
//		} else {
//			return -1;
//		}
		
		// ���� ����
//		if(weight > object) {
//			return -1;
//		} else if(weight == object) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		// double�� �����̱⶧���� �⺻���� ������������ ���� �Ǿ� ����
		Double standard = weight;	// ��	-> Double�� ���� �����ڷ����� double�� �����־� �޼ҵ带 ����� �� ���� ������ wrapperŬ������ ����� ���� ����ڽ��� �� ����
		Double object = o.weight;	// �񱳴��
		return -standard.compareTo(object);	// �������� ����
		
	}	
	
}