package IOTest.FileTest;

import java.io.*;
/*
    创建源
    选择流
    操作
    释放资源
 */

public class Demo01 {
    public static void main(String[] args) {
        File fp=new File("D:\\javaTest\\aa.txt");
        FileInputStream fis=null;
        InputStreamReader isr=null;
        try {
            fis=new FileInputStream(fp);
            //微软的ANSI编码就是GBK
            isr=new InputStreamReader(fis,"GBK");
            char a[]=new char[5];
            int len=-1;
            while((len=isr.read(a))!=-1){

                System.out.print(new String(a,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(isr!=null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
