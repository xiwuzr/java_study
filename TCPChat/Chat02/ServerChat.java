package JavaTestTCP.TCPChat.Chat02;

/**
 * 在线聊天室   服务端
 *
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    public static void main(String[] args) throws IOException {
        ServerSocket server01=new ServerSocket(9999);

        while(true){
            Socket client=server01.accept();
            System.out.println("———连接成功———");
            new Thread(()->{
                boolean isRunning=true;
                DataInputStream dis= null;
                DataOutputStream dom=null;
                try {
                    dis = new DataInputStream(client.getInputStream());
                    dom=new DataOutputStream(client.getOutputStream());
                    while(isRunning){
                        String msg="";
                        msg=dis.readUTF();
                        dom.writeUTF(msg);
                        dom.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    isRunning=false;
                }


                try {
                    if(dom!=null)
                        dom.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if(dis!=null)
                        dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if(client!=null)
                        client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
