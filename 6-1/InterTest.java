package Java.month6.day1;

public class InterTest {
    public static void main(String[] args) {
        Outer.Inter inter=new Outer().new Inter();
        inter.pr();
        System.out.println(inter.age);
    }


}

class Outer
{
    int age;
    class Inter
    {
        int age=55;
        void pr()
        {
            int age=30;
            System.out.println(age);
        }
    }
}
