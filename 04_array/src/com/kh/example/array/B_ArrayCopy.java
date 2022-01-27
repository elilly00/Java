 package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만 복사
	// 깊은 복사 : 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사
	//		1) for문 이용		2) System.arraycopy 이용	3) Arrays.copyOf 이용	4) clone (사용하지 않는다)
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};	// 선언과 동시에 초기화	// originArr 배열은 {1,~5}배열의 주소 값을 가지고 있다
		int[] copyArr = originArr;	// 얕은 복사	// 그 주소 값을 copyArr에 넣음
		
		System.out.println("originArr : " + originArr);		// originArr 주소 값 출력
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);		// copyArr 주소 값 출력
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		copyArr[0] = 99;		// 사본 배열 값 변경하기
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
		
		//원본배열과 사본배열 서로가 참조하고 있는 배열이 같음 (주소 값이 같음)
	}
	// 깊은 복사
	
	public void method2() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[originArr.length];		
						// new int[5]로 입력해도 되지만 originArr의 길이를 그래도 가지고 올꺼기 때문에
						// 굳이 숫자를 입력하지 않고 간단하게 .length를 써서 배열 길이 그대로 가지고 온다.
		
		// for문을 이용한 복사
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i]; 	// 내가 집어 넣어야 할 공간 = 복사할 값;	
			// copyArr = originArr; -> 이렇게 적으면 복사하는 의미가 없다.(주소 값만 가지고 잇는 것이기 때문에) 
			// 실제 값을 가지고 있는 공간은 대괄호를 이용해 인덱스값을 넣어 연결해야 하기 때문
		}
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		copyArr[0] = 99;
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		// 원본 배열과 사본 배열 서로가 참조하고 있는 배열이 다름 (주소 값이 다름)
	}

	public void method3() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];	// 원래 가지고 있는 길이 보다 크게 입력
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
//		System.arraycopy() 이용한 복사
		 
//		System.arraycopy(src, srcPos, dest, destPos, length);	// 어떤 배열을 어디서 부터 보
//			src 	: 원본 배열
//			srcPos	: 원본배열에서 복사를 시작할 위치
//			dest	: 복사 배열
//			destPos : 복사 배열에서 붙여넣기를 시작할 위치
//			length	: 복사 길이
		// 즉, 어떤 배열을 어디서부터 복사해서 어디에다가 어디에서부터 붙여넣고 몇개를 갖다 붙여놓은건지
		
		// 원본 배열의 0번째서부터 원본배열 길이만큼 복사 후 , 복사 배열 3번째서부터 붙여넣기
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println();
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}	// 배열 3번째에서부터 원본배열이 자동으로 붙여넣어져 출력됨
		
		System.out.println();
		originArr[0] = 99;		// 원본배열 값 바꿔보기
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}	//  원본만 값이 변함 (서로 다른 주소 값을 갖고 있기 때문)
	}

	public void method4() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
//		Arrays.copyOf 이용
		
//		Arrays.copyOf(original, newLength)	// copyOf 반환값 -> int[](배열)
//			original	: 원본 배열
//			newLength	: ??????
		 
		copyArr = Arrays.copyOf(originArr, originArr.length);	// ctrl 누른 상태에서 copyOf를 누르면 Array.class로 들어가진다
		
		System.out.println();
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
		System.out.println();
		originArr[0] = 99;
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
	}

	
}