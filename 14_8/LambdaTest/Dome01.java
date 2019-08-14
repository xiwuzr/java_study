package LambdaTest;

/**
 * 无返回类型的
 */

public class Dome01 {
    public static void main(String[] args) {
        new A01(
                new A03() {
                    @Override
                    public void mm() {
                        System.out.println("fffff");

                    }
                }
        );
        new A01(
                () -> {
                    System.out.println("fffff");
                }
        );

        new A03() {
            @Override
            public void mm() {
                System.out.println("fffff");
            }
        };

    }
}

class A01{
    A03 a;

    public A01(A03 a) {
        this.a = a;
    }
    void kk(){
        a.mm();
    }


}
class A02 implements A03{
    @Override
    public void mm() {
        System.out.println("mmm");

    }
}

interface A03{
    void mm();
}
