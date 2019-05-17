import java.util.Scanner;

public class MyJavaLong {
    public static void main(String[] args) {
        int[] a;
        a=new int[5];
        System.out.println(a.length);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){

            a[i]=sc.nextInt();
        }
        for(int k:a){
            System.out.println(k);
        }
    }
}
