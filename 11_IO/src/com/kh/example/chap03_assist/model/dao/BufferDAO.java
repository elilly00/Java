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
		// ���Ͽ� �ִ� �����͸� ����Ʈ ������� ������ �о���� �ʹ�
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
		// ������ �����͸� ����Ʈ ��ٴɷ� ������ ����ʹ�
		// --- ------ ---- -----
		// File Stream Output => FileOutputStream
		// Buffered => BufferedOutputStream
//		BufferedOutputStream bos = null;
		try (FileOutputStream fos = new FileOutputStream("c_buffer.txt", true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) { // �����ݷ��� �����ϴ� �뵵�� �ڿ� ����
			// �� �� �ϳ��� try�ȿ� �ȵ� ������ �ν��� �ȵ�. �� �� �־� �� ��

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
		// ���Ͽ� ���� ������� �����͸� ������ ���� �;�
		// --- --------- ---- ------
		// File Stream x Writer => FileWriter
		// Buffered => BufferedWriter
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt", true));) {
			// ��ü ��ü�� �־ �ǰ� ������ ġȯ�ؼ� �־ ��
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�\n");
			bw.write("����������\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void inputChar() {
		// ���Ϸκ��� ���� ������� �����͸� ������ �а� �;�
		// --- ------- ---- ------
		// File Stream x Reader => FileReader
		// Buffered => BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));) {
//			br.readLine();		// readLine()�� �� �پ� �о� ��(������ �а� �� �ڿ� null�� ���)  <-> read()�� �� ���ھ� �о� ��
			// ��> Scanner�� nextLine()�� ���� ������ ��

			String value = null;
			while ((value = br.readLine()) != null) {
				System.out.print(value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) { // IOException���� close �ؾ� �ϱ� ����
			e1.printStackTrace();
		}
	}

	public void ioTest() {
		// ����ڿ��� �̸��� ���̸� �Է� �ް�, ������� 10�� ���� ���̸� ���
		// �⺻ �����(��� ��Ʈ���� ����)
		// System.in : InputStream
		// System.out : PrintStream
//		InputStreamReader isr = new InputStreamReader(System.in);	// ����Ʈ ����� system.in�� ���ڱ������ �ٲ��ִ� ��
//		BufferedReader br = new BufferedReader(isr);	// ������ �а� �;� -> BufferedReader�� isr�� ������
		// ���� ������ ����
		
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

			System.out.print("�̸� �Է� : ");
			String name = br.readLine();
			System.out.print("���� �Է� : ");
			int age = Integer.parseInt(br.readLine()); // Scanner�� nextLine() ��� readLine()�� ����߱� ������ import�� ���� �ʾƵ� ��

//			System.out.println(name + "���� 10�� ���� ���̴�" + (age + 10) + "���Դϴ�.");
			bw.write(name + "���� 10�� ���� ���̴�" + (age + 10) + "���Դϴ�.");		

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
