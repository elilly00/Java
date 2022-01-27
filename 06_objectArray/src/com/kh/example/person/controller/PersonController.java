package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		// person 객체가 들어갈 수 있는 5개의 공간 pArr생성
		Person[] pArr = new Person[5];	//null 값이 출력
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
//		System.out.println(pArr[0].getName()); 
		// java.lang.NullPointerException 에러가 뜸 -> why? 필드에 초기화가 안되어 있어서 
		//  ㄴ>  pArr[0]애눈 null이 들어가 있기 때문에 getName()을 가져올 수 없음 
		
//		pArr[0] = new Person();	// person 객체의 주소값이 출력 됨
		pArr[0] = new Person("강건강", 25, '남', 185.6, 67.6);
		pArr[1] = new Person();
		pArr[2] = new Person();
		pArr[3] = new Person();
		pArr[4] = new Person();
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
	
		System.out.println(pArr[0].getName()); 
		// pArr[0]에는 Person객체가 들어가 있기 때문에 getName()을 가져올 수 있음
		// null이 뜨는 이유는 Person 기본 생성자로 만들었기 때문에 필드 초기화 x
		// 즉, String name의 기본 값  null이 들어가 있으므로 null 반환
	}	
	
	public void method2() {
		// 할돵과 동시에 초기화
		Person[] pArr = {new Person("남나눔", 14, '남', 167.7, 61.5),
						 new Person("도대담", 31, '남', 182.4, 67.5),
						 new Person("류라라", 18, '여', 172.4, 56.1)};
				
		for(int i = 0; i < pArr.length; i++) {	
			System.out.println(pArr[i]);					// Person 객체의 주소 값 출력
		}
		
		for(int i = 0; i < pArr.length; i++) {		
			System.out.println(pArr[i].personInfo());		// Person 객체의 값 출력
		}
		}
	
}
