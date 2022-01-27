package com.kh.example.family.model.vo;

import java.awt.event.MouseListener;
import java.io.Serializable;

// 인터페이스끼리 상속 가능 : extends -> 다중 상속
//public class Basic {
public interface Basic extends Cloneable, Serializable {
	//							Marker Interface
	//							: 내부에 선언된 메소드는 없고 이름만 있는 인터페이스
	//							: 메소드 구현(완성)(=기능 구현)이 목적이 아니라 클래스의 특성을 나타내주기 위함
	
	public static final double PI = 3.14;
	String nation = "대한민국";
	// interface 안에 있는 필드는 묵시적으로 public static fianl이 들어감
	
	public abstract void eat();
	void sleep();
	// interface 안에 있는 메소드는 묵시적으로 public abstract가 들어감
}
