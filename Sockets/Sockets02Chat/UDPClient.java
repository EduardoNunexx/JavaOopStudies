import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPClient{
	public static void main(String args[]){ 
	// args give message contents and server hostname
	DatagramSocket aSocket = null;
		try {
			aSocket = new DatagramSocket();
			Scanner sc = new Scanner(System.in);
			InetAddress aHost = InetAddress.getByName("localHost");
			int serverPort = 6789;
			do {
				//getting the client message
				String arg =sc.nextLine();
				if (arg.equals("exit")){
					throw new RuntimeException("Client exit");
				}
				//turning the message into bytes
				byte [] m = arg.getBytes();
				//creating the response
				DatagramPacket clientMessage = new DatagramPacket(m,m.length, aHost, serverPort);
				//sending client the message
				aSocket.send(clientMessage);
				//creating the byte var to receive the server response
				byte[] buffer = new byte[1000];
				DatagramPacket serverReplyBytes = new DatagramPacket(buffer, buffer.length);
				//getting the server message
				aSocket.receive(serverReplyBytes);
				//turning the response byte in a string
				String serverReply = new String(serverReplyBytes.getData(),0,serverReplyBytes.getLength(), StandardCharsets.UTF_8);
				System.out.println("Server say: " + serverReply);
			}while (true);
		} catch (SocketException e){
			System.out.println("Socket: " + e.getMessage());
		} catch (IOException e){
			System.out.println("IO: " + e.getMessage());
		} finally {
			if(aSocket != null) {
				aSocket.close();
			}
		}
	} 
}