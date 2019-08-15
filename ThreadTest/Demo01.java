package ThreadTest;

public class Demo01 {
    public static void main(String[] args) {
        new Thread_A().start();
        new Thread_A().start();
        new Thread_A().start();
    }
}

class Thread_A extends Thread{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
