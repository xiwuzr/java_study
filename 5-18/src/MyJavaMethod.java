/**
 * 方法调用理解
 *
 *
 */

import java.util.Scanner;

public class MyJavaMethod {
    public static void main(String[] args) {
        MyJavaMethod sc=new MyJavaMethod();
        int b=sc.scaInt();
        System.out.println(b);
        sc.prInt(b);

    }
    int scaInt()
    {
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    void prInt(int a)
    {
        System.out.println(a);
    }
}
