package ThreadTest;

public class Demo02 {
    static int a=0;
    static boolean aa=true;
    public static void main(String[] args) {
       while(aa){
           add();
               new Thread(
                       ()->{
                           while(aa) {
                               add();
                           }
                       }

               ).start();

       }
        System.out.println(a);
    }
    static synchronized void add()  {
        if ( a < 10000 ) {
            System.out.println(Thread.currentThread().getName()+":"+a);
            a++;
        } else {
            aa = false;
        }
    }
}
