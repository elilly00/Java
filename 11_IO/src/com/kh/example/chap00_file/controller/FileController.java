package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
//		File f1 = new File("tesc.txt");	// ���Ͽ� ���� ������ ���� �ְԴٴ� �ڵ�
//		f1.createNewFile();	// ���ο� ���� ����
		// Unhandled exception type IOException : IOException�� ���� ó���� �ȵƴ�.
		// ���� Ŭ������ �ִ� createBewFile�� �ҷ����� ������ create~�� IOException�� ������
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();		// ���ο� ���� ����
			// ��θ� �������� ���� ���¿��� ������ �������ָ� ������Ʈ�� �ֻ�ܿ� ������ �������
		
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile();	// => ������ ��θ� ã�� �� �����ϴ�
			// �ܼ��ϰ� ���ϸ� ������ִ� �޼ҵ�(��ΰ� ������ ���� �� ����)
		
			File f3 = new File("c:/temp1/temp2");
			File f4 = new File("c:/temp1/tmep2/test.txt");
//			f4.createNewFile();	// ���� ��ΰ� �ֱ� ������ ��������� ����
			f3.mkdirs();	// make directories	: �������� ��θ� ����� �ִ� ��   / mkdir() : �Ѱ��� ��θ� ����� ��
//			f4.createNewFile();
			f4.delete();	// ���� �����
			
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			System.out.println(f3.isFile());
			
			System.out.println(f1.getName());	// ���� ��
			System.out.println(f1.getAbsolutePath());	// ���� ���(������ �ʴ� �ּ� like �� �ּ�)
			System.out.println(f1.getPath());	// �����(�� ��ġ�� ���� �޶����� ��ġ)
			System.out.println(f1.length());
			System.out.println(f1.getParent());
			System.out.println(f4.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
