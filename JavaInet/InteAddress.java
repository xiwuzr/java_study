package JavaInter;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InteAddress {
    public static void main(String[] args) {

        try {
            InetAddress inet=InetAddress.getByName("www.baidu.com");
            System.out.println(inet);
            InetAddress inet2=InetAddress.getByName("localHost");
            System.out.println(inet2);
            InetAddress inet3=InetAddress.getLocalHost();
            System.out.println(inet3);
            System.out.println(inet3.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("错误");
            e.printStackTrace();
        }


    }

}
