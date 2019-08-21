package IOTest.ByteArrayTest;
/**
 * 文件拷贝
 * 使用字节数组流
 *
 * 过程：
 * 文件->程序->字节数组
 * 字节数组->程序->文件
 *
 */

import java.io.*;

public class Demo01 {
    public static void main(String[] args) {
        String path1="D:\\javaTest\\279904.jpg";
        String path2="D:\\javaTest\\aaaa\\279904.jpg";
        //文件转为字节数组
        byte[] flash=fileToByteArray(path1);

        //字节数组转为文件
        byteArrayToFile(path2,flash);

        System.out.println(flash.length);
    }
    public static byte[] fileToByteArray(String path){
        FileInputStream fis=null;
        ByteArrayOutputStream bos=null;
        byte[] dest=null;

        try {
            fis=new FileInputStream(path);
            byte[] flash=new byte[1024];
            bos=new ByteArrayOutputStream();
            int len=-1;
            while((len=fis.read(flash))!=-1){
                bos.write(flash,0,len);
            }
            bos.flush();
            dest=bos.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dest;
    }
    public static void byteArrayToFile(String path,byte[] flash){
        ByteArrayInputStream bis=null;
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream(path);
            bis=new ByteArrayInputStream(flash);
            byte[] car=new byte[10];
            int len=-1;
            while((len=bis.read(car))!=-1){
                fos.write(car,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
