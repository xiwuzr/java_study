import java.util.Scanner;

public class MyJavaFactorial {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(fact(a));

    }
    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return fact(n-1)*n;
    }
}
