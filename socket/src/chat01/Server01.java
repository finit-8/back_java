package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
		// 서버소켓
		ServerSocket ss = null;
		
		// 클라이언트 소켓
		Socket sk = null;
		
		// 사용자의 입력스트림 값을 읽기 위한 버퍼드리더
		BufferedReader br = null;
		
		String message = null;
		
		try {
			ss = new ServerSocket(1100);
			System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");
			
			sk = ss.accept();								// accept()가 잡아서 바인딩 해줌(묶어줌)
			System.out.println("클라이언트가 연결되었습니다.");
			
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			
			message = br.readLine();
			System.out.println("클라이언트로부터 받은 메시지");
			System.out.println(message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {						// 오류가 발생해도 무조건 닫아주기 위한 finally
			try {
				if(ss != null) {
					ss.close();
				}
				if(sk != null) {
					sk.close();
				}
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
