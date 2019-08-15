package ThreadTest.ThreadJoinTest;

public class JoinTest {
    public static void main(String[] args) {
        new Thread(
                ()->{
                    for(int i=0;i<100;i++){
                        System.out.println("线程1："+i);
                    }
                }
        ).start();

        Thread th=new Thread(
                ()->{
                    for(int j=0;j<100;j++){
                        System.out.println("线程2："+j);
                    }
                }
        );
        th.start();
        for(int i=0;i<100;i++){
            System.out.println("主线程："+i);
            if(i==20){
                try {
                    th.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
