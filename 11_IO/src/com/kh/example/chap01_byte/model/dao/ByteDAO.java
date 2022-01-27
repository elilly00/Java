package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// ���Ϸκ��� byte������ �����͸� �о���� �ʹ�
		// 	----- --------  -------------
		//	File	Stream		Input		=> FileInputStream	(�ϳ��ϳ� �и��ؼ� �����ϱ�)
//		FileInputStream fis = new FileInputStream("a_byte.txt");	// Unhandled exception type FileNotFoundException
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			// ������ �б� -> read()�޼ҵ� ���
//			fis.read();	// Unhandled exception type IOException -> try~catch����ϱ�
			
//			fis.read();
			// FileInputStrea.read():int
			// read()�޼ҵ�� �������� ���� ���� �������µ�, ������ ���� �����ϸ� -1 ��ȯ	// for���� ������ ���������� �� ����ϸ� ���� �׷��� while���� ����ϴ°� �� ������
			
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read() + " ");	// ���ڸ��� ���ڷ� ������ �ϱ� 	
//				// b d f c e �� ����  -> print�ȿ� fis.read()�� �־� �� ���� ���� ��µǱ� ������ �����ϰ� ��� ���� ����
//			}  // ������ ����� fis.read�� �� ���� ���
			
			int value;
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");	// ��ü������ �� ����
			}
		} catch (FileNotFoundException e) {	// FileNotFoundException�� throws�ϱ� ����
			e.printStackTrace();	// // a_byte.txt (������ ������ ã�� �� �����ϴ�)
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
				System.out.print((char)value + " ");	// ��ü������ �� ����
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		// ���Ͽ� byte������ �����͸� ����ʹ�
		// ---- --------  ----------
		// File  Stream		Output			=> FileOutputFile
		// ������ �������� ������ �ڵ����� ������ְ�, ������ �����Ѵٸ� ���
		FileOutputStream fos = null;  // null�̶�� ���� ���� : Ŭ���� ��, ������ �����̱⶧���� �⺻���� null�̱� ����
		try {
			fos = new FileOutputStream("a_byte.txt");
		// �ڵ带 �̿��ؼ� a_byte.txt�� �����ϱ� -> write() �޼ҵ� ���
		//	fos.write(97);	// Unhandled exception type IOException -> try~catch����ϱ�
			fos.write(97);
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			fos.write(bArr);
			
			// bArr = bcdefg
			//         ^
			fos.write(bArr, 1, 3);	// 1��°���� 3�����ڴ�.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			fos.close();	// fos�� ������ ���� �� �ִ� ���� : fos�� ������ �ִ� ������ �Ȱ�ġ�� ���� -> ������ ���� ����� ��
							// ������ ���� �ø��� Unhandled exception type IOException�� �� -> try ~catch�� ���
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
