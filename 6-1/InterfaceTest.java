package Java.month6.day1;

public class InterfaceTest {
    public static void main(String[] args) {
        Stu.St  xiaoW;


    }
}

class Stu
{
    int age=10;
     class St
    {
        int age=20;
        void kk()
        {
            int age=30;
            System.out.println(age+this.age+Stu.this.age);
        }
    }
}
