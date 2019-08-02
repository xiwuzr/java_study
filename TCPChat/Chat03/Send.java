package JavaTestTCP.TCPChat.Chat03;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable{
    private BufferedReader br1;
    private DataOutputStream dom;
    private boolean isRunning=true;
    private Socket client;

    Send(Socket client){
        this.client=client;
        try {
            br1=new BufferedReader(new InputStreamReader(System.in));
            dom=new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            release();
            System.out.println("发送出错-001");
        }
    }

   @Override
    public void run() {
        while(true){
            String msg="";
            try {
                msg=br1.readLine();
                if(msg.equals(""))
                {
                    break;
                }
                send(msg);
            } catch (IOException e) {
                release();
                System.out.println("发送出错-002");
            }
        }
    }
    //发送方法
    void send(String msg){
        try {
            dom.writeUTF(msg);
            dom.flush();
        } catch (IOException e) {
            System.out.println("发送出错-003");
        }

    }
//释放资源
    private void release(){
        this.isRunning=false;
        Utils.close(dom,br1,client);
    }
}
