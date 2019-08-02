package JavaTestTCP.TCPChat.Chat04;

/**
 * 在线聊天室   客户端01
 *
 *
 *
 */

//准备封装

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {
        System.out.print("请输入你的用户名;");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        String uName=br1.readLine();
        Socket client=new Socket("localhost",9999);
        //启动多线程
        new Thread(new Send(client,uName)).start();
        new Thread(new Resive(client)).start();
    }
}
