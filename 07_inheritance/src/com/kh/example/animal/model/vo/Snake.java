package com.kh.example.animal.model.vo;

public class Snake extends Animal {
//	- name : String
//	- age : int
//	- weight : double
//	- pattern : String
	
//	+ Snack()
//	+ Snack(name:String, age:int, weight:double, pattern:String)
	
//	+ getter/setter
//	+ inform():String
//		name age weight pattern
	
	private String pattern;
	
	public Snake() {}
	public Snake(String name, int age, double weight, String pattern) {
		super(name, age, weight);
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
//	public String inform() {
//		return super.getName() + " " + super.getAge() + " " + super.getWeight() + " " + pattern;
//		return super.inform() + " "+ pattern;		// 이미 값이 적여혀 있어 inform으로 가지고 와도 됨
//	}
//	@Override
//	public String inform() {
//		return super.inform() + " " + pattern;
//	}
	
	@Override
	public String toString() {
		return super.toString() + " " + pattern;
		//				ㄴ> Animal클래스에 있는 toString()을 가리킴
	}
}
