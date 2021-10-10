package JavaTestTCP.TCPChat.Chat03;

/**
 * 在线聊天室   客户端01
 *
 *
 *
 */

//准备封装

import java.io.*;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {

        Socket client=new Socket("localhost",9999);

        //启动多线程
        new Thread(new Send(client)).start();
        new Thread(new Resive(client)).start();
    }
}
