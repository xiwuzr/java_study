package JavaTestTCP.ThreadTCP;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {


        Socket client=new Socket("localhost",8888);

//        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("请输入用户名：");
//        String uname=read.readLine();
//        System.out.println("请输入密码： ");
//        String pwd=read.readLine();
        //DataOutputStream dom=new DataOutputStream(client.getOutputStream());
        new Send(client).send();
        new Resive(client).resive();



        client.close();//释放资源
    }
    //接收
    static class Resive{
        Socket client;
        DataInputStream dis;
        public Resive(Socket client){
            this.client=client;
            try {
                dis=new DataInputStream(client.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void resive(){
            String datas= null;
            try {
                datas = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(datas);

        }
    }

    //发送
    static class Send{
        Socket client;
        DataOutputStream dom;
        BufferedReader read;
        String msg;
        Send(Socket client){
            read=new BufferedReader(new InputStreamReader(System.in));
            this.msg=init();
            this.client=client;
            try {

                dom =new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void send(){
            try {
                dom.writeUTF(msg);
                dom.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public String init(){
            String uname="";
            String pwd="";
            try {
                System.out.println("请输入用户名：");
                uname=read.readLine();
                System.out.println("请输入密码： ");
                pwd=read.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "uname="+uname+'&'+"pwd="+pwd;

        }

    }
}
