package com.kh.example.chap01_String_controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		// String test
		String str1 = "java";	// �� ����ִ� ��
		String str2 = "java";	// ��� 1 . ���� �� ����ֱ�	
		String str3 = new String("java");	// ��� 2. new ������ ����ؼ� �� ����ֱ�
		
		System.out.println("str1 : " + str1);	// �ּҰ��� ��µ��� �ʰ� �����Ͱ� ��µ� -> why? toString()�� �������̵� �Ǿ��ֱ� ����
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		boolean bool1 = str1 == str2;	// ���ڿ������� ==�񱳴� �ּ� �� ��   	// ���ڿ��� ���� ��� �ϰ� �ʹٸ� .equals�� ���
		boolean bool2 = str1 == str3;	
		System.out.println("str1�� str2�� �ּҴ� ������? : " + bool1);
		System.out.println("str1�� str3�� �ּҴ� ������? :" + bool2);		// new �����ڸ� ���� ���ο� ������ ��������� ������ str3�� �ּҰ��� �ٸ�
		
		System.out.println("str1�� hashCode : " + str1.hashCode());		// hashcode()�� �ּҰ��� ���� -> �ּҰ��� ��� ��
		System.out.println("str2�� hashCode : " + str2.hashCode());		// hashcode�� ����(��)�� ���ٸ� hashcode�� ���� ������ ��
		System.out.println("str3�� hashCode : " + str3.hashCode());		// �׷��� str3�� ���ּҰ��� �ٸ����� ���� ���⶧���� hashcode�� ����ϸ� �ּҰ��� ���� ��� ��
		
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		
		System.out.println();
		
		str1 += "API";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		System.out.println("str1�� hashCode : " + str1.hashCode());		// API��� ���� �������� ������ ������ �޶��� -> hashcode �ּҰ��� �ٸ��� ��µ�
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
	}
	
	public void method2() {
		// StringBuffer/StringBuilder test
		// � ���ڿ��� �۾��� ��, ����ؼ� ���ڿ��� �����ؾ� �� ��� StringŬ������ '�Һ�'�̶�� Ư¡ ��
		// ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������ �������÷��Ͱ� ��� �������ϴ� ������ ����
		// StringŬ������ ���� ������ ���� �б⸸ ���� ��쿡 �� ���� ��
		// ������ ���� ��찡 ���� ��� StringBuffer�� StringBuilder�� �̿��ϴ� ���� �� ���� ��
		// ����/������ ���� �޸� ����(���� = �ӽð���)�� ���ο� ���ϴµ� �ʱ⿡�� 16���� ������ ����� �� ���� �ڵ����� ���� ��
		// �� Ŭ������ ���̴� ����ȭ�� �Ǵ��� �ȵǴ����� ����
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ���ִ� ���� ���� ���� : " + buffer1.length()); 	
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());		// 100�� ���� �־��� ������ 100�� ��� ��
		System.out.println("buffer2�� ���ִ� ���� ���� ���� : " + buffer2.length()); 	
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());		// �ʱ� ���뷮�� 16���� abc�� ���� ���뷮�� 19�� ��
		System.out.println("buffer3�� ���ִ� ���� ���� ���� : " + buffer3.length()); 	
		
		System.out.println();
		
		System.out.println("buffer3�� ���ּҰ� : " + System.identityHashCode(buffer3));
		// append(String str):StringBuffer	
		// �� �ڿ� str�� �߰��ϴ� �޼ҵ�
//		buffer3.append("abc");
//		System.out.println("abc �߰� ���� buffer3 : " + buffer3);
//		System.out.println("abc �߰� ���� buffer3 �뷮 : " + buffer3.capacity());		
//		System.out.println("abc �߰� ���� buffer3 ���� : " + buffer3.length());
//		
//		System.out.println();
//		
//		buffer3.append("def");
//		System.out.println("def �߰� ���� buffer3 : " + buffer3);
//		System.out.println("def �߰� ���� buffer3 �뷮 : " + buffer3.capacity());		
//		System.out.println("def �߰� ���� buffer3 ���� : " + buffer3.length());
		// 		��  (�޼ҵ� ü�̴� ���)
		buffer3.append("abc").append("def");	// �޼ҵ� ü�̴�
