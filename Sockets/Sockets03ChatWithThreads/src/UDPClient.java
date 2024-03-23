	import java.io.IOException;
	import java.net.DatagramPacket;
	import java.net.DatagramSocket;
	import java.net.InetAddress;
	import java.net.SocketException;
	import java.nio.charset.StandardCharsets;
	import java.util.Scanner;

	public class UDPClient{
		public static void main(String args[]){
		// args give message contents and server hostname
		DatagramSocket aSocket = null;
			try {
				aSocket = new DatagramSocket();
				InetAddress aHost = InetAddress.getByName("localHost");
				int serverPort = 6789;
				Listener listener = new Listener(aSocket);
				Speaker speaker = new Speaker(aSocket,aHost,serverPort);
				listener.start();
				speaker.start();
			} catch (SocketException e){
				System.out.println("Socket: " + e.getMessage());
			} catch (IOException e){
				System.out.println("IO: " + e.getMessage());
			}
		}
		public static class Listener extends Thread{
			DatagramSocket aSocket;
			Listener(DatagramSocket aSocket){
				this.aSocket=aSocket;
			}
			public void run(){
				try{
					//creating the byte var to receive the server response
					byte[] buffer = new byte[1000];
					DatagramPacket serverReplyBytes = new DatagramPacket(buffer, buffer.length);
					do {
						//getting the server message
						aSocket.receive(serverReplyBytes);
						//turning the response byte in a string
						String serverReply = new String(serverReplyBytes.getData(),0,serverReplyBytes.getLength(), StandardCharsets.UTF_8);
						System.out.println("Server say: " + serverReply);
					}while(true);
				}catch (IOException e){
					System.out.println(e);
				}
			}
		}
		public static class Speaker extends Thread{
			DatagramSocket aSocket;
			InetAddress aHost;
			int serverPort;
			Speaker(DatagramSocket aSocket,InetAddress aHost, int serverPort){
				this.aSocket=aSocket;
				this.aHost=aHost;
				this.serverPort=serverPort;
			}
			public void run(){
				Scanner sc = new Scanner(System.in);
				try {
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
						//sending the client message
						aSocket.send(clientMessage);
					}while(true);
				}catch (IOException e){
					System.out.println(e);
				}

			}
		}
	}