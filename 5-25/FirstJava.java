package Java.month5.day25;

/**
 *
 * 类与对象与方法
 * @王佳豪
 */
public class FirstJava {
    public static void main(String[] args) {
        Student xiaoWang;
        xiaoWang=new Student();
        xiaoWang.life();
        Person xiaoLi=new Person();
        xiaoLi.life();
        print("wang");

    }
    static void print(String string)
    {
        System.out.println(string);
    }

}

class Person{
    int age;
    int heigh;
    String name;
    void life()
    {
        System.out.println("睡觉");
    }
}
class Student extends Person{
    String sex;
    void life()
    {
        System.out.println("学习");
    }

}
