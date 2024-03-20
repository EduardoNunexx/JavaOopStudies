import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Listener02 extends Thread{
    Socket aClientSocket;
    Listener02(Socket aClientSocket){
        this.aClientSocket=aClientSocket;
    }
    public  void run(){
        DataInputStream in;
        try {
            String data;
            do {
                in = new DataInputStream(aClientSocket.getInputStream());
                data = in.readUTF();
                System.out.println("Client say: " + data);
            } while (!data.equals("exit"));
        }catch(IOException e) {System.out.println("IO:"+e.getMessage());
        } finally{ try {aClientSocket.close();}catch (IOException e){/*close failed*/}}
    }

}
