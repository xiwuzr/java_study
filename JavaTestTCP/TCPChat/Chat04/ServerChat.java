package JavaTestTCP.TCPChat.Chat04;

/**
 * 超级多BUG的聊天室
 * 问题：客户端不能自己下线
 *      服务端关闭之后，客户端 不会关闭
 * 在线聊天室   服务端
 *
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class ServerChat {
    //创建容器存储客户端
    private static CopyOnWriteArrayList<Channel> all=new CopyOnWriteArrayList();
    public static void main(String[] args) throws IOException {

        //设置自己的端口
        ServerSocket server01=new ServerSocket(9999);

        while(true){
            Socket client=server01.accept();
            System.out.println("——-一个客户端连接成功———");
            Channel channel =new Channel(client);
            all.add(channel);
            new Thread(channel).start();
        }
    }
    //管理一个客户端
    static class Channel implements Runnable{
        private DataInputStream dis= null;
        private DataOutputStream dom=null;
        private Socket client;
        private boolean isRunning;
        private String uName;

        public Channel(Socket client){
            this.client=client;
            try {
                isRunning=true;
                dis = new DataInputStream(client.getInputStream());
                dom=new DataOutputStream(client.getOutputStream());
                this.uName=receive();
                send("欢迎登陆！");
                sendOthers(uName+"进入聊天室",true);
            } catch (IOException e) {
                System.out.println("初始化错误");
                release();
            }
        }
        //收消息
        private String receive(){
            String msg="";
            try {
                msg=dis.readUTF();
            } catch (IOException e) {
                System.out.println("错误代码:001");
                release();
            }
            return msg;
        }
        //发消息
        private void send(String msg){
            try {
                dom.writeUTF(msg);
                dom.flush();
            } catch (IOException e) {
                System.out.println("错误代码:001");
                isRunning=false;
                release();
            }
        }
        //实现群聊
        private void sendOthers(String msg,boolean isSys){

            boolean isP=msg.startsWith("@");
            if(isP){
                int indx=msg.indexOf(":");
                String tgtName=msg.substring(1,indx);
                msg=msg.substring(indx+1);
                for(Channel tmp:all ){
                    if(tmp.uName.equals(tgtName)){
                        tmp.send(uName+"对你说："+msg);
                        break;
                    }
                }


            }else{
                for(Channel tmp:all ){
                    if(tmp==this){
                        continue;
                    }
                    if(!isSys){
                        tmp.send(uName+"对所有人说："+msg);
                    }else
                    {
                        tmp.send(msg);
                    }
                }
            }

        }
        //释放资源
        private void release(){
            this.isRunning=false;
            Utils.close(dom,dis,client);
            all.remove(this);
            sendOthers(this.uName+"离开了",true);
        }
        //重写Run方法
        @Override
        public void run() {
            while(isRunning){
                String msg="";
                //接收
                msg=receive();
                if(!msg.equals("")&&msg!=null){
                    //发送方法
                    sendOthers(msg,false);
                }
            }
        }
    }
}
