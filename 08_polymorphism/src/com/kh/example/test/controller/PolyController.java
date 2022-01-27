package com.kh.example.test.controller;

import java.util.Scanner;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class PolyController {
	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체 다루는 경우");
		Parent p1 = new Parent();
		// ㄴ> 부모타입 레퍼런스   ㄴ> 부모객체
		p1.printParent();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체 다루는 경우");
		Child1 c1 = new Child1();
		// ㄴ> 자식타입 레퍼런스   ㄴ> 자식객체	
		c1.printChild1();
		c1.printParent();
		
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체 다루는 경우");
		Parent p2 = new Child2();	// 다형성 적용
		// ㄴ> 부모타입 레퍼런스   ㄴ> 자식객체
		// 업 캐스팅 : 부모타입의 참조형 변수가 모든 자식 객체를 받을 수 있는 것

		p2.printParent();
//		p2.printChild2();	// p2 -> Parent 타입만 볼 수 있음
		((Child2)p2).printChild2();		// p2를 Child2로 바꿔 줌
		// 다운 캐스팅 
		System.out.println("4. 자식타입 레퍼런스로 부모 객체 다루는 경우");
//		Child2 c2 = new Parent();
		// ㄴ> 자식타입 레퍼런스   ㄴ> 부모객체
		
		System.out.println();
		System.out.println("== 간단 예제 ==");
		System.out.println();
		
		Parent[] pArr = new Parent[4];		// pArr애 4개짜리 배열이 들어감
		// 업 캐스팅이 적용된 상태
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		
//		((Child1)pArr[0]).printChild1();
//		((Child2)pArr[1]).printChild2();
//		((Child2)pArr[2]).printChild2();
//		((Child1)pArr[3]).printChild1();
		// 다운 캐스팅을 해야 값이 출력된다.	// 하나하나의 칸에 어떤 값이 들어있는지 알때 사용
		
		for(int i = 0; i < pArr.length; i++) {
			// instanceof 연산자 : 현재의 참조형 변수가 어떤 클래스형의 객체를 참조하고 있는지 확일할 때 사용
//			pArr[0] instanceof Child1		// pArr[0]에 들어가있는 객체가 Child1의 타입이니?  => true
//			pArr[1] instanceof Child1		// pArr[1]에 들어가있는 객체가 Child2의 타입이니?  => true
//			pArr[2] instanceof Child1		// pArr[2]에 들어가있는 객체가 Child1의 타입이니?  => false
//			pArr[3] instanceof Child2		// pArr[3]에 들어가있는 객체가 Child2의 타입이니?  => false
			// instanceof 연산자의 결과 값은 true/false -> 조건식에 많이 사용 됨
			
			if(pArr[i] instanceof Child1) {		// pArr[i]에 들어가있는 객체가 Child1이면
				((Child1)pArr[i]).printChild1();	// 다운 캐스팅 사용
			} else if(pArr[i] instanceof Child2){	
				((Child2)pArr[i]).printChild2();
			}
//			pArr[i].printParent();		// parent 값만 츌력 됨
		}
		
		System.out.println();
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();	// Parent꺼만 print가 될 줄 알았는데 Child1, 2가 출력 된다 
		//   ㄴ> Person 레퍼런스 `
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
