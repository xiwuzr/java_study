package JavaIO.file;

import java.io.*;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file1=new File("D:\\javaFileTest\\aa.txt");
        File file2=new File("D:\\javaFileTest\\bb.txt");
        try {
            FileReader fr=new FileReader(file1);
            FileWriter fw=new FileWriter(file2);
            char ch[]=new char[5];
            int tmp=-1;
            while((tmp=fr.read(ch))!=-1){
                fw.write(ch,0,tmp);
            }
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
