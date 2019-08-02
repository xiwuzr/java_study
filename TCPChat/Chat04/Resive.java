package JavaTestTCP.TCPChat.Chat04;

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

            System.out.println("接收错误--001");
            isRunning=false;
            release();

        }
    }

    @Override
    public void run() {
        while(isRunning){
            try {
                msg=dis.readUTF();
                System.out.println(msg);
//                if ( msg == "" ) {
//                    break;
//                }
            } catch (IOException e) {
                System.out.println("接收错误--002");
                isRunning=false;
                release();

            }
        }
    }
    //释放资源
    private void release(){
        this.isRunning=false;
        Utils.close(dis,client);
    }
}