package test05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.time.format.DateTimeParseException;



public class FileCopyTest  {
    public static void main(String[] args) throws Exception {
        File f1=new File("D:\\javaTest");
        File f2=new File("E:");
        copy(f1,f2);

    }

    static void copy(File fF,File fS) throws Exception {
        fS=new File(fS,fF.getName());
        if(fF.isDirectory())
        {
            fS.mkdir();
            String[] fileName=fF.list();
            for(String temp:fileName){
                File f=new File(fF,temp);
                copy(f,fS);
            }
        }
        else
        {
            FileInputStream is=new FileInputStream(fF);
            FileOutputStream os=new FileOutputStream(fS);
            byte[] flush=new byte[1024];
            int len=-1;
            while((len=is.read(flush))!=-1)
            {
                os.write(flush,0,len);
            }
        }
    }
}