package com.kh.example.chap06_method.medel.vo;

public class Trainee {
	// - name:String
	// - ACADEMY:String = "KH"
	// - classRoom:char
	// - time:String
	// - score:double	
	// ---------------	(���ھ ����)
	
	// + Trainee()		// ������
	// + Trainee(name:String, classRoom:char, time:String, score:double)	// ������
	
	private String name;
	private final String ACADEMY = "KH";	// ��� ����� ���ÿ� �ʱ�ȭ
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee() {}	// �⺻ ������
	public Trainee(String name, char classRoom, String time, double score) {	// �Ű����� ������  : �ʵ� �ʱ�ȭ
		this.name = name;
		// ACADEMY�� ���� ���� ����? ACADEMY�� final����(=���)�̱� ������ �� ���� x
		//							�����ڿ��� ���ο� ������ �ʱ�ȭ�� �Ұ��� �ϱ� ������ ���ܵ�
		this.classRoom = classRoom;
		this.time = time;
//		this.score = score;		// The static field Trainee.score should be accessed in a static way : ��ü�� �����ؼ� static������ ������ �� �̷��� ��� �޼����� ��
		Trainee.score = score;
		// this.score�� ��� �޼����� �ߴ� ����? this�� �ڽ��� �ּ� ���� ���� �ִ� ���۷��� ����(=��������)
		// 									�ּ� ���� ���� �ٴ� ���� heap�޸� ������ ������ �����. ��, ��ü�� ����ٴ� ��
		//									�ٽ� ����, this�� ���� �ϴ� ���� ��ü�� ����� �����ϴ� �Ͱ� ����
		//									static ����/�޼ҵ�� ��ü�� ����� �����ϴ°� �ƴ϶� Ŭ���� ��. ���� �����ؾ��ϱ� ������ ��� �޼����� ��
		
	}	
	
	public String inform() {
		return ACADEMY + " " + name + " �Ʒû���" 
				+ classRoom + time + "���̰�, ������" 
				+ score + "���Դϴ�.";
	}
	
	// ���ݱ����� �ʵ忡 �ִ� ���� �ʱ�ȭ �ϰ� ������ �Ű����� �ִ� �����ڸ� �̿��Ͽ���
	// �Ű����� �ִ� �����ڸ� �̿��Ͽ� ���� �� �ִ� ä�� ��ü�� ������µ�
	// ������ ���� �߸� ���� ���, ��� �����͸� ������ ���ΰ�?
	// -> �ʵ� �ϳ����� ���� �ִ� ��ü�� ����� ���� ������?
	// �Ϻ� �ʵ常 ������(��)�� ��ȸ�ϰ� ������ ��F�� �� ���ΰ�?
	
	//name�� ���� setter, getter
	public void setName(String name) {
		this.name = name;	
	}
	public String getName() {
		return name;
	}
	
	// ACADEMY�� ����  getter	
	// ����� ���� ���� �� �� ���� ������ ���� �����ϴ� setter�� ���x
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// classRoom�� ���� setter, getter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
		
	}
	public char getClassRoom() {
		return classRoom;
	}
	
	// time�� ���� setter, getter
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
	
	// score�� ���� setter, getter
	public static void setScore(double score) {
//		this.score = score; --> X
		Trainee.score = score;
	}
	public static double getScore() { 
		return score;
	}
	
	
	
}
