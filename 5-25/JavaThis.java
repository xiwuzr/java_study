package Java.month5.day25;

public class JavaThis {
    public static void main(String[] args) {
        JavaThis kk=new JavaThis();
        kk.jump();
        kk.run();
        Students w=new Students(54,"wjh");
        System.out.println(w.age);
        kk.hh();
    }
    void jump()
    {
        System.out.println("JUMPPP");
    }
    void run()
    {
        jump();
        System.out.println("runnnnn");
    }
    void hh()
    {
        System.out.println("hhhh");
    }
}
class Students
{
    int age;
    String Name;


    Students(int age,String c)
    {
        this.age=age;
        Name=c;
    }
}
