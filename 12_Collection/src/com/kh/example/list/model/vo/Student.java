package com.kh.example.list.model.vo;

//public class Student {
//public class Student implements Comparable {	// implements : 인터페이스 상속받음(인터페이스 안에는 상수형 필드, 추상 메소드가 들어감) // 추상 메소드 -> 깅제 오버라이딩 필요
	// The type Student must implement the inherited abstract method Comparable.compareTo(Object)
	// : 오버라이딩을 안했기  때문에 에러가 남 ,그래서  compareTo()메소드를 오버라이딩 해야 함. -> 그러면 Comparable에 노란색 줄이 뜸
	// Comparable is a raw type. References to generic type Comparable<T> should be parameterized
	// : Comparable에 제네릭을 명시해야 함
public class Student implements Comparable<Student> {	// 
	private String name;
	private int score;

	public Student() {
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "(" + score + "점)";
	}
	// 많은 이퀄즈 오버라이딩 방법 중 가장 평이한 방법임 // 너무 어렵다 싶으면 공부 안해도 됨(수업에선 여기에서만 사용하기 때문) // but, 실무에선 사용할 수도 있음
	
	@Override // 이퀄즈가 호출 됐음 (= Student에 대한 객체(나)가 하나 만들어짐) 
	public boolean equals(Object obj) { // Object obj는 나랑 비교할 대상
		// 1. 객체 측면 (객체 자체로서 존재하는 방법)
		if(this == obj) { // 만약 나(this)랑 같다면(주소값이 같다면) -> 주소값이 같음
			return true; // 그래서 true를 반환함
		}

		if(obj == null) { // 나랑 비교할 대상인 obj가 null이라면 -> 나와 다름
			return false; // 그래서 false를 반환함
		}

		if(getClass() != obj.getClass()) { // 내가 가지고 있는  정보와 obj가 가지고 있는 정보가 같지 않다면 -> 정보 다름
			// getClass() : 내 클래스에 대한 정보를 담아두는 메소드
			return false; // 그래서 false를 반환함
		}

		// 2. 필드(데이터) 측면	-> 필드에 있는 값들을 비교
		Student other = (Student)obj;	// (Student)obj : obj 자체를 Student로 형변환
		if(name == null) { // 나한테 있는 name이 null이고
			if(other.name != null) { // 나랑 비교할 other의 name이 null이 아니라면 -> 나와 같지 않음
				return false; // 그래서 false를 반환
			}
		} else if(!name.equals(other.name)) { // other에 있는 name이 내 name과 같지 않다면 -> 같지 않음
			// name자체는 String이기때문에 String안에 있는 equals 사용
			return false; // false를 반환함
		}	// name은 잠조형변수(Stirng)이기 때문에 equals를 사용해서 비교

		// score는 기본변수라서 비교연산자를 이용해서 비교
		if(score != other.score) { // other에 있는 score가 내 score와 같지 않다면
			return false;
		}
		return true;	// 위에 아무것도 걸리지 않는다면 같다고 봄
	}
	
	// haseCode 규약 : equals 메소드에 의해 true가 나오는 두 객체의 hashCode 값도 같아야 함
	// 그래서 위에 equals 메소드를 통해 true를 만들었기 때문에 hashCode도 오버라이딩 해줘야함
	@Override
	public int hashCode() {	
		final int PRIME = 31; // 31이란 숫자는 컴퓨터가 계산하기에 적당히 크면서 소수이기 때문에 많이 사용함
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result = PRIME * result + score;	// score는 참조변수가 아니기때문에 score 자체로 쓰면 됨

		return result;
	}

//	@Override		// 제네릭으로 타입릏 지정하지 않으면 매개변수로 Object가 들어감
//	public int compareTo(Object o) { // Object로 정렬하려면 형변환을 하면서 해야함 -> 제네릭을 지정하면 이러한 번거로운 과정을 안해도 됨
//		Student other = (Student)o;
//		String otherName = other.name;
//	
//		return name.comaprTo(otherName);
//	}

	@Override		// 제네릭으로 타입 제한 후 매개변수로 Student가 들어감
	public int compareTo(Student o) {
		// 이름(String)으로 오름차순	-> String는 이미 오름차순으로 자기들끼리 정렬기준이 세워져 있음
		
		// compareTo는 비교 주체(나)와 비교 대상(o)을 비교하는데
		// 비교 주체가 비교 대상과 같으면 0.
		// 비교 주체가 비교 대상보다 크면 1,
		// 비교 주체가 비교 대상보다 작으면 -1 반환
		
		return name.compareTo(o.name);	// 내가 가지고 있는 name을 비교 대상인 o에 있는 name과 비교함 (오름차순)
//		return -name.compareTo(o.name);	// -을 붙여서 내림 차순으로 비교
		
	}
}
