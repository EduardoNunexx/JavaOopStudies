import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class TCPClient {
	public static void main (String args[]) {
	// arguments supply message and hostname of destination

	Socket s = null;
	    try{
	    	int serverPort = 7896;
		   	s = new Socket("localhost", serverPort);
		   	Listener listener = new Listener(s);
			Speaker speaker = new Speaker(s);
			speaker.start();
			listener.start();

	    } catch (UnknownHostException e){System.out.println("Sock:"+e.getMessage()); 
	    } catch (IOException e){ System.out.println("IO:"+e.getMessage());
		}
  	}
	public static class Listener extends Thread{
		Socket s= null;
		Listener(Socket s){
			this.s=s;
		}
		public void run(){
			try {
				DataInputStream in = new DataInputStream(s.getInputStream());
				String data;
				do {
					data = in.readUTF();
					System.out.println("Server say: " + data);
				}while (!data.equals("exit"));
			}catch (IOException e){
				System.out.println(e);
			}
		}
	}
	public static class Speaker extends Thread{
		Socket s;
		Speaker(Socket s){
			this.s=s;
		}
		public void run() {
			try {
				Scanner sc = new Scanner(System.in);
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				String arg;
				do {
					arg=sc.nextLine();
					out.writeUTF(arg);
					out.flush();
				}while(!arg.equals("exit"));
				sc.close();
				throw  new RuntimeException();
			}catch (IOException e){
				System.out.println("Deu ruim no client speaker");
			}
		}
	}
}
