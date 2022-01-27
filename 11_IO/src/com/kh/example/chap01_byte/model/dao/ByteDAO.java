package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// 파일로부터 byte단위로 데이터를 읽어오고 싶다
		// 	----- --------  -------------
		//	File	Stream		Input		=> FileInputStream	(하나하나 분리해서 생각하기)
//		FileInputStream fis = new FileInputStream("a_byte.txt");	// Unhandled exception type FileNotFoundException
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			// 데이터 읽기 -> read()메소드 사용
//			fis.read();	// Unhandled exception type IOException -> try~catch사용하기
			
//			fis.read();
			// FileInputStrea.read():int
			// read()메소드는 데이터의 다음 값을 가져오는데, 데이터 끝에 도달하면 -1 반환	// for문은 개수가 정해져있을 때 사용하면 좋음 그래서 while문을 사용하는게 더 간단함
			
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read() + " ");	// 숫자말고 문자로 찍히게 하기 	
//				// b d f c e 로 찍힘  -> print안에 fis.read()가 있어 그 다음 값을 출력되기 때문에 온전하게 출력 되지 않음
//			}  // 변수를 사용해 fis.read를 한 번만 사용
			
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");	// 전체적으로 다 나옴
			}
		} catch (FileNotFoundException e) {	// FileNotFoundException을 throws하기 때문
			e.printStackTrace();	// // a_byte.txt (지정된 파일을 찾을 수 없습니다)
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileOpen2() {
		try(FileInputStream fis = new FileInputStream("a_byte.txt");){
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");	// 전체적으로 다 나옴
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		// 파일에 byte단위로 데이터를 쓰고싶다
		// ---- --------  ----------
		// File  Stream		Output			=> FileOutputFile
		// 파일이 존재하지 않으면 자동으로 만들어주고, 파일이 존재한다면 덮어씀
		FileOutputStream fos = null;  // null이라고 쓰는 이유 : 클래스 즉, 참조형 변수이기때문에 기본값이 null이기 때문
		try {
			fos = new FileOutputStream("a_byte.txt");
		// 코드를 이용해서 a_byte.txt에 저장하기 -> write() 메소드 사용
		//	fos.write(97);	// Unhandled exception type IOException -> try~catch사용하기
			fos.write(97);
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			fos.write(bArr);
			
			// bArr = bcdefg
			//         ^
			fos.write(bArr, 1, 3);	// 1번째부터 3개쓰겠다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			fos.close();	// fos에 빨간색 줄이 떠 있는 이유 : fos가 영향을 주는 영역과 안겹치기 때문 -> 변수를 위로 빼줘야 함
							// 변수를 위에 올리면 Unhandled exception type IOException가 뜸 -> try ~catch를 사용
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileSvae() {
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt");){
			fos.write(97);
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			fos.write(bArr);
			fos.write(bArr, 1, 3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
