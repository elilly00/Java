package com.kh.example.chap02_tcp.sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
// TCP(transmission Control Protocol)
//		서버와 클라이언트 간의  1:1 소켓 통신(연결 지향적 프로토콜)
//		데이터 전송 전 먼저 서버와 클라이언트가 연결되어 있어야 함
//			=> 서버와 클라이언트를 따로 구현하고 서버가 먼저 실행되어 클라이너트의 요청을  기다림

//	ServerSocket
//		포트와 연결되어 외부의 요청을 기다리다 요청이 들어오면 수락 후 Socket을 생성해 소켓과 소켓간의 통신이 이루어지게 함
//		한 포트에 한 ServerSocket만 연결 가능

//	Socket
//		프로세스 간 통신 담당
//		InputStream/OutputStream 보유 : 이 스트림으로 포로세스간의 통시이 이루어짐

	public void serverStart() {
		// 서버용 TCP 소켓 프로그래밍 순서
		// 1. 서버 포트번호 정하기
		// 2. 서버용 소켓 객체 생성 후 포트와 결합
		// 3. 클라이언트 쪽에서 요청이 오길 기다림
		// 4. 요청이 오면 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		// 5. 연결된 클라이언트와 입출력 스트림 새엇ㅇ
		// 6. 보조스트림을 통해 성능 개선
		// 7. 스트림을 통해 읽고 쓰기
		// 8. 통신 종료
		
		
		// 1. 서버 포트번호 정하기 : 0~65535(1023 이하는 이미 사용중인 포트가 많아 그 이상인 숫자 사용 권장. 웬만하는 5000대 숫자를 많이 쓰고 10000을 넘지 않음)
		int port = 8500;
		
		// 2. 서버용 소켓 객체(ServerSocket) 생성 후 포트와 결합
		try {
//			ServerSocket server = new ServerSocket();	// 소켓 객체 생성
			ServerSocket server = new ServerSocket(port);	// 포트와 결합
		
		// 3. 클라이언트 쪽에서 요청이 오길 기다림
		System.out.println("클라이언트의 요청을 기다리고 있습니다...");
		// 기다리는 걸 코드로 표현은 못하기 때문에 글로 적어봄
		
		// 4. 요청이 오면 수락 후 해당 클라이언트에 대한 소켓 객체(Socket) 생성	
		Socket client = server.accept();	// accept() 반환값 : Socket -> 수락 후 클라이언트에 반환되고 소켓 객체를 생성함
		// accept에서 반환되는 Socket이 client에 대한 Socket객체를 생성
		
		String clientIP = client.getInetAddress().getHostAddress();		
		// Server의 IP와 client의 IP는 같다 -> why? 현재는 같은 컴퓨터로 코드를 짜고있기 때문
		// 원래라면 client는 다른 사용자의 컴퓨터로 연결하기 때문에 서로 IP가 다름
		System.out.println(clientIP + "가 연결을 요청함...");
		
		// 5. 연결된 클라이언트와 입출력 스트림 생성
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		// 6. 보조스트림을 통해 성능 개선
		// byte단위를 String단위로 바꾸기
		InputStreamReader isr = new InputStreamReader(in);	// 기반 스트림 in을 넣음
		BufferedReader br = new BufferedReader(isr);	
		PrintWriter pw = new PrintWriter(out);	// out을 출력하기 위해 writer 사용
		
		// 7. 스트림을 통해 읽고 쓰기
		String message = br.readLine();
		System.out.println(clientIP + "가보낸 메세지 : " + message);
		
		// 서버 -> 클라이언트로 메세지 전송
		pw.println("만나서 반갑습니다.");
		pw.flush(); 	// flush() : Buffer를 깨끗하게 비워줌
		
		
		// 8. 통신 종료
		pw.close();
		br.close();
		server.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
