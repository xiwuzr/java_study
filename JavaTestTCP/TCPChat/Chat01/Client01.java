package JavaTestTCP.TCPChat.Chat01;
/**
 * 在线聊天室   客户端01
 *
 */

import java.io.*;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",9999);
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dom=new DataOutputStream(client.getOutputStream());
        DataInputStream dis=new DataInputStream(client.getInputStream());
        while(true){
            String msg="";
            msg=br1.readLine();
            dom.writeUTF(msg);
            msg=dis.readUTF();
            System.out.println(msg);
            if(msg.equals("bye")){
                break;
            }
            dom.flush();
        }
        dis.close();
        dom.close();
        client.close();
    }
}
