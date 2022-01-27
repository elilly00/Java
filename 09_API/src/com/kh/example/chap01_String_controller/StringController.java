package com.kh.example.chap01_String_controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		// String test
		String str1 = "java";	// 값 집어넣는 법
		String str2 = "java";	// 방법 1 . 직접 값 집어넣기	
		String str3 = new String("java");	// 방법 2. new 연산자 사용해서 값 집어넣기
		
		System.out.println("str1 : " + str1);	// 주소값이 출력되지 않고 데이터가 출력됨 -> why? toString()이 오버라이딩 되어있기 때문
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		boolean bool1 = str1 == str2;	// 문자열에서의 ==비교는 주소 값 비교   	// 문자열의 값을 출력 하고 싶다면 .equals를 사용
		boolean bool2 = str1 == str3;	
		System.out.println("str1과 str2의 주소는 같은가? : " + bool1);
		System.out.println("str1과 str3의 주소는 같은가? :" + bool2);		// new 연산자를 통해 새로운 공간이 만들어졌기 때문에 str3의 주소값이 다름
		
		System.out.println("str1의 hashCode : " + str1.hashCode());		// hashcode()는 주소값을 가짐 -> 주소값이 출력 됨
		System.out.println("str2의 hashCode : " + str2.hashCode());		// hashcode는 내용(값)이 같다면 hashcode도 같게 만들어야 함
		System.out.println("str3의 hashCode : " + str3.hashCode());		// 그래서 str3의 실주소값은 다르지만 값이 같기때문에 hashcode를 사용하면 주소값이 같게 출력 됨
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		
		System.out.println();
		
		str1 += "API";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		System.out.println("str1의 hashCode : " + str1.hashCode());		// API라는 값이 더해졌기 때문에 내용이 달라짐 -> hashcode 주소값이 다르게 출력됨
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
	}
	
	public void method2() {
		// StringBuffer/StringBuilder test
		// 어떤 문자열을 작업할 때, 계속해서 문자열을 변경해야 할 경우 String클래스의 '불변'이라는 특징 상
		// 값이 새로 생기고 참조 위치만 바꿔주기 때문에 가비지컬렉터가 계속 지워야하는 단점이 있음
		// String클래스의 경우는 변경이 적고 읽기만 많은 경우에 더 적합 함
		// 변경이 많은 경우가 많은 경우 StringBuffer나 StringBuilder를 이용하는 것이 더 적합 함
		// 변경/저장을 위한 메모리 공간(버퍼 = 임시공간)을 내부에 지니는데 초기에는 16개의 공간이 생기고 그 이후 자동으로 증가 함
		// 두 클래스의 차이는 동기화가 되느냐 안되느냐의 차이
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어가있는 실제 값의 길이 : " + buffer1.length()); 	
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());		// 100을 집어 넣었기 때문에 100이 출력 됨
		System.out.println("buffer2에 들어가있는 실제 값의 길이 : " + buffer2.length()); 	
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());		// 초기 수용량인 16개에 abc가 들어가서 수용량이 19가 됨
		System.out.println("buffer3에 들어가있는 실제 값의 길이 : " + buffer3.length()); 	
		
		System.out.println();
		
		System.out.println("buffer3의 실주소값 : " + System.identityHashCode(buffer3));
		// append(String str):StringBuffer	
		// 맨 뒤에 str을 추가하는 메소드
//		buffer3.append("abc");
//		System.out.println("abc 추가 후의 buffer3 : " + buffer3);
//		System.out.println("abc 추가 후의 buffer3 용량 : " + buffer3.capacity());		
//		System.out.println("abc 추가 후의 buffer3 길이 : " + buffer3.length());
//		
//		System.out.println();
//		
//		buffer3.append("def");
//		System.out.println("def 추가 후의 buffer3 : " + buffer3);
//		System.out.println("def 추가 후의 buffer3 용량 : " + buffer3.capacity());		
//		System.out.println("def 추가 후의 buffer3 길이 : " + buffer3.length());
		// 		↓  (메소드 체이닝 사용)
		buffer3.append("abc").append("def");	// 메소드 체이닝
