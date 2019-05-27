package Java.month5.day27;

import java.sql.SQLOutput;

public class TestSuper {
    public static void main(String[] args) {
        FatherS wang=new FatherS();
        ChildS xiaoW=new ChildS();
        xiaoW.f();
//        wang.name="sssss";
//        System.out.println(wang.name);
//        xiaoW.name="xxxxx";
//        System.out.println(xiaoW.name);
//        System.out.println(wang.name);
    }
}

class FatherS
{
     String name;
    void f()
    {
        name="ssss";
        System.out.println(name);
    }
}

class ChildS extends FatherS
{
    String name;
     int age;
    void f()
    {
        super.f();
        this.name="kkk";
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
