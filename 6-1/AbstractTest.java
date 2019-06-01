package Java.month6.day1;

import java.util.Scanner;

public class AbstractTest {
    void test(Men a){
        a.life();
    }


    public static void main(String[] args){

        Men xiaoM=new Student();
        AbstractTest tt=new AbstractTest();
        Scanner cin=new Scanner(System.in);
        ((Student) xiaoM).setAge(cin.nextInt());
        tt.test(xiaoM);
        System.out.println("*******************");
        Men xiaoZ=new Teacher();
        ((Teacher) xiaoZ).setAge(cin.nextInt());
        tt.test(xiaoZ);

        System.out.println("小张老师的年龄是："+((Teacher)xiaoZ).getAge());
        System.out.println("小明同学的年龄是："+((Student)xiaoM).getAge());
    }

}

abstract class Men
{
    int AGE_MAX=100;
    abstract void life();
    static void pp()
    {
        System.out.println("222");
    }
}

class Student extends Men
{

    private int age;
    @Override
    void life(){
        System.out.println("STUDY!!!");
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age){
        if(age>=AGE_MAX)
        {
            System.out.println("年龄输入错误");
            return;
        }
        this.age=age;
    }
}

class Teacher extends Men
{
    @Override
    void life()
    {
        System.out.println("SPEEK!!!!");
    }
    private int age;

    public void setAge(int age)
    {
        if(age>=AGE_MAX)
        {
            System.out.println("年龄输入错误");
            return;
        }
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

