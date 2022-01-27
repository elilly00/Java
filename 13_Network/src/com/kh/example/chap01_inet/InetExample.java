package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {

	public static void main(String[] args) {
//		InetAddress.getLocalHost();		// getLocalHoset()�� static �޼ҵ� :  (Ŭ�����̸�.~~()�ؼ� ��)	
		try {
			InetAddress localIP = InetAddress.getLocalHost();	// getLocalHost() : ���� ȣ��Ʈ(��Ʈ��ũ�� ����Ǿ��ִ� ��ǻ��)�� Host��� IP�ּ� ��ȯ
			System.out.println("localIP : " + localIP);
			System.out.println("�� PC�� : " +  localIP.getHostName());	// getHostName() : ȣ��Ʈ �̸� ��ȯ
			System.out.println("�� IP : " + localIP.getHostAddress());	// getHostAddress() : ȣ��Ʈ IP�ּ� ��ȯ
		
			byte[] ipAddress = localIP.getAddress(); 	// IP�ּҸ� byte�迭�� ��ȯ	// byte�� ������ ���� ���ڴ� ���̳ʽ� ���ڷ� ���ư��� ���� ��(�̷������� ���Ƽ� ��ȯ��) (������ �Ѿ �� : �����÷ο�)
			for(byte b:ipAddress) {	// ���� for��
				System.out.print(b + " ");
			}
			
			System.out.println();
			System.out.println();
			
			InetAddress iei = InetAddress.getByName("www.iei.or.kr");	// getByName() : �������� ���� IP�ּҸ� ����	(������ : ����Ʈ �ּ�)
			System.out.println("iei ���� �� : " + iei.getHostName());
			System.out.println("iei ���� ip : " + iei.getHostAddress());
			
			System.out.println();
			
			InetAddress google1 = InetAddress.getByName("www.google.com");
			System.out.println("google1 ���� �� : " + google1.getHostName());
			System.out.println("google1  ���� ip : " + google1 .getHostAddress());
			
			System.out.println();
			
			InetAddress[] google = InetAddress.getAllByName("www.google.com");	// ������ ū ���� getAllByName(String host) : ȣ��Ʈ�� ��� IP�ּҸ� �迭�� ��� ��ȯ 
			System.out.println("���� IP ���� : " + google.length);
			for(InetAddress ip : google) {
				System.out.println(ip.getHostAddress());
			}
			System.out.println();
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� IP���� : " + naver.length);
			for(InetAddress ip : naver) {
				System.out.println(ip);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		}
		
	}

}
