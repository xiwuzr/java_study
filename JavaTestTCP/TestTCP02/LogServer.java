package JavaTestTCP.TestTCP02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LogServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server=new ServerSocket(8888);
        Socket client=server.accept();
        System.out.println("一个客户端建立了连接");
        DataInputStream dis=new DataInputStream(client.getInputStream());
        String datas=dis.readUTF();
        String dataArrays[]=datas.split("&");
        String st1="",st2="";
        for(String tmp :dataArrays){
            String datainfor[]=tmp.split("=");
            if(datainfor[0].equals("uname")){
                System.out.println("用户名："+datainfor[1]);
                st1=datainfor[1];
            }else if(datainfor[0].equals("pwd")){
                System.out.println("密码为："+datainfor[1]);
                st2=datainfor[1];
            }
        }
        DataOutputStream dom=new DataOutputStream(client.getOutputStream());


        if(st1.equals("xiwuzr")&&st2.equals("123456789"))
        {
            dom.writeUTF("登录成功");
            dom.flush();
        }else{
            dom.writeUTF("登录失败");
            dom.flush();
        }
        dis.close();
        server.close();
    }
}
