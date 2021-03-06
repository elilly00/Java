package com.kh.example.chap06_method.medel.vo;

public class Trainee {
	// - name:String
	// - ACADEMY:String = "KH"
	// - classRoom:char
	// - time:String
	// - score:double	
	// ---------------	(스코어에 밑줄)
	
	// + Trainee()		// 생성자
	// + Trainee(name:String, classRoom:char, time:String, score:double)	// 생성자
	
	private String name;
	private final String ACADEMY = "KH";	// 상수 선언과 동시에 초기화
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee() {}	// 기본 생성자
	public Trainee(String name, char classRoom, String time, double score) {	// 매개변수 생성자  : 필드 초기화
		this.name = name;
		// ACADEMY가 들어가지 않은 이유? ACADEMY는 final변수(=상수)이기 때문에 값 변경 x
		//							생성자에서 새로운 값으로 초기화가 불가능 하기 때문에 제외됨
		this.classRoom = classRoom;
		this.time = time;
//		this.score = score;		// The static field Trainee.score should be accessed in a static way : 객체를 생성해서 static변수에 접근할 때 이러한 경고성 메세지가 뜸
		Trainee.score = score;
		// this.score에 경고성 메세지가 뜨는 이유? this는 자신의 주소 값을 갖고 있는 레퍼런스 변수(=참조변수)
		// 									주소 값을 갖는 다는 말은 heap메모리 영역에 공간이 생겼다. 즉, 객체가 생겼다는 말
		//									다시 말해, this로 접근 하는 것은 객체를 만들어 접근하는 것과 같음
		//									static 변수/메소드는 객체를 만들어 접근하는게 아니라 클래스 명. 으로 접근해야하기 때문에 경고성 메세지가 뜸
		
	}	
	
	public String inform() {
		return ACADEMY + " " + name + " 훈련생은" 
				+ classRoom + time + "반이고, 점수는" 
				+ score + "점입니다.";
	}
	
	// 지금까지는 필드에 있는 값을 초기화 하고 싶으면 매개변수 있는 생성자를 이용하였음
	// 매개변수 있는 생성자를 이용하여 값이 들어가 있는 채로 객체를 만들었는데
	// 데이터 값이 잘못 됏을 경우, 어떻게 데이터를 수정할 것인가?
	// -> 필드 하나씩만 갖고 있는 객체를 만들면 되지 않을까?
	// 일부 필드만 데이터(값)을 조회하고 싶으면 어덯게 할 것인가?
	
	//name에 대한 setter, getter
	public void setName(String name) {
		this.name = name;	
	}
	public String getName() {
		return name;
	}
	
	// ACADEMY에 대한  getter	
	// 상수는 값을 변경 할 수 없기 때문에 값을 변경하는 setter는 사용x
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// classRoom에 대한 setter, getter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
		
	}
	public char getClassRoom() {
		return classRoom;
	}
	
	// time에 대한 setter, getter
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
	
	// score에 대한 setter, getter
	public static void setScore(double score) {
//		this.score = score; --> X
		Trainee.score = score;
	}
	public static double getScore() { 
		return score;
	}
	
	
	
}
