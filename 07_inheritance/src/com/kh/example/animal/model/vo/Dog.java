package com.kh.example.animal.model.vo;

public class Dog extends Animal {
//	- name : String
//	- age : int
//	- weight : double
//	- heigth : double
//	- hair : String
	
//	+ Dog()	// 기본 생성자
//	+ Dog(name:String, age:int,weight:double, height:double, hair:String)
	
//	+ getter/setter
//	+ inform() : String
//		name age weight height hair
	
	private double height;
	private String hair;
	
	public Dog() {}
	public Dog(String name, int age, double weight, double height, String hair) {
//		super.setName(name);	// 값을 세팅하기 위해선 setter가 필요 -> super를 이용해 setter를 불러오기
//		super.setAge(age);
//		super.setWeight(weight);	
		// super() 생성자를 이용해서 하나로 묶기
		super(name, age, weight);
		this.height = height;	// 초기화  // this. : 내 객체를 가리키는 참조변수
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
	
//	public String inform() {	// inform도 다른 클래스와 겹침
//		return	super.getName() + " " + super.getAge() + " " +  super.getWeight() + " " + height + " " +  hair;	
		// Animal안에 있는 name을 가ㅣㅈ고 오는 방법 : 1. super.name (name이 privated이기때문에 안됨)
		// 2. suepr.getName()으로 객체로 만들어 가져오기	
//	}
	
//	@Override 
//	public String inform() {
//		return super.inform();	// Anminal클래스 안에 있는 inform()메소드를 가져옴 So, 확장된 값은 출력되지 않음
//		return super.inform() + " " + height + " " + hair;	// 확장값을 가져와서 출력 한다.
//	}
	@Override
	public String toString() {
		return super.toString() + " " + height + " " + hair;
		//				ㄴ> Animal 클래스에 있는 toString()을 가리킴
	}
}
