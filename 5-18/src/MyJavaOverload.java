/**
 * 方法的重载
 *
 */
public class MyJavaOverload {
    public static void main(String[] args) {

        int a=5,b=7,c=9;
        System.out.println(add(a,b,c));
        System.out.println("*********************");
        System.out.println(add(a,b));

    }

    public static int add(int a,int b,int c) {
        return a+b+c;
    }
    public static int add(int a,int b) {
        return a+b;
    }
}
