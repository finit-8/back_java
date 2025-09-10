package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 7778);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 			// 스트림은 사람이 읽을 수 없는 바이트단위의 데이터더미라서 
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));			// 스트림을 문자로 바꾸기 위해서 StreamReader/Writer를 쓴다.
																								// 그리고 데이터가 발생할 때 마다 계속 네트워크랑 디스크 왔다갔다 하기 비효율적이라 버퍼드메서드로 버퍼메모리에 쌓아놧다가 한 번에 보냄.

			
			
			while(true) {
				System.out.println("클라이언트에서 서버로 데이터 보내기 >>");
				String outMessage = sc.nextLine();
				
				out.write(outMessage + "\n");		// 서버쪽의 readLine()은 \n과 같은 개행문자를 만날 때 까지 읽는다. 그래서 \n이 없으면 무한루프에 빠져서 서버가 입력할 수 없는 무한대기상태에 빠져서 입력을 못함.  
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버>>" + inMessage);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) {
					socket.close();
				}
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
				if(sc != null) {
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
