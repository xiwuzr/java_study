package ThreadTest;

public class Demo06 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
        Thread th = new Thread(() -> {
            System.out.println("副线程");
        });
        th.setPriority(10);
        System.out.println(th .getPriority());

    }
}
