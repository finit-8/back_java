package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(7778);
			System.out.println("서버가 시작되었습니다. 연결 대기중...");
			
			socket = serverSocket.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 			// 스트림은 사람이 읽을 수 없는 바이트단위의 데이터더미라서 
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));			// 스트림을 문자로 바꾸기 위해서 StreamReader/Writer를 쓴다.
																								// 그리고 데이터가 발생할 때 마다 계속 네트워크랑 디스크 왔다갔다 하기 비효율적이라 버퍼드메서드로 버퍼메모리에 쌓아놧다가 한 번에 보냄.
			
			while(true) {
				String inMessage = in.readLine();
				System.out.println("클라이언트 > " + inMessage);
				
				System.out.println("서버에서 클라이언트로 메시지 전송 >>");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");		// 클라이언트쪽의 readLine()은 \n과 같은 개행문자를 만날 때 까지 읽는다. 그래서 \n가 없으면 무한루프 상태로 들어가서 클라이언트쪽에서 무한대기상태에 빠져서 입력을 못함.
				out.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
