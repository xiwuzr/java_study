package ThreadTest;

public class Demo03 {
    public static void main(String[] args) {
        //new Thread01().start();
        new Thread(new Thread02()).start();
       for(int i=0;i<=10;i++){
           System.out.println("主线程："+i);
       }
    }
}

class Thread01 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("线程2："+i);
        }
    }
}

class Thread02 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("线程3："+i);
        }

    }
}
