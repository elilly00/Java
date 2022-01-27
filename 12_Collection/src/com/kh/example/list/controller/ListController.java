package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		ArrayList l = new ArrayList();	// 기본 생성자(비어있는 생성자)를 만들면 크기가 10인 ArrayList가 만들어짐	
		// Constructs an empty list with an initial capacity of ten.
		// ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		// 제네릭을 설정 하지 않았기 때문에 Object가 들어가게 되어 여러 자료형이 들어갈 수 있게 됨
		// 하지만, 이런 방법으론 잘 사용하지 않음
		l.add("박신우");
		l.add(20);
		l.add(new Student());
//		System.out.println(l);
	
		ArrayList<Student> list = new ArrayList<Student>(3);	// 크기가 3인 ArrayList
		// add(E e):boolean   -> 리스트 끝에 데이터 추가하는 메소드
		list.add(new Student("테스트", 0));		// 제네릭을 통해 Student를 제한해 E부분이 Object -> Student로 바꼈음
		list.add(new Student("도대담", 60));
		list.add(new Student("남나눔", 90));
		System.out.println(list);	// 순서 유지
		
		list.add(new Student("하현호", 85));
		System.out.println(list);
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());		// size():int -> 전체 객체 개수
		list.add(new Student("문미미", 66));
		System.out.println(list);
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		// 컬렉션 장점 1. 크기 제약이 없다
		
		// 컬렉션 장점 2. 추가/삭제/정렬 등의 기능처리 간단함
		// add(int index, E e):void	-> index번째 객체에 E 추가하는 메소드
		list.add(0, new Student("류라라", 100));
		System.out.println(list);
		list.add(3, new Student("강건강", 40));
		System.out.println(list);
		
		// remove(int index):E		-> 해당 index번째 객체 삭제하는 메소드
		list.remove(1);
		System.out.println(list);   
		// remove(Object o):boolean		-> 해당 Object객체 삭제하는 메소드
		list.remove(new Student("강건강", 40));
		// 삭제 되지 않고 출력 됨	why? 컴퓨터는 주소값으로 구분하는데 new 연산자를 통해 새로운 주소값이 생성되었기 때문에 다른 객체로 인식해서 지워지지않음   
		
		System.out.println(list);				
		// 오버라이딩한 equals()메소드를 통해서 주소값이 아닌 필드 내용을 인식하도록 함	-> 원래 equals메소드는 Object클래스에 들어가 있지만 스트링으로 오버라이딩해서 사용함
		// ㄴ> 받아온 Student 클래스의 equals를 오버라이딩을 해줘야 같은 내용인지 아닌지를 비교할 수 있음
		// equals대신 for문을 사용할 수 있음
		
//		ArrayList<String> test = new ArrayList<String>();
//		test.add("전은정");
//		test.add("곽우찬");
//		test.add("나은혜");
//		test.add("이현애");
//		System.out.println(test);
//		Collections.sort(test);		// 오름차순으로 정렬 됨
		// The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Student>)
		// Collections안에 있는 sort메소드는 ArrayList<Music>를 인자로해서 적용할 수 없다
		// String은 오름차순이 기준이라는 전제 하에 내가 굳이 정렬기준을 세워놓지 않아도 정렬이 됨
		
		// 정렬 방법 1. Collections라는 클래스에 sort라는 메소드 사용해서 정렬
		Collections.sort(list);		// 기준이 정해져있지 않으면 정렬 x -> Student클래스에 제네릭을 통해 타입을 제한하면 됨
		System.out.println(list);

		Collections.sort(list, new StudentComparator());	// 점수 정렬
		System.out.println(list);
		
		list.add(new Student("박보배", 85));	// 하현호와 같은 점수
		list.sort(new StudentComparator());	// sort() : 데이터 정렬을 위한 메소드	
		System.out.println(list);	// StudentComparator에 내림차순으로 정렬되어 있기때문에 내림차순으로 정렬되어 출력됨
	
		// set(int index, E e):E	-> index번째에 있는 요소를 E로 수정하는 메소드
		list.set(3, new Student("강건강", 45));
		System.out.println(list);
		list.set(3, new Student("박보배", 85));	
		System.out.println(list);
	
		// get(int index):E		-> index번째에 있는 요소 반환하는 메소드
		Student s = list.get(2);
		System.out.println(s);
		System.out.println(list);	
		
		// contains(Object o): boolean		-> o가 리스트에 존재하는지 확인하는 메소드, 있으면 true / 없으면 false
		// indexOf(Object o):int			-> o가 리스트에 위치하는 인덱스 번호 반환, 있으면 1 / 없으면 -1
		System.out.println(list.contains(new Student("남나눔", 90)));		// true가 출력되는 이유 : equals를 오버라이딩 했기 때문
		System.out.println(list.indexOf(new Student("남나눔", 90)));
		System.out.println(list.indexOf(new Student("강건강", 45)));		// 리스트에 존재하지 않는다면 -1을 출력 함
		
		// clear():void			 -> 저장된 모든 객체 삭제
		// isEmpty():boolean	 -> 리스트가 비어있는지 확인, 비어있으면 true / 비어있지 않으면 false
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	}
	
	
	
	
	
}
