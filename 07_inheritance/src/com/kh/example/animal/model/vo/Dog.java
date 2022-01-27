package com.kh.example.animal.model.vo;

public class Dog extends Animal {
//	- name : String
//	- age : int
//	- weight : double
//	- heigth : double
//	- hair : String
	
//	+ Dog()	// �⺻ ������
//	+ Dog(name:String, age:int,weight:double, height:double, hair:String)
	
//	+ getter/setter
//	+ inform() : String
//		name age weight height hair
	
	private double height;
	private String hair;
	
	public Dog() {}
	public Dog(String name, int age, double weight, double height, String hair) {
//		super.setName(name);	// ���� �����ϱ� ���ؼ� setter�� �ʿ� -> super�� �̿��� setter�� �ҷ�����
//		super.setAge(age);
//		super.setWeight(weight);	
		// super() �����ڸ� �̿��ؼ� �ϳ��� ����
		super(name, age, weight);
		this.height = height;	// �ʱ�ȭ  // this. : �� ��ü�� ����Ű�� ��������
		this.hair = hair;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
 	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	
//	public String inform() {	// inform�� �ٸ� Ŭ������ ��ħ
//		return	super.getName() + " " + super.getAge() + " " +  super.getWeight() + " " + height + " " +  hair;	
		// Animal�ȿ� �ִ� name�� ���Ӥ��� ���� ��� : 1. super.name (name�� privated�̱⶧���� �ȵ�)
		// 2. suepr.getName()���� ��ü�� ����� ��������	
//	}
	
//	@Override 
//	public String inform() {
//		return super.inform();	// AnminalŬ���� �ȿ� �ִ� inform()�޼ҵ带 ������ So, Ȯ��� ���� ��µ��� ����
//		return super.inform() + " " + height + " " + hair;	// Ȯ�尪�� �����ͼ� ��� �Ѵ�.
//	}
	@Override
	public String toString() {
		return super.toString() + " " + height + " " + hair;
		//				��> Animal Ŭ������ �ִ� toString()�� ����Ŵ
	}
}
