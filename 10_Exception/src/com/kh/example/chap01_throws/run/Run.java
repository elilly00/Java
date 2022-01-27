package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		ThrowsController tc = new ThrowsController();
		
		// throws Exception을 사용하면
		// Exception in thread "main"이 붙은 뒤 에러가 난다.
		// -> 진짜로 예외가 처리가 되지 않아서 뜨는 거임
		
		try {
			tc.method1();
		} catch (Exception e) {	// Exception 부분을 잡아라  // e는 변수 
			
//			e.printStackTrace();	
			// printStackTrace() 
			// : 예외 내용 및 발생 위치를 콘솔에 출력해주는 메소드
			System.out.println("예외상황이 발생했습니다.");
		}
		// try~catch문을 사용하면 서로 넘겨주던 폭탄을 제거해서 밑에 있는 코드를 출력시킬 수 있게 됨

		System.out.println("정상적으로 종료됨...");
	}
}
