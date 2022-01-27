package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (MyException e) {
			
//			e.printStackTrace();
			System.out.println(e.getMessage());		
			// 입장 불가라는 문구만 출력 됨
		} // if문으로 만들어도 되지만 지금은 연습하기 위해 억지로 만들어서 한거임
		
	}
	public void checkAge(int age) throws MyException {
		if(age <19) {
			throw new MyException("입장 불가");	
		} else {
			System.out.println("즐거운 관람되시길 바랍니다.");
		}
	}
}
