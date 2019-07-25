package JavaStudy;

import java.util.*;

public class StringTest1 {
    public static void main(String[] args) {
        String a=new String("fdsa");
        System.out.println(a);

        char[]z=a.toCharArray();
        StringBuilder g=new StringBuilder(a);
        Arrays.sort(z);
        System.out.println(z);
    }
}
