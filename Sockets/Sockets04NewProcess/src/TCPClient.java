import java.net.*;
import java.util.Scanner;
import java.io.*;
public class TCPClient {
	public static void startClient (String arg, int serverPort,String host) {
	// arguments supply message and hostname of destination

	Socket s = null;
	    try{

		   	s = new Socket(host, serverPort);
		   	DataInputStream in = new DataInputStream( s.getInputStream());
			DataOutputStream out =
				new DataOutputStream( s.getOutputStream());
			out.writeUTF(arg);   
			String data = in.readUTF();
			System.out.println("Received: "+ data);
	    } catch (UnknownHostException e){System.out.println("Sock:"+e.getMessage()); 
	    } catch (EOFException e){ System.out.println("EOF:"+e.getMessage());
	    } catch (IOException e){ System.out.println("IO:"+e.getMessage());
		} finally { if(s!=null) { try { s.close(); } catch (IOException e){System.out.println("close:"+e.getMessage()); } }
		}
  	}
}
