package com.kh.example.chap04_filed.run;

import com.kh.example.chap04_filed.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
		KindsOfVariable2 k2 = new KindsOfVariable2();
		int a1 = k2.staticNum;		// 노란색 줄 : 경고 (웬만하면 안뜨도록 하는게 좋음)
//		The value of the local variable a1 is not used : 지역 변수 값이 사용되지 않았다
//		The static field KindsOfVariable2.staticNum should be accessed in a static way : staticNum은 static 방식으로 접근해야 한다 
//																						즉, 지금은 static 접근 방식이 아니다
		// static예약어가 들어가 있는 것에 대한 접근은 객체를 만들 필요x
		// 객체 생성 없이 '클래스명.필드명' / '클래스명.메소드명'으로 접근 가능
		int a2 = KindsOfVariable2.staticNum;
		
		k2.method();
		k2.method();
		
		KindsOfVariable2 k22 = new KindsOfVariable2();
		k22.method();
	}
}
// static은 프로그램이 시작 했을 때 staic 메모리 영역에 할당