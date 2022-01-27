package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
//		HashSet set = new HashSet();	// 타입을 제한하지않아(제네릭을 사용하지 않은 상태이기 때문에) 노란줄이 뜸
		
		HashSet<Dog> set = new HashSet<Dog>();	// 슌서 유지가 안됨
		// add(E e):boolean		-> set 안에 e 추가하는 메소드
		set.add(new Dog("자두", 6.4));
		set.add(new Dog("두이", 4));
		set.add(new Dog("호두", 3.4));
		System.out.println(set);	
		
		set.add(new Dog("자두", 6.4));
		System.out.println(set);	// 주소 값이 달라서 출력 됨
		// 주소값이 아닌 내용을 읽도록 하는 방법 : equals 오버라이딩 
		
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();	// 순서 유지 o, 중복 저장 x
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 25.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println(set2);	
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println(set2);
		
		// set에는 index가 없기 때문에 get은 없음 대신 iterator가 있음
		
		// 요소 가져오기 1. set을 List로 바꾸기
		ArrayList<Dog> list = new ArrayList<Dog>(set2);
		System.out.println(list);
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 요소 가져오기 2. iterator 이용
		Iterator<Dog> it = set2.iterator();	// 단방향
		while(it.hasNext()) {
			Dog d = it.next();	// 다음 값을 가져와라
			System.out.println(d);
		
		}
		
		TreeSet<String> test = new TreeSet<String>();	// 정렬이 자동으로 되지만 중복은 허용되지 않음
		test.add("남윤수");
		test.add("나준영");
		test.add("조원빈");
		test.add("송민경");
		test.add("조현주");
		test.add("박윤수");
		System.out.println(test);
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);	// set2에 들어있는 데이터를 한번에 set3에 넣음
		System.out.println(set3);	
		// java.lang.ClassCastException 에러가 남
		// 원인 : Dog클래스에 정렬기준(Comparable)이 없기 때문 -> 
		
		// 이름에 대해서 정렬 하고 싶다? -> DogComparator클래스에서 Comparator 사용
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set3);	// addAll() : 안에있는 데이터를 한번에 다 집어 넣는 메소드
		set4.add(new Dog("로이", 2.1));
		System.out.println(set4);
	}	
}
