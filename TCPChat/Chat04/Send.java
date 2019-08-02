package JavaTestTCP.TCPChat.Chat04;

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
    private String uName;

    Send(Socket client,String uName){
        this.client=client;
        try {
            this.uName=uName;
            br1=new BufferedReader(new InputStreamReader(System.in));
            dom=new DataOutputStream(client.getOutputStream());
            send(uName);
        } catch (IOException e) {
            release();
            System.out.println("发送出错-001");
        }
    }

   @Override
    public void run() {/////改不重复
        while(isRunning){
            String msg="";
            try {
                if(client==null){
                    break;
                }
                msg=br1.readLine();
//               if(msg.equals(""))
//               {
//                   break;
//               }
                send(msg);
            } catch (IOException e) {

                isRunning=false;
                System.out.println("发送出错-002");
                release();
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
            isRunning=false;
            release();
        }

    }
//释放资源
    private void release(){
        this.isRunning=false;
        Utils.close(dom,br1,client);
    }
}