//		------	-------------
//		�� StringBuffer  ��StringBuffer.append(Stirng str):StirngBuffer
		System.out.println("abc, def �߰� ���� buffer3 : " + buffer3);
		System.out.println("abc, def �߰� ���� buffer3 �뷮 : " + buffer3.capacity());		
		System.out.println("abc, def �߰� ���� buffer3 ���� : " + buffer3.length());
		System.out.println("buffer3�� ���ּҰ� : " + System.identityHashCode(buffer3));		// ���� ���ּҰ��� ���� -> ���� ���� ���� �� �� ����
		
		System.out.println();
		
		// insert(int offset, String str):StringBuffer
		// ���ϴ� ��ġ�� str�� �߰��ϴ� �޼ҵ�
		buffer3.insert(2, "zzz");
		System.out.println("�ε��� 2�� zzz�߰� ���� buffer3 : " + buffer3);
	
		// delete(int start, int end):StringBuffer
		// start <= indec < end  // end�� ���� �ȵǱ� ������ end ������ ���� ��
		buffer3.delete(2, 5);
		System.out.println("�ε��� 2���� �ε���5���� ���� ���� buffer3 : " + buffer3);
		
		System.out.println();
		
		// reverse():StringBuffer
		// �Ųٷ� ����ϴ� �޼ҵ�
		buffer3.reverse();
		System.out.println("reverse ���� buffer3 : " + buffer3);
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2,  "yy").reverse().delete(1, 3);
		System.out.println(sb);
	}
	
	public void method3() {
		String str = "Hello World";
		
		// charAt(int index):char
		// String�� indext��°�� char ��ȯ
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// concat(String str):String
		// ���� �� �ڿ� str�� �߰����ִ� �޼ҵ�
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		
		str += "!!!";
		System.out.println(str);
		
		// equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		
		// substring(int beginIndex):String
		// String�� �Ϻ� ��ȯ 
		// Stinrg�� indext��°���� ��ȯ
		// sunString(int beginIndex, int endIndex):String
		// String�� index��°���� index��° ������ ��ȯ   
		// => ���� ����
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("Str.substring(0, 4) : " + str.substring(0, 4));
		
		// replace(char oldChar, char newCahr):String
		// oldChar�� newChar�� ��ü�� ���ڿ� ��ȯ
		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));
		
		
		// toUpperCase() / toLowerCAse():String
		// ��� �빮��/ �ҹ��ڷ� �ٲ� ��ȯ
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Ͻðڽ��ϰ�?(y/n) : ");
		String answerStr = sc.nextLine().toLowerCase();		// ������ �빮�� Y/N�� ���� ���� ���� �ʾ�����  toLowerCase()�� ����ϸ� �빮�ڸ� �ᵵ �ҹ��ڷ� �ν��ϱ� ������ ���� ��
		char answer = answerStr.charAt(0);
		if(answer == 'y') {
			System.out.println("��� �Ѵ�ϴ�.");
		} else if(answer == 'n') {
			System.out.println("�׸� �Ѵ�ϴ�.");
		}
		
		// equalsIgnoreCase():boolean
		// ��ҹ��ڸ� ������ �ʰ� ���ڿ� ��
		String str2 = "WONDERFUL";
		String str3 = "wonderful";
		System.out.println(str2.equals(str3));				// ��ҹ��ڰ� �ٸ��� ������ false�� ����
		System.out.println(str2.equalsIgnoreCase(str3));	// ��ҹ��� ������ �ʰ� ���ڿ��θ� ���ؼ� true�� ����	
		
		// Trim():String
		// ��/�ڿ� �ִ� �� ������ ������ ���ڿ� ��ȯ		=> ��û ���� ����
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "  Java   ";
		String str7 = "Ja     va";
		System.out.println(str4 + " : " + str4.trim());
		System.out.println(str5 + " : " + str5.trim());
		System.out.println(str6 + " : " + str6.trim());
		System.out.println(str7 + " : " + str7.trim());		// ���ڿ��� �ν��ϱ� ������ ��ÿ� ����� ��ĭ�� ���Ű� �ȵ�
		
		// split(String str) : String[]
		// ���ڿ��� �и����ִ� �޼ҵ� 
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] strArr = splitStr.split(", ");
		System.out.println(strArr);		// strArr�� �ּҰ� ���
		
		// �Ϲ� for��
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// ���� for�� = for-each��  => ���� ��
		for(String s : strArr) {	// atrArr�ȿ� �ִ� ���ڵ��� �ϳ� ������ �ӽ÷� s�� ���
			System.out.println(s);	// s�� ��� �� ���� ���� ������ s�� ��� s�� ��� ~ �� �Ҷ����� �ݺ�
		}
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer st = new StringTokenizer(str, ", ");	// ", " �� �ڸ��� ����Ұ�~
		System.out.println("�и��� ���ڿ� ���� : " + st.countTokens());
		// haseMoreTokens():boolean
		// ���� ��ū(�и��� ���ڿ�) ���� �ִٸ� true ��ȯ
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			// nextToken():String
			// �ش��ϴ� ���� �� ��ȯ
		}
		System.out.println();
		
		String str2 = "Apple,banana-Cream*Dessert#Egg Fruits";
		String[] strArr = str2.split(",-*# ");
//		String[] strArr = str2.split(",|-|*|#| ");	// ����ǥ����
		for(String s : strArr) {
			System.out.println(s);
		}
		
		StringTokenizer st2 = new StringTokenizer(str2, ",-* #");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}	
	}
	
}
