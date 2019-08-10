package JavaIO;
/**
 * 文件复制，字节流操作
 *
 */

import java.io.*;

public class StreamTest01  {
    public static void main(String[] args) throws IOException {
        FileInputStream fp1=new FileInputStream("D:\\javaFileTest\\184991.jpg");
        BufferedInputStream f1=new BufferedInputStream(fp1);
        FileOutputStream fp2=new FileOutputStream("D:\\javaFileTest\\tutu.jpg");
        BufferedOutputStream f2=new BufferedOutputStream(fp2);
        byte a[]=new byte[100];
        int len=-1;
        while((len=f1.read(a))!=-1){
            f2.write(a,0,len);
        }
        fp2.close();
        fp1.close();
    }
}
