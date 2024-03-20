import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPServer {
    public static void main (String args[]) {
	try{
		int serverPort = 7896; 
		ServerSocket listenSocket = new ServerSocket(serverPort);
		while(true) {
			Socket clientSocket = listenSocket.accept();
			Connection c = new 	Connection(clientSocket);
		}
	} catch(IOException e) {System.out.println("Listen :"+e.getMessage());}
    }
}

class Connection extends Thread {
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
	public Connection (Socket aClientSocket) {
	    try {
			//establishing the connection
			clientSocket = aClientSocket;
			in = new DataInputStream( clientSocket.getInputStream());
			out =new DataOutputStream( clientSocket.getOutputStream());
			//calling the threads
			this.start();
	     } catch(IOException e)  {System.out.println("Connection:"+e.getMessage());}
	}
	public void run(){
	    try {
			Scanner sc = new Scanner(System.in);
			String arg;
			do {
				String data = in.readUTF();
				System.out.println("Client say: "+data);
				arg=sc.nextLine();
				out.writeUTF(arg);
			}while(arg.equals("exit"));
			sc.close();
			throw new RuntimeException("Server exited");
	    } catch(IOException e) {System.out.println("IO:"+e.getMessage());
	    } finally{ try {clientSocket.close();}catch (IOException e){/*close failed*/}}
	}
}