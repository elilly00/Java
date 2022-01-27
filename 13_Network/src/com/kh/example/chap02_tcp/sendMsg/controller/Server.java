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
//		������ Ŭ���̾�Ʈ ����  1:1 ���� ���(���� ������ ��������)
//		������ ���� �� ���� ������ Ŭ���̾�Ʈ�� ����Ǿ� �־�� ��
//			=> ������ Ŭ���̾�Ʈ�� ���� �����ϰ� ������ ���� ����Ǿ� Ŭ���̳�Ʈ�� ��û��  ��ٸ�

//	ServerSocket
//		��Ʈ�� ����Ǿ� �ܺ��� ��û�� ��ٸ��� ��û�� ������ ���� �� Socket�� ������ ���ϰ� ���ϰ��� ����� �̷������ ��
//		�� ��Ʈ�� �� ServerSocket�� ���� ����

//	Socket
//		���μ��� �� ��� ���
//		InputStream/OutputStream ���� : �� ��Ʈ������ ���μ������� ����� �̷����

	public void serverStart() {
		// ������ TCP ���� ���α׷��� ����
		// 1. ���� ��Ʈ��ȣ ���ϱ�
		// 2. ������ ���� ��ü ���� �� ��Ʈ�� ����
		// 3. Ŭ���̾�Ʈ �ʿ��� ��û�� ���� ��ٸ�
		// 4. ��û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
		// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ������
		// 6. ������Ʈ���� ���� ���� ����
		// 7. ��Ʈ���� ���� �а� ����
		// 8. ��� ����
		
		
		// 1. ���� ��Ʈ��ȣ ���ϱ� : 0~65535(1023 ���ϴ� �̹� ������� ��Ʈ�� ���� �� �̻��� ���� ��� ����. �����ϴ� 5000�� ���ڸ� ���� ���� 10000�� ���� ����)
		int port = 8500;
		
		// 2. ������ ���� ��ü(ServerSocket) ���� �� ��Ʈ�� ����
		try {
//			ServerSocket server = new ServerSocket();	// ���� ��ü ����
			ServerSocket server = new ServerSocket(port);	// ��Ʈ�� ����
		
		// 3. Ŭ���̾�Ʈ �ʿ��� ��û�� ���� ��ٸ�
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�...");
		// ��ٸ��� �� �ڵ�� ǥ���� ���ϱ� ������ �۷� ���
		
		// 4. ��û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü(Socket) ����	
		Socket client = server.accept();	// accept() ��ȯ�� : Socket -> ���� �� Ŭ���̾�Ʈ�� ��ȯ�ǰ� ���� ��ü�� ������
		// accept���� ��ȯ�Ǵ� Socket�� client�� ���� Socket��ü�� ����
		
		String clientIP = client.getInetAddress().getHostAddress();		
		// Server�� IP�� client�� IP�� ���� -> why? ����� ���� ��ǻ�ͷ� �ڵ带 ¥���ֱ� ����
		// ������� client�� �ٸ� ������� ��ǻ�ͷ� �����ϱ� ������ ���� IP�� �ٸ�
		System.out.println(clientIP + "�� ������ ��û��...");
		
		// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		// 6. ������Ʈ���� ���� ���� ����
		// byte������ String������ �ٲٱ�
		InputStreamReader isr = new InputStreamReader(in);	// ��� ��Ʈ�� in�� ����
		BufferedReader br = new BufferedReader(isr);	
		PrintWriter pw = new PrintWriter(out);	// out�� ����ϱ� ���� writer ���
		
		// 7. ��Ʈ���� ���� �а� ����
		String message = br.readLine();
		System.out.println(clientIP + "������ �޼��� : " + message);
		
		// ���� -> Ŭ���̾�Ʈ�� �޼��� ����
		pw.println("������ �ݰ����ϴ�.");
		pw.flush(); 	// flush() : Buffer�� �����ϰ� �����
		
		
		// 8. ��� ����
		pw.close();
		br.close();
		server.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
