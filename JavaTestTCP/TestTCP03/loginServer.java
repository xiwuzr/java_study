package JavaTestTCP.TestTCP03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class loginServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server01=new ServerSocket(9999);
        Socket soc=server01.accept();
        System.out.println("———连接成功———");
        Scanner br=new Scanner(new InputStreamReader(soc.getInputStream()));
        String str=br.nextLine();
        String str1[]=str.split("&");
        System.out.println(str1[0]);
        System.out.println(str1[1]);

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));

        if(str1[0].equals("qqq")&&str1[1].equals("123456789"))
        {

            bw.write("登陆成功");
            bw.flush();

        }else{
            bw.write("登陆成功");
            bw.flush();
        }
        bw.close();
        br.close();


    }
}
