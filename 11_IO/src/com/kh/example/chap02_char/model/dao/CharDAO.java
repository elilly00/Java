package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileOpen() {
		// 파일로부터 문자기반으로 데이터를 읽어오고 싶다
		// ------- -------   --------------
		// File		Stream x		Reader		=> FileReader
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value;
			while((value = fr.read()) != -1) {		
				System.out.print((char)value + " ");	// 두번 넘어가서 출력하기 때문에 온전한 값으로 나오지 않음 -> 변수를 만들어 놓고 그 상태에서 진행해야함
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
		// 파일에 문자기반으로 데이터를 쓰고싶다
		// ----  -------  ----------
		// File   Stream x   Writer		=> FileWriter
		FileWriter fw = null;
		try {
//			fw = new FileWriter("b_char.txt");	// 파일을 덮어 씀
			fw = new FileWriter("b_char.txt", true);	// 기존 파일에 이어서 작성하기
			fw.write("와, IO 재밌다!");
			fw.write('A');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {	// closee를 하지 않아 b_char.txt에 문자가 저장되지 않음
			e.printStackTrace();	// ByteDAO에선 close를 하지 않아도 잘 출력되었지만 close를 사용했음
		} finally {					// 문자 기반은 문자로 읽어오기 때문에 신경써서 꼭 닫아줘야함
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
