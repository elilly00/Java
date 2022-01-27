package com.kh.example.chap03_assist.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferDAO {
	public void inputByte() {
		// 파일에 있는 데이터를 바이트 기반으로 빠르게 읽어오고 싶다
		// --- ------- ----- ---------
		// File Stream Input => FileInputStream
		// Buffered => BufferedInputStream
		try (FileInputStream fis = new FileInputStream("c_buffer.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {

			int value;
			while ((value = bis.read()) != -1) {
				System.out.print((char) value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void outputByte() {
		// 파일의 데이터를 바이트 기바능로 빠르게 쓰고싶다
		// --- ------ ---- -----
		// File Stream Output => FileOutputStream
		// Buffered => BufferedOutputStream
//		BufferedOutputStream bos = null;
		try (FileOutputStream fos = new FileOutputStream("c_buffer.txt", true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) { // 세미콜론은 구분하는 용도로 뒤에 붙임
			// 둘 중 하나라도 try안에 안들어가 있으면 인식이 안됨. 둘 다 넣어 줄 것

			bos.write(65);

			byte[] bArr = { 66, 67, 68, 69 };
			bos.write(bArr);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /*
			 * finally { try { bos.close(); } catch (IOException e) { e.printStackTrace(); }
			 * }
			 */

	}

	public void outputChar() {
		// 파일에 문자 기반으로 데이터를 빠르게 쓰고 싶어
		// --- --------- ---- ------
		// File Stream x Writer => FileWriter
		// Buffered => BufferedWriter
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt", true));) {
			// 객체 자체로 넣어도 되고 변수로 치환해서 넣어도 됨
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void inputChar() {
		// 파일로부터 문자 기반으로 데이터를 빠르게 읽고 싶어
		// --- ------- ---- ------
		// File Stream x Reader => FileReader
		// Buffered => BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
//			br.readLine();		// readLine()은 한 줄씩 읽어 옴(끝까지 읽고 그 뒤엔 null이 출력)  <-> read()는 한 글자씩 읽어 옴
			// ㄴ> Scanner의 nextLine()과 같은 역할을 함

			String value = null;
			while ((value = br.readLine()) != null) {
				System.out.print(value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) { // IOException까지 close 해야 하기 때문
			e1.printStackTrace();
		}
	}

	public void ioTest() {
		// 사용자에게 이름과 나이를 입력 받고, 사용자의 10년 후의 나이를 출력
		// 기본 입출력(기반 스트림의 역할)
		// System.in : InputStream
		// System.out : PrintStream
//		InputStreamReader isr = new InputStreamReader(System.in);	// 바이트 기반인 system.in를 문자기반으로 바꿔주는 것
//		BufferedReader br = new BufferedReader(isr);	// 빠르게 읽고 싶어 -> BufferedReader로 isr를 감싸줌
		// 많이 사용되지 않음
		
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

			System.out.print("이름 입력 : ");
			String name = br.readLine();
			System.out.print("나이 입력 : ");
			int age = Integer.parseInt(br.readLine()); // Scanner의 nextLine() 대신 readLine()을 사용했기 때문에 import를 하지 않아도 됨

//			System.out.println(name + "님의 10년 후의 나이는" + (age + 10) + "살입니다.");
			bw.write(name + "님의 10년 후의 나이는" + (age + 10) + "살입니다.");		

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
