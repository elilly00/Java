package com.kh.example.person.model.vo;

	public class Person {
//	- name:String
//	- age:int
//	- gender:char
//	- double:height
//	- whight:double
//	
//	+ Person()		// 기본 생성자
//	+ Person(name:String, age:int)		// 매개변수 있는 생성자
//	+ Person(name:String, age:int, gener:char, height:double, weight:double)
//	
//	+ setter/getter
//	+ personInfo():String
//		name, age, gender, height, weight
	
		private String name;
		private int age;
		private char gender;
		private double height;
		private double weight;
 
		public Person() {}		// 기본 생성자
		public Person(String name, int age) {	// 매개변수 있는 생성자
			this.name = name;
			this.age = age;
 
		}
		public Person(String name, int age, char gender, double height, double weight) {
			this(name,age);	// 	위에 생성 했기때문에 불러오기(다 써도 상관 없음)
			this.gender = gender;
			this.height = height;
			this.weight = weight;
		}
 
		public String getName() {
			return name;
	 
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getGender() {
			return gender;
		}	
 
		public void setGender(char gender) {
			this.gender = gender;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public String personInfo() {
			return name + ", " + age + ", " + gender + ", " + height + ", " + weight;
		}
 
}
