package com.kh.example.chap06_method.run;

import com.kh.example.chap06_method.controller.MethodPractice;
import com.kh.example.chap06_method.medel.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice();

		mp.method1(); // print문이 없어 출력되지 않음
//		String str = mp.method1();	// 반환값이 없음  // void

//		mp.method2();	// 값을 반환받긴 하나 저장을 따로 하지 않아 데이터가 날아감
//		int result1 = mp.method2();
//		System.out.println(result1);
		// 간단하게
		System.out.println(mp.method2());

		mp.method3(10, 20);

		String result2 = mp.method4("박정은", 20);
		System.out.println(result2);

		char[] result3 = mp.method5(); // chArr 값 반환해옴 // 얕은 복사
		System.out.println("Run result3 : " + result3);
		for (int i = 0; i < result3.length; i++) {
			System.out.println(result3);
	}
	
		
		System.out.println();
	
		Trainee result4 = mp.method6();	// 얕은 복사
		System.out.println("Run result4 : " + result4);
		System.out.println(result4.inform());
		
//		Trainee t1 = new Trainee("강건각", 'H', "오전", 98.5);
		
		
		
		result4.setName("박정은");
		result4.setClassRoom('G');
		System.out.println(result4.inform());
		
		System.out.println(result4.getACADEMY());
		System.out.println(result4.getClassRoom());
		System.out.println(result4.getName());
		System.out.println(result4.getTime());
		System.out.println(Trainee.getScore());
	}
}
