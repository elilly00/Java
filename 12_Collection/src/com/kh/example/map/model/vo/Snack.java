package com.kh.example.map.model.vo;

public class Snack {
	private String flavor;
	private int price;
	
	public Snack() {}
	public Snack(String flavor, int price) {
		this.flavor = flavor;
		this.price = price;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return flavor + "[" + price +"원]";
	}
	@Override
	public boolean equals(Object obj) {
		// 객체 측면
//		if(this == obj) {	
//			return true;
//		}
		// ↓ 한 줄만 들어갈 땐 중괄호를 생략해도 됨
		if(this == obj) return true;	
		
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		// 필드(데이터) 측면
		Snack other = (Snack)obj;
		if(flavor == null) {		// flavor은 String값(참조형)이기 때문에 null인지 아닌지를 먼저 확인한 다음
			if(other.flavor != null) {	
			return false;
			}
		} else if(!flavor.equals(other.flavor)) {	// 같거나 같지않다는 것을 비교함
			return false;
			}
		if(price != other.price) {		// price는 기본 자료형이기 때문에 바로 같은지 확인 함
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (flavor == null ? 0 : flavor.hashCode());
		result = PRIME * result + price;
		
		return result;
	}
}

