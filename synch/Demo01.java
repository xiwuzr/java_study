package synch;

public class Demo01 {
    public static void main(String[] args) {
        A a=new A();
        A b=new A();
        new Thread(
                ()->{
                    synchronized (a){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (b){

                        }
                    }
                }
        ).start();
        new Thread(
                ()->{
                    synchronized (b){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (a){

                        }
                    }
                }
        ).start();
    }
}
class A{

}
