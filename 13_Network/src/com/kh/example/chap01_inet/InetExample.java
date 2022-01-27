package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {

	public static void main(String[] args) {
//		InetAddress.getLocalHost();		// getLocalHoset()는 static 메소드 :  (클래스이름.~~()해서 들어감)	
		try {
			InetAddress localIP = InetAddress.getLocalHost();	// getLocalHost() : 지역 호스트(네트워크에 연결되어있는 컴퓨터)의 Host명과 IP주소 반환
			System.out.println("localIP : " + localIP);
			System.out.println("내 PC명 : " +  localIP.getHostName());	// getHostName() : 호스트 이름 반환
			System.out.println("내 IP : " + localIP.getHostAddress());	// getHostAddress() : 호스트 IP주소 반환
		
			byte[] ipAddress = localIP.getAddress(); 	// IP주소를 byte배열로 반환	// byte의 범위에 넘은 숫자는 마이너스 숫자로 돌아가서 수를 셈(이런식으로 ㄱㅖ속 순환함) (범위를 넘어간 것 : 오버플로우)
			for(byte b:ipAddress) {	// 향상된 for문
				System.out.print(b + " ");
			}
			
			System.out.println();
			System.out.println();
			
			InetAddress iei = InetAddress.getByName("www.iei.or.kr");	// getByName() : 도메인을 통해 IP주소를 얻음	(도메인 : 사이트 주소)
			System.out.println("iei 서버 명 : " + iei.getHostName());
			System.out.println("iei 서버 ip : " + iei.getHostAddress());
			
			System.out.println();
			
			InetAddress google1 = InetAddress.getByName("www.google.com");
			System.out.println("google1 서버 명 : " + google1.getHostName());
			System.out.println("google1  서버 ip : " + google1 .getHostAddress());
			
			System.out.println();
			
			InetAddress[] google = InetAddress.getAllByName("www.google.com");	// 서버가 큰 것은 getAllByName(String host) : 호스트의 모든 IP주소를 배열에 담아 반환 
			System.out.println("구글 IP 개수 : " + google.length);
			for(InetAddress ip : google) {
				System.out.println(ip.getHostAddress());
			}
			System.out.println();
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP개수 : " + naver.length);
			for(InetAddress ip : naver) {
				System.out.println(ip);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		}
		
	}

}
