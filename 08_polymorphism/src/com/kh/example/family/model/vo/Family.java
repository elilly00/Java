package com.kh.example.family.model.vo;


//public class Family {	
// The type Family must be an abstract class to define abstract methods
// �Ϲ� Ŭ������ ������ ��
public abstract class Family{	// �߻� Ŭ����
	private String name;
	private double weight;
	private int health;
	
	public Family() {}
	public Family(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
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
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  name + ", " + weight + "kg, " + health;
	}
	
//	public void eat();	// �߻� �޼ҵ� 
//	This method requires a body instead of a semicolon  -> abstract�� ���� �ʾƼ�
//	public void sleep();	// �߻� �޼ҵ�

//	public abstract void eat(); 
//	// The abstract method eat in type Family can only be defined by an abstract class
//	// -> ���� �Ϲ� Ŭ���� �ȿ� �־ �߻� �޼ҵ带 ��� �� �� ����
//	public abstract void sleep();
}

