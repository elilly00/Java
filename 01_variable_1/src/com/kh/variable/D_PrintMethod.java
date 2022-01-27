package com.kh.variable;

public class D_PrintMethod {
	public void printlnExample() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str2);
		System.out.println();
		System.out.println(str1);
		
	}
	public void printExample() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		System.out.print(str1);
		System.out.print(str2);
		
		System.out.print(str1 + "\n"); // \n 줄바꿈
		System.out.print(str2);
			
		}
	public void printfExample() {
		String str1 ="안녕하세요";
		String str2 = "반갑습니다";
		// 안녕하세요, 박정은입니다. 반갑습니다.
		System.out.printf("%s, 박정은입니다. %s.", str1, str2);
		// 반갑습니다, 친하게 지내요.
		System.out.printf("%s, 친하게 지내요. ", str2);
		System.out.println();
		
		int age = 20;
		String name = "박정은";
		String job = "학생";
		
		// 안녕하세요, 저는 20살 박정은 학생입니다. 만나서 반갑습니다.
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s", str1, age, name, job, str2);
		
	}
	
		
	
}
