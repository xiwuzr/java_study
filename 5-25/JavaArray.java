package Java.month5.day25;

public class JavaArray {
    public static void main(String[] args) {
        prin(1,3,4,2,3,3,3,6,7,5,6);

    }
    static void prin(int ... aaa)
    {
        for(int d:aaa)
        {
            System.out.println(d);
        }
    }
}
