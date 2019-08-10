package JavaIO;
/**
 * 文件拷贝
 *
 * 使用缓冲流
 *
 *字符流
 */

import java.io.*;


public class BufferedTest02 {
    public static void main(String[] args) throws IOException{

        BufferedWriter fp1=new BufferedWriter(/*创建一个文件操作的流，用缓冲流包装*/new FileWriter("D:\\javaFileTest\\ss.jpg"));
        BufferedReader fp2=new BufferedReader(new FileReader("D:\\javaFileTest\\184991.jpg"));

        int len=-1;
        char a[]=new char[5];
        while((len=fp2.read(a))!=-1){
            fp1.write(new String(a,0,len));
        }
        fp1.flush();
        fp2.close();
        fp1.close();
    }
}
