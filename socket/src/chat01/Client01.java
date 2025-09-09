package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
		// 포트번호는 1100
		// IP는 192.168.161.25
		
		Socket sk = null;
		PrintWriter writer = null;
		
		String serverIp = "192.168.161.25";
		String message = null;
		
		try {
			sk = new Socket(serverIp, 1100);
			System.out.println("서버가 연결되었습니다.");
			
			writer = new PrintWriter(sk.getOutputStream(), true);
			
			message = "안녕! 나는 최준서야. 나에게 무서운 건 없지!";
			writer.println(message);
			System.out.println("서버로 [" + message + "]를 전송했씁니다.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) {
					writer.close();
				}
				if(sk != null) {
					sk.close();
				}
			} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
}
