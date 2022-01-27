package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;
// 여러 기준으로 정렬 하고 싶을 떄 사용
public class StudentComparator implements Comparator<Student> {	// 제네릭 해주기

	@Override
	public int compare(Student o1, Student o2) {
		// 1. 비교 주체 : o1
//		int standard = o1.getScore();	//1.  score 비교해서 정렬하기
		Integer standard = o1.getScore();	// 2. wrapper클래스로 받아서 정렬하기 (객체가 아니기때문에 int는 사용 x)
		// 2. 비교 대상 : o2
//		int object = o2.getScore();
		Integer object = o2.getScore();
		
		// 점수 <오름차순>
		// 비교 주체가 비교 대상보다 크면 1
		// 비교 주체가 비교 대상과 같으면 0
		// 비교 주체가 비교 대상보다 작으면 -1 반환
//		1. 
//		if(standard > object) {		
//			return 1;
//		} else if(standard == object) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		// 점수 <내립차순>
//		if(standard > object) {		
//			return -1;
//		} else if(standard == object) {
//			return 0;
//		} else {
//			return 1;
//		}
		
//		return standard.compareTo(object);	// 2. wrapper클래스를 이용해 점수 정렬(오름차순)
//		return -standard.compareTo(object);	// (내림차순)
		
		// 같은 점수인 사람들 끼리 이름으로 오름차순 하고 싶다면? -> 이름에 대한 정렬을 추가 함
		int result =  -standard.compareTo(object);	// 점수 내림차순
		String standardName = o1.getName();		// 비교 주체 이름
		String objectName = o2.getName();	// 비교 대상 이름
		
		if(result == 0) {	// 점수가 같다면
			return standardName.compareTo(objectName);	// 이름을 오롬차순으로 정렬
		} else {
			return result;
		}
	}
	
//	@Override
//	public int compare(Object o1, Object o2) {
//		return 0;
//	}
	
	
}
