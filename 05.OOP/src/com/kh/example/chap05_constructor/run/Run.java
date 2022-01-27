package com.kh.example.chap05_constructor.run;

import java.util.Date;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User(); // 기본 생성자
		System.out.println("u1 : " + u1);
		u1.inform();

		User u2 = new User("user01", "pass01", "강건강", new Date());
		System.out.println("u2 : " + u2);
		u2.inform();

		User u3 = new User("user02", "pase02", "남나눔");
		System.out.println("u3 : " + u3);
		u3.inform();

		User u4 = new User("user03", "pase03");
		System.out.println("u4 : " + u4);
		u4.inform();
	}
}
