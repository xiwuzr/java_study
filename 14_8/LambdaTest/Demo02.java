package LambdaTest;

public class Demo02 {
    public static void main(String[] args) {
        new B01(
                (int a,char b,String c)->{
                    return 0;
                }
        );
    }
}
class B01{
    B03 b03;

    public B01(B03 b03) {
        this.b03 = b03;
    }

}
interface B03{
    int mm (int a,char b,String c);
}
