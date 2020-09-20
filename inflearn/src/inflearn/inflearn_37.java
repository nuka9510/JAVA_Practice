package inflearn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class inflearn_37 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ ���� �غ� �Ϸ�!!");
			
			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����!!");
			System.out.println(socket);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while(true) {
				String clientMessage = dataInputStream.readUTF();
				System.out.println(clientMessage);
				
				dataOutputStream.writeUTF("�޽��� ���� �Ϸ�~~");
				dataOutputStream.flush();
				
				if(clientMessage.equals("STOP")) break;
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
