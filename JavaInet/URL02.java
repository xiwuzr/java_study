package JavaInter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
public class URL02 {
    public static void main(String[] args) throws IOException {
        URL url2=new URL("http://www.baidu.com");
        /*
        InputStream in = url2.openStream();
        byte fla[]=new byte[1024];
        int len=-1;
        while((len=in.read(fla))!=-1){
           String s=new String(fla,0,len);
            System.out.println(s);
        }
         */
        InputStreamReader in=new InputStreamReader(url2.openStream(),"utf-8");
        BufferedReader br=new BufferedReader(in);
        String tmp=null;
        while((tmp=br.readLine())!=null){
            System.out.println(tmp);
        }






    }
}
