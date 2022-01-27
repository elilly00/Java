package com.kh.example.family.model.vo;


//public class Family {	
// The type Family must be an abstract class to define abstract methods
// 일반 클래스라서 에러가 뜸
public abstract class Family{	// 추상 클래스
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
	
//	public void eat();	// 추상 메소드 
//	This method requires a body instead of a semicolon  -> abstract를 쓰지 않아서
//	public void sleep();	// 추상 메소드

//	public abstract void eat(); 
//	// The abstract method eat in type Family can only be defined by an abstract class
//	// -> 지금 일반 클래스 안에 있어서 추상 메소드를 사용 할 수 없다
//	public abstract void sleep();
}

