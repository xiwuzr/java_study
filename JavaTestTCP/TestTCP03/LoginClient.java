package JavaTestTCP.TestTCP03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws IOException {

        Socket soc=new Socket("localhost",9999);
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));

        System.out.println("请输入姓名：");
        String uName=br1.readLine();
        System.out.println("请输入密码：");
        String pwd=br1.readLine();
        bw.write(uName+"&"+pwd);
        bw.flush();

        Scanner br=new Scanner(new InputStreamReader(soc.getInputStream()));
        String msg=br.nextLine();

        System.out.println(msg);
        soc.close();

    }
}
