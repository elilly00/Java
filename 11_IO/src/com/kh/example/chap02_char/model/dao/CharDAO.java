package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileOpen() {
		// ���Ϸκ��� ���ڱ������ �����͸� �о���� �ʹ�
		// ------- -------   --------------
		// File		Stream x		Reader		=> FileReader
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value;
			while((value = fr.read()) != -1) {		
				System.out.print((char)value + " ");	// �ι� �Ѿ�� ����ϱ� ������ ������ ������ ������ ���� -> ������ ����� ���� �� ���¿��� �����ؾ���
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave() {
		// ���Ͽ� ���ڱ������ �����͸� ����ʹ�
		// ----  -------  ----------
		// File   Stream x   Writer		=> FileWriter
		FileWriter fw = null;
		try {
//			fw = new FileWriter("b_char.txt");	// ������ ���� ��
			fw = new FileWriter("b_char.txt", true);	// ���� ���Ͽ� �̾ �ۼ��ϱ�
			fw.write("��, IO ��մ�!");
			fw.write('A');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {	// closee�� ���� �ʾ� b_char.txt�� ���ڰ� ������� ����
			e.printStackTrace();	// ByteDAO���� close�� ���� �ʾƵ� �� ��µǾ����� close�� �������
		} finally {					// ���� ����� ���ڷ� �о���� ������ �Ű�Ἥ �� �ݾ������
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
