import java.net.*;
import java.util.Scanner;
import java.io.*;
public class TCPClient {
	public static void main (String args[]) {
	// arguments supply message and hostname of destination

	Socket s = null;
	    try{
			Scanner sc = new Scanner(System.in);
			String arg=sc.nextLine();
	    	int serverPort = 7896;
		   	s = new Socket("localhost", serverPort);
		   	DataInputStream in = new DataInputStream( s.getInputStream());
			DataOutputStream out =
				new DataOutputStream( s.getOutputStream());
			out.writeUTF(arg);   
			String data = in.readUTF();
			System.out.println("Received: "+ data);      
			sc.close();
	    } catch (UnknownHostException e){System.out.println("Sock:"+e.getMessage()); 
	    } catch (EOFException e){ System.out.println("EOF:"+e.getMessage());
	    } catch (IOException e){ System.out.println("IO:"+e.getMessage());
		} finally { if(s!=null) { try { s.close(); } catch (IOException e){System.out.println("close:"+e.getMessage()); } }
		}
  	}
}