//		------	-------------
//		ㄴ StringBuffer  ㄴStringBuffer.append(Stirng str):StirngBuffer
		System.out.println("abc, def 추가 후의 buffer3 : " + buffer3);
		System.out.println("abc, def 추가 후의 buffer3 용량 : " + buffer3.capacity());		
		System.out.println("abc, def 추가 후의 buffer3 길이 : " + buffer3.length());
		System.out.println("buffer3의 실주소값 : " + System.identityHashCode(buffer3));		// 위의 실주소값과 같음 -> 값이 수정 됨을 알 수 있음
		
		System.out.println();
		
		// insert(int offset, String str):StringBuffer
		// 원하는 위치에 str을 추가하는 메소드
		buffer3.insert(2, "zzz");
		System.out.println("인덱스 2에 zzz추가 후의 buffer3 : " + buffer3);
	
		// delete(int start, int end):StringBuffer
		// start <= indec < end  // end는 포함 안되기 때문에 end 전까지 삭제 됨
		buffer3.delete(2, 5);
		System.out.println("인덱스 2부터 인덱스5까지 삭제 후의 buffer3 : " + buffer3);
		
		System.out.println();
		
		// reverse():StringBuffer
		// 거꾸로 출력하는 메소드
		buffer3.reverse();
		System.out.println("reverse 후의 buffer3 : " + buffer3);
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2,  "yy").reverse().delete(1, 3);
		System.out.println(sb);
	}
	
	public void method3() {
		String str = "Hello World";
		
		// charAt(int index):char
		// String의 indext번째의 char 반환
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// concat(String str):String
		// 본래 값 뒤에 str을 추가해주는 메소드
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		
		str += "!!!";
		System.out.println(str);
		
		// equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		
		// substring(int beginIndex):String
		// String의 일부 반환 
		// Stinrg의 indext번째부터 반환
		// sunString(int beginIndex, int endIndex):String
		// String의 index번째부터 index번째 전까지 반환   
		// => 많이 쓰임
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("Str.substring(0, 4) : " + str.substring(0, 4));
		
		// replace(char oldChar, char newCahr):String
		// oldChar를 newChar로 대체한 문자열 반환
		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));
		
		
		// toUpperCase() / toLowerCAse():String
		// 모두 대문자/ 소문자로 바꿔 반환
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("더 하시겠습니가?(y/n) : ");
		String answerStr = sc.nextLine().toLowerCase();		// 원래는 대문자 Y/N을 쓰면 실행 되지 않았지만  toLowerCase()를 사용하면 대문자를 써도 소문자로 인식하기 때문에 실행 됨
		char answer = answerStr.charAt(0);
		if(answer == 'y') {
			System.out.println("계속 한답니다.");
		} else if(answer == 'n') {
			System.out.println("그만 한답니다.");
		}
		
		// equalsIgnoreCase():boolean
		// 대소문자를 가리지 않고 문자열 비교
		String str2 = "WONDERFUL";
		String str3 = "wonderful";
		System.out.println(str2.equals(str3));				// 대소문자가 다르기 때무에 false가 나옴
		System.out.println(str2.equalsIgnoreCase(str3));	// 대소문자 가리지 않고 문자열로만 비교해서 true가 나옴	
		
		// Trim():String
		// 앞/뒤에 있는 빈 공간을 제거한 문자열 반환		=> 엄청 많이 쓰임
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "  Java   ";
		String str7 = "Ja     va";
		System.out.println(str4 + " : " + str4.trim());
		System.out.println(str5 + " : " + str5.trim());
		System.out.println(str6 + " : " + str6.trim());
		System.out.println(str7 + " : " + str7.trim());		// 문자열로 인식하기 때문에 사시에 띄워진 빈칸은 제거가 안됨
		
		// split(String str) : String[]
		// 문자열을 분리해주는 메소드 
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] strArr = splitStr.split(", ");
		System.out.println(strArr);		// strArr의 주소값 출력
		
		// 일반 for문
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// 향상된 for문 = for-each문  => 몰라도 됨
		for(String s : strArr) {	// atrArr안에 있는 인자들을 하나 꺼내서 임시로 s에 담고
			System.out.println(s);	// s를 찍고 그 다음 값을 꺼내서 s에 담고 s를 찍고 ~ 다 할때까지 반복
		}
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer st = new StringTokenizer(str, ", ");	// ", " 를 자르고 출력할게~
		System.out.println("분리된 문자열 개수 : " + st.countTokens());
		// haseMoreTokens():boolean
		// 다음 토큰(분리된 문자열) 값이 있다면 true 반환
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			// nextToken():String
			// 해당하는 다음 값 반환
		}
		System.out.println();
		
		String str2 = "Apple,banana-Cream*Dessert#Egg Fruits";
		String[] strArr = str2.split(",-*# ");
//		String[] strArr = str2.split(",|-|*|#| ");	// 정규표현식
		for(String s : strArr) {
			System.out.println(s);
		}
		
		StringTokenizer st2 = new StringTokenizer(str2, ",-* #");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}	
	}
	
}
