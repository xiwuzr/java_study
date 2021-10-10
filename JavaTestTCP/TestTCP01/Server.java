package JavaTestTCP.TestTCP01;


/**
 * 服务器
 * 1、指定端口，创建服务器用ServerSocket
 * 2、指定端口，创建服务器用ServerSocket
 * 3、创建IO 流
 * 4、释放资源
 *
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //指定端口，创建服务器用ServerSocket
        ServerSocket server=new ServerSocket(8888);

        //指定端口，创建服务器用ServerSocket
        Socket client=server.accept();


        //创建IO 流，并分析数据
//       DataInputStream dis=new DataInputStream(client.getInputStream());
//        System.out.println(dis.readUTF());

        InputStreamReader isr=new InputStreamReader(client.getInputStream());
        BufferedReader br=new BufferedReader(isr);
        String str=null;
        System.out.println("一个客户端建立了连接");

        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        str=br.readLine();
        System.out.println(str);





    }

}
