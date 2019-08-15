package ThreadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo04 {
    public static void main(String[] args) {
        FutureTask<Integer> task=new FutureTask<Integer>(
                ()->{
                    int i=0;
                    for(;i<=10;i++){
                        System.out.println("线程4:"+i);
                    }
                   return i;
                }
        );
        new Thread(task).start();
        for(int i=0;i<=10;i++){
            System.out.println("主线程:"+i);
        }
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
