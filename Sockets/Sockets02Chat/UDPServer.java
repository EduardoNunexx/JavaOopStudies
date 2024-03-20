import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPServer{
	public static void main(String args[]){ 
		DatagramSocket aSocket = null;
	    try{
	    	aSocket = new DatagramSocket(6789);
	    	byte[] buffer = new byte[1000];
			Scanner sc = new Scanner(System.in);
	 		while(true){
				 //creating the datagram to receive the client response
 				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				 //adding the response to request var
				 aSocket.receive(request);
				 //translating the response bytes in a string
				 String clientResponse = new String(request.getData(),0, request.getLength(), StandardCharsets.UTF_8);
				 //printing the client message
				System.out.println("Client says: "+clientResponse);
				//getting the server message
				String serverResponse = sc.nextLine();
				//translating the response to bytes
				byte[] responseBytes = serverResponse.getBytes(StandardCharsets.UTF_8);
				//creating the response that will be sent
 				DatagramPacket reply = new DatagramPacket(responseBytes,
			   	responseBytes.length, request.getAddress(), request.getPort());
				 //sending the response
 				aSocket.send(reply);
			}
	    } catch (SocketException e) {
	    	System.out.println("Socket: " + e.getMessage());
	    } catch (IOException e) {
	    	System.out.println("IO: " + e.getMessage());
		} finally {
			if(aSocket != null) {
				aSocket.close();
			}
		}
    }
}