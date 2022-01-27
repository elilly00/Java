package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today);	
		System.out.println(today.getTime()); 	
		// Fri Aug 27 12:33:19 KST 2021
		// 1630035199381	-> 현재 내 시간의 million seconds 값 // double 값
		
		Date time = new Date( 1630035199381L);
		System.out.println(time);
	
		Date date = new Date(2022, 1, 25);  //  deprecated라서 Date에 줄이 그어짐(쓰지말라고 알려줌)
	}
	
	public void method2() {
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH)+1;	// 날짜 관련 클래스에서 달(월)은 0부터 시잘 : 1월 = 0, 2월 = 1, ... 12월 = 11  
		System.out.println(month);				// 그래서 제대로 된 숫자로 뜨게 하고싶으면  +1 한다
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM);
		int amPm2 = c.get(Calendar.AM);
		System.out.println(amPm2);
		System.out.println(amPm);
		System.out.println(amPm == 1? "오후" : "오전");
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
		int day = c.get(Calendar.DAY_OF_WEEK); // 요일 : 일요일 = 1, 월요일 =2, 화요일 =3, .. 토요일 = 7
		System.out.println(day);
	}
	public void method3() {
		int year = 2022;
//		int month = 1;		// 월은 0부터 시작해서 1월이 출력 되길 원하면 0으로 입력함
		int month = 0;
		int date = 25;
		int hour = 17;
		int min = 50;
		int sec = 0;
		// 우리반 종강일
		
		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		long  time = gc.getTimeInMillis();
		Date endDay = new Date(time);	// Date에 넣게 되면 그 당시의 시간을 알 수 있다.
		System.out.println(endDay);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String end = sdf.format(endDay);
		System.out.println(end);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH시 mm분 ss초");		// 시간에 HH를 사용하면 24시 기준으로 나옴
		String end2 = sdf2.format(endDay);
		System.out.println(end2);
	}
	
}