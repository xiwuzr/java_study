package JavaTestTCP.ThreadTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server=new ServerSocket(8888);
        boolean isRunning=true;
        while(isRunning) {
            Socket client = server.accept();
            new Thread(new Channel(client)).start();
            System.out.println("一个客户端建立了连接");
        }
        server.close();
    }
    static class Channel implements Runnable{
        Socket client;
        DataInputStream dis;
        DataOutputStream dom ;

        //构造器
        Channel(Socket client){
            this.client=client;
            try {
                dis = new DataInputStream(client.getInputStream());
                dom = new DataOutputStream(client.getOutputStream());

            } catch (IOException e) {
                e.printStackTrace();
                release();
            }
        }
        //接受数据
        private String resive(){
            String datas = null;
            try {
                datas = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return datas;
        }
        //释放资源
        private void release(){
            try {
                if(null!=dom){
                    dom.close();
                }
                if(null!=dis){
                    dis.close();
                }
                if(null!=client){
                    client.close();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //发送数据
        private void send(String msg){
            try {
                dom.writeUTF(msg);
                dom.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        @Override
        public void run() {


            String dataArrays[] = resive().split("&");
            String st1 = "", st2 = "";
            for (String tmp : dataArrays) {
                String datainfor[] = tmp.split("=");
//            System.out.println(datainfor[0]+": "+datainfor[1]);
                if ( datainfor[ 0 ].equals("uname") ) {
                    System.out.println("用户名：" + datainfor[ 1 ]);
                    st1 = datainfor[ 1 ];
                } else if ( datainfor[ 0 ].equals("pwd") ) {
                    System.out.println("密码为：" + datainfor[ 1 ]);
                    st2 = datainfor[ 1 ];
                }
            }
            if ( st1.equals("xiwuzr") && st2.equals("123456789") ) {
               send("登录成功");

            } else {
               send("登录失败");
            }
            release();
        }
    }
}

