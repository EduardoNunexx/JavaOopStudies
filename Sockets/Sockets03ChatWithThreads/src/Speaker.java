import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Speaker extends Thread{
    Socket aClientSocket;
    Speaker(Socket aClientSocket){
        this.aClientSocket=aClientSocket;
    }
    public void run(){
        DataOutputStream out;
        Scanner sc = new Scanner(System.in);
        try {
            String arg;
            do {
                out =new DataOutputStream( aClientSocket.getOutputStream());
                arg=sc.nextLine();
                out.writeUTF(arg);
            }while(!arg.equals("exit"));
            throw new RuntimeException("Server exited");
        }catch(IOException e) {System.out.println("IO:"+e.getMessage());
        } finally{ try {aClientSocket.close();}catch (IOException e){/*close failed*/}}
        sc.close();
    }
}
