package chat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server03 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>());

        try {
            serverSocket = new ServerSocket(7779);
            System.out.println("[서버 실행: 클라이언트 대기중...]");

            // 서버에서 입력을 처리하는 스레드
            ServerInputThread serverInputThread = new ServerInputThread(outputList);
            serverInputThread.start();

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("[접속: " + clientSocket + "]");
                ServerThread serverThread = new ServerThread(clientSocket, outputList);
                serverThread.start();
            }

        } catch (IOException e) {
            System.err.println("서버 소켓 생성 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                    System.out.println("서버 소켓이 닫혔습니다.");
                } catch (IOException e) {
                    System.err.println("서버 소켓을 닫는 중 오류 발생: " + e.getMessage());
                }
            }
        }
    }
}

// 서버에서 직접 메시지를 입력받아 클라이언트에 전송하는 스레드
class ServerInputThread extends Thread {
    private final List<PrintWriter> outputList;

    public ServerInputThread(List<PrintWriter> outputList) {
        this.outputList = outputList;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String message;
            while ((message = bufferedReader.readLine()) != null) {
                System.out.println("서버: " + message);
                synchronized (outputList) {
                    for (PrintWriter out : outputList) {
                        out.println("서버: " + message);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("서버 입력 처리 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class ServerThread extends Thread {

    private final Socket socket;
    private final List<PrintWriter> outputList;
    private PrintWriter output;
    private BufferedReader input;

    public ServerThread(Socket socket, List<PrintWriter> outputList) {
        this.socket = socket;
        this.outputList = outputList;

        try {
            output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            synchronized (outputList) {
                outputList.add(output);
            }

        } catch (IOException e) {
            System.err.println("스트림 초기화 중 오류 발생: " + e.getMessage());
            closeResources();
        }
    }

    @Override
    public void run() {
        String line;
        try {
            while ((line = input.readLine()) != null) {
                // 서버 콘솔에 수신한 메시지 출력
                System.out.println(line);

                // 모든 클라이언트에게 메시지 전송
                synchronized (outputList) {
                    for (PrintWriter out : outputList) {
                        out.println(line);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("메시지 수신 중 오류 발생: " + e.getMessage());
        } finally {
            closeResources();
        }
    }

    private void closeResources() {
        try {
            synchronized (outputList) {
                outputList.remove(output);
            }

            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }

        } catch (IOException e) {
            System.err.println("자원 해제 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
