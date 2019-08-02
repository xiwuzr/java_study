package JavaTestTCP.TCPChat.Chat03;

/**
 * 在线聊天室   服务端
 *
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    public static void main(String[] args) throws IOException {
        //设置自己的端口

        ServerSocket server01=new ServerSocket(9999);

        while(true){
            Socket client=server01.accept();
            System.out.println("——-一个客户端连接成功———");
            new Thread(new Channel(client)).start();
        }
    }
    //管理一个客户端
    static class Channel implements Runnable{
        private DataInputStream dis= null;
        private DataOutputStream dom=null;
        private Socket client;
        private boolean isRunning;

        public Channel(Socket client){
            this.client=client;
            try {
                isRunning=true;
                dis = new DataInputStream(client.getInputStream());
                dom=new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                System.out.println(Thread.currentThread().getName()+ "初始化错误");
                release();
            }
        }
        //收消息
        private String receive(){
            String msg="";
            try {
                msg=dis.readUTF();
            } catch (IOException e) {
                System.out.println(Thread.currentThread().getName()+"错误代码:001");
                release();
            }
            return msg;
        }
        //发消息
        private void seng(String msg){
            try {
                dom.writeUTF(msg);
                dom.flush();
            } catch (IOException e) {
                System.out.println(Thread.currentThread().getName()+"错误代码:001");
                release();
            }
        }
        //释放资源
        private void release(){
            this.isRunning=false;
            Utils.close(dom,dis,client);
        }
        //重写Run方法
        @Override
        public void run() {
            while(isRunning){
                String msg="";
                msg=receive();
                if(!msg.equals("")){
                    seng(msg);
                }
            }
        }
    }
}
