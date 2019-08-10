package JavaIO;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args)throws IOException {
        char a[]=new char[5];
        BufferedReader fp=new BufferedReader(new FileReader("D:\\javaFileTest\\ss.txt"));
        int len;
        while((len=fp.read(a))!=-1)
        {
            System.out.print(new String(a,0,len));
        }
        fp.close();

    }
}
