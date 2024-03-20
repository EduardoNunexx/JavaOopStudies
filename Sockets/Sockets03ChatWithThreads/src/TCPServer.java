import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main (String args[]) {
	try{
		int serverPort = 7896; 
		ServerSocket listenSocket = new ServerSocket(serverPort);
		while(true) {
			Socket clientSocket = listenSocket.accept();
			System.out.println("Client connected !");
			Connection c = new 	Connection(clientSocket);
		}
	} catch(IOException e) {System.out.println("Listen :"+e.getMessage());}
    }
}

class Connection extends Thread {
	Socket clientSocket;
	public Connection (Socket aClientSocket) {
			//establishing the connection
			clientSocket = aClientSocket;
			Listener listener = new Listener(clientSocket);
			Speaker speaker = new Speaker(clientSocket);
			//calling the threads
			listener.start();
			speaker.start();
	}
	public class Listener extends Thread{
		Socket s;
		Listener(Socket s){
			this.s=s;
		}
		public void run(){
			DataInputStream in;
			try {
				in = new DataInputStream(s.getInputStream());
				String data;
				do {
					data = in.readUTF();
					System.out.println("Client say: "+data);
				}while (!data.equals("exit"));
				throw new RuntimeException("Client exited");
			}catch (Exception e){
				System.out.println("deuruim");
			}
		}
	}
	public class Speaker extends Thread{
		Socket s;
		Speaker(Socket s){
			this.s = s;
		}
		public void run(){
			DataOutputStream out;
			try {
				out=new DataOutputStream( s.getOutputStream());
				Scanner scanner = new Scanner(System.in);
				String arg;
				do {
					arg=scanner.nextLine();
					out.writeUTF(arg);
					out.flush();
				}while (!arg.equals("exit"));
				throw new RuntimeException("Server exited");
			}catch (Exception e){
				System.out.println("Deu ruim no speaker do sevidor");
			}
		}
	}
}