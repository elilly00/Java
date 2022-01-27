package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
//		File f1 = new File("tesc.txt");	// 파일에 대한 정보를 갖고 있게다는 코드
//		f1.createNewFile();	// 새로운 파일 생성
		// Unhandled exception type IOException : IOException이 아직 처리가 안됐다.
		// 파일 클래스에 있는 createBewFile을 불러오고 싶은데 create~는 IOException을 위임함
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();		// 새로운 파일 생성
			// 경로를 지정하지 않은 상태에서 파일을 생성해주면 프로젝트의 최상단에 파일이 만들어짐
		
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile();	// => 지정된 경로를 찾을 수 없습니다
			// 단순하게 파일만 만들어주는 메소드(경로가 없으면 만들 수 없음)
		
			File f3 = new File("c:/temp1/temp2");
			File f4 = new File("c:/temp1/tmep2/test.txt");
//			f4.createNewFile();	// 없는 경로가 있기 때문에 만들어지지 않음
			f3.mkdirs();	// make directories	: 여러개의 경로를 만들어 주는 것   / mkdir() : 한개의 경로를 만드는 것
//			f4.createNewFile();
			f4.delete();	// 파일 지우기
			
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			System.out.println(f3.isFile());
			
			System.out.println(f1.getName());	// 파일 명
			System.out.println(f1.getAbsolutePath());	// 절대 경로(변하지 않는 주소 like 집 주소)
			System.out.println(f1.getPath());	// 상대경로(내 위치에 따라 달라지는 위치)
			System.out.println(f1.length());
			System.out.println(f1.getParent());
			System.out.println(f4.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
