package ThreadTest;

public class Demo05 {
    static int a = 0;
    static boolean aa = true;

    public static void main(String[] args) throws InterruptedException {
        Demo05 f = new Demo05();
        Demo05 f1 = new Demo05();
        Runnable rb= () -> {

            for (int k = 0; k < 100; k++) {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
////                }
//                synchronized (f){
//                    a++;
//                    System.out.println(Thread.currentThread().getName() + ":" + a);
//                }
                a++;


            }
        };
        for (int i = 0; i < 100; i++)
            new Thread(rb).start();

        Thread.sleep(1000);/*保证所有线程执行完*/
        System.out.println(a + "***************************************\n");
    }


}



