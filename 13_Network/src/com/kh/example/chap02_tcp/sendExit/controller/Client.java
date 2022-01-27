package com.kh.example.chap02_tcp.sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		// Ŭ���̾�Ʈ�� TCP ���� ���α׷��� ����
		// 1. ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ��ü ����
		// 2. �������� ����� ��Ʈ�� ����
		// 3. ���� ��Ʈ������ ���� ����
		// 4. ��Ʈ���� ���� �а� ����
		// 5. ��� ����
		int port = 6666;
		String serverIP;
		// 1. ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ��ü ����
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
//			int port = 6666;
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) {
				// 2. �������� ����� ��Ʈ�� ����
				// 3. ���� ��Ʈ������ ���� ����
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				// 4. ��Ʈ���� ���� �а� ����	// ������ �а� ���� ���� while�� ����
				Scanner sc = new Scanner(System.in);
//				System.out.println("��ȭ �Է� : ");
//				String message = sc.nextLine();
//				pw.println(message);
//				pw.flush();
//				
//				String receiveMessage = br.readLine();
//				System.out.println(receiveMessage);
				
				do {
					System.out.print("��ȭ �Է� : ");
					String message = sc.nextLine();
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						break;
					}
			
					String receiveMessage = br.readLine();
					System.out.println(receiveMessage);
				} while(true);
				
				// 5. ��� ����
				br.close();
				pw.close();
				socket.close();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}