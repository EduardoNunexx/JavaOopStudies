import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPServer{
	public static void main(String args[]){ 
		DatagramSocket aSocket = null;
	    try{
	    	aSocket = new DatagramSocket(6789);
	    	byte[] buffer = new byte[1000];
			Speaker speaker = new Speaker(aSocket,buffer);
			Listener listener = new Listener(aSocket,buffer);
			listener.start();
			speaker.start();
	    } catch (SocketException e) {
	    	System.out.println("Socket: " + e.getMessage());
	    }
    }
	public static class Listener extends Thread{
		DatagramSocket aSocket;
		byte[] buffer;
		Listener(DatagramSocket aSocket, byte[] buffer){
			this.aSocket=aSocket;
			this.buffer=buffer;
		}
		public void run(){
			try {
				do {
					//creating the datagram to receive the client response
					DatagramPacket request = new DatagramPacket(buffer, buffer.length);
					//adding the response to request var
					aSocket.receive(request);
					//translating the response bytes in a string
					String clientResponse = new String(request.getData(),0, request.getLength(), StandardCharsets.UTF_8);
					//printing the client message
					System.out.println("Client says: "+clientResponse);
				}while(true);
			}catch (IOException e){
				System.out.println(e);
			}
		}
	}
	public static class Speaker extends Thread{
		DatagramSocket aSocket;
		byte[] buffer;
		Speaker(DatagramSocket aSocket,byte[] buffer){
			this.aSocket=aSocket;
			this.buffer=buffer;
		}
		public void run(){
			Scanner sc = new Scanner(System.in);
			try{
				do {
					DatagramPacket request = new DatagramPacket(buffer, buffer.length);
					//adding the response to request var
					//aqui o erro
					aSocket.receive(request);
					String serverResponse = sc.nextLine();
					//translating the response to bytes
					byte[] responseBytes = serverResponse.getBytes(StandardCharsets.UTF_8);
					//creating the response that will be sent
					DatagramPacket reply = new DatagramPacket(responseBytes,
							responseBytes.length, request.getAddress(), request.getPort());
					//sending the response
					aSocket.send(reply);
				}while (true);
			}catch (IOException e){
				System.out.println(e);
			}


		}
	}
}