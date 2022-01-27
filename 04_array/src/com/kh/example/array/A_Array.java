package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
//	배열은 같은 자료형의 변수를 하나의 묶음으로 다루는 것

//	배열의 선언
//		자료형[] 배열명;
//		자료형 배열명[];
//	배열의 할당
//		자료형[] 배열명 = new 자료형[배열크기];
//		자료형 배열명[] = new 자료형[배열크기];
//		new연산자를 통해 Heap메모리 영역에 공간을 배열 크기만큼 생성
//		생성이 되는 순간 그 공간에 대한 주소 값 발생
//		발생한 주소 값은 대입 연산자에 의해 배열명 공간에 대입(참조하고 있음)
//	배열의 초기와
//		1) 인덱스 이용 : zero-based
//		2) for문 이용 : 규칙이 있을 때만 사용 가능
//		3) 선언과 동시에 초기화
//			자료형[] 배열명 ={값};
//			자료형[] 배열명 = new 자료형[] {값};
	public void method1() {
		int num1 = 10;	
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;	// 변수를 다 적어야 해서 너무 귀찮
		
		int[] arr = new int[9];		// 배열 이용
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
		for(int i = 0; i < arr.length; i++) {	// arr.length : 배열의 길이 만큼 넣겠다
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		// 인덱스를 이용한 초기화
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		arr[5] = 60;
//		arr[6] = 70;
//		arr[7] = 80;
//		arr[8] = 90;
		
		// 규칙이 보이므로 for문을 이용한 초기화
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (i + 1) * 10;					// 값을 다 집어 넣고 출력
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");			
		
		for (int i = 0; i <= arr.length; i++) {
			arr[i] = (i + 1) * 10;
			System.out.print(arr[1] + " ");		// 값을 집어 넣고 출력 반복
			}
		System.out.println();
		
//		System.out.println(arr);	// 주소 값이 출력
		}

	// 선언과 동시에 초기화
	public void method2() {
		int[] iArr1 = {1, 2, 3, 4, 5};
		int[] iArr2 = new int[] {11, 22, 33, 44, 55};
		String[] strArr = {"red", "orange", "yellow"};
		
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr2[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]+ " ");
		}
	}
	public void method3() {
		// 5개의 공간를 가진 int형 배열 iArr
		int[] iArr = new int[5];
		// 10개의 공간을 가진 char형 배열 cArr
		char[] cArr = new char[10];
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]+ "|");	// 일단 눈에 보이도록 |를 입력한 거임
		}
		System.out.println();
		
		System.out.println("iArr : " + iArr);	// iArr의 주소 값이 출력 
		System.out.println("cArr : " + cArr);	// cArr의 주소 값이 출력 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당 할 배열의 크기 입력 : ");
		int size = sc.nextInt();
		
		iArr = new int[size];
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.println("iArr : " + iArr);	// 주소가 달려 졌음 -> 새로운 공간을 만들어서 새롭게 할당 함
		
		iArr = null; // null을 넣어 줌으로서 기존에 연결 되었던 주소 값이 끊기게 됨
	}
	
}
