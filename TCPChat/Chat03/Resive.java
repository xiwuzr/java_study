package JavaTestTCP.TCPChat.Chat03;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Resive implements Runnable{
    private DataInputStream dis;
    private Socket client;
    private boolean isRunning=true;
    private String msg;
    Resive(Socket client){
        this.client=client;

        try {
            dis=new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            release();
            System.out.println("接收错误--001");
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                msg=dis.readUTF();
            } catch (IOException e) {
                release();
                System.out.println("接收错误--002");
            }
            System.out.println(msg);
        }
    }
    //释放资源
    private void release(){
        this.isRunning=false;
        Utils.close(dis,client);
    }
}