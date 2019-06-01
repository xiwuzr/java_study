package Java.month6.day1;

public class ExtendsTest {
    public static void main(String[] args) {
        Child xiao=new Child(9,9,9);
        xiao.age=100;
        System.out.println("xiao.age");
        //Father da=new Child();
        xiao.pr();
    }
}


class Father
{
    Father(int cc,int kk)
    {
        this.cc=cc;
        this.kk=kk;
    }
    Father()
    {}
    private int a;
    int cc;
    int kk;

    private void pr()
    {
        System.out.println("private void pr()");

    }
}
class Child extends Father{
    Child(int cc,int age,int kk)
    {
        super(cc,kk);
    }

    int age;
    int cc=5;
     void pr()
     {
         System.out.println(super.cc);
     }
}