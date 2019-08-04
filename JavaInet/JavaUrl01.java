package JavaInter;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaUrl01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url1=new URL("https://www.baidu.com/?tn=02049043_27_pg");
        System.out.println(url1.getHost());
        System.out.println(url1.toString());

    }

}
