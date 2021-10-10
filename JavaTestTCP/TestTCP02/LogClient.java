package JavaTestTCP.TestTCP02;

import java.io.*;
import java.net.Socket;

public class LogClient {
    public static void main(String[] args) throws Exception {


        Socket client=new Socket("localhost",8888);

        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名：");
        String uname=read.readLine();
        System.out.println("请输入密码： ");
        String pwd=read.readLine();

        DataOutputStream dom=new DataOutputStream(client.getOutputStream());

        dom.writeUTF("uname="+uname+'&'+"pwd="+pwd);
        dom.flush();

        DataInputStream dis=new DataInputStream(client.getInputStream());
        String datas=dis.readUTF();
        System.out.println(datas);
        client.close();
        dom.close();
    }
}
