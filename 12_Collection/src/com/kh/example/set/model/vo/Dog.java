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
		// 객체 측면
		if(this== obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			
		}
		
		// 필드(데이터) 측면
		Dog other = (Dog)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		} else if(!name.equals(other.name)) {	// 내 이름이 null이 아닌 상태에서 다른애의 이름과 비교해서 같지않다면
			return false;	// false 반환
		} 
		if(weight != other.weight) {
			return false;
		}
		
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;	// 상수는 대문자로 적는게 원칙이지만 소문자로 적어도 안되는건 아님
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (int)weight;	// weight는 double이기 때문에 int로 형변환
	
		return result;
		
	}
	@Override
	public int compareTo(Dog o) {	
//		double object = o.weight;	// 비교대상 만들기
		
		// 오름차순
//		if(weight > object) {
//			return 1;
//		} else if(weight == object) {
//			return 0;
//		} else {
//			return -1;
//		}
		
		// 내림 차순
//		if(weight > object) {
//			return -1;
//		} else if(weight == object) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		// double도 숫자이기때문에 기본으로 오름차순으로 정의 되어 있음
		Double standard = weight;	// 나	-> Double은 위에 원시자료형인 double이 쓰여있어 메소드를 사용할 수 없기 때문에 wrapper클래스로 만들기 위해 오토박싱을 한 것임
		Double object = o.weight;	// 비교대상
		return -standard.compareTo(object);	// 내림차순 정렬
		
	}	
	
}
