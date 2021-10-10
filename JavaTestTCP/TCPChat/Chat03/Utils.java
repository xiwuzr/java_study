package JavaTestTCP.TCPChat.Chat03;

import java.io.Closeable;

/**
 * 释放资源的类
 *
 */
public class Utils {
    public static void close(Closeable... targets){
        for(Closeable target:targets){
            try{
                if(null!=target){
                    target.close();
                }
            }catch(Exception e){
                System.out.println("关闭资源出错");
            }
        }
    }
}
