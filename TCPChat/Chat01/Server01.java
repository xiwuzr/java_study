package JavaTestTCP.TCPChat.Chat01;

/**
 * 在线聊天室   服务端
 *
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        ServerSocket server01=new ServerSocket(9999);
        boolean isRunning=true;
        while(isRunning){
            Socket client=server01.accept();
            System.out.println("———连接成功———");
            DataInputStream dis=new DataInputStream(client.getInputStream());
            DataOutputStream dom=new DataOutputStream(client.getOutputStream());


            while(isRunning){
                String msg="";
                msg=dis.readUTF();
                dom.writeUTF(msg);

//           if(dis.readUTF().equals("bye")){
//               break;
//           }
                dom.flush();
            }
            dom.flush();
            dom.close();
            dis.close();
            client.close();
        }

    }
}
