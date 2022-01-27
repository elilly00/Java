package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("강아지", 9 , 6.3);
//		System.out.println(a.inform());
//		System.out.println(a.toString());
		System.out.println(a);		// 주소값이 나와야 하는데 toString()이 나옴
									// 내가 굳이 toStirng()하지 않아도 레퍼런스 변수만 찍겠다고 하더라도 그 안에 있는 toString을 연결함 
									// 원래 objcet의 toString을 Overrid로 메소드를 재작성했기 때문에 toSting()을 적지 않아도 Overrid한 toStirng() 값이 출력된다.
		Dog d = new Dog();
		d.setName("초코");
		d.setAge(1);
		d.setWeight(5.2);
		d.setHeight(50);
		d.setHair("장모");
//		System.out.println(d.inform());
//		System.out.println(d.toString());
		System.out.println(d);
		
		// 매개변수가 있는 생성자를 이용해 값을 넣을 수 있따.
		Dog d2 = new Dog("딸기", 2, 2.5, 30, "단모");
//		System.out.println(d2.inform());	
		// Dog클래스에서 이름,나이,몸무게는 초기화를 하지 않아서 기본값으로 출력됨
		// -> 값을 세팅하기 -> setter가 필요 -> super를 이용해 setter를 불러오기
//		System.out.println(d2.toString());
		System.out.println(d2);
		
		Snake s = new Snake();
		s.setName("방울이");
		s.setAge(1);
		s.setWeight(6.3);
		s.setPattern("육각");
//		System.out.println(s.inform());
//		System.out.println(s.toString());
		System.out.println(s);
		
		Snake s2 = new Snake("비단이", 2, 3.6, "빗살");
//		System.out.println(s2.inform());		
		// dog&Snack에 inform이 없어도 Animal에 있는 inform을 가지고 오기때문에 출력이 됨
		// but 확장된 값은 출력되지 않음 -> 내가 원하는 확장 값까지 출력 되게 하도록 하기
//		System.out.println(s2.toString());
		System.out.println(s2);
		
	}
}
