
/**
 *
 * 引用类型数组
 * 初理解
 */
class Person     //类似以结构体？？？
{
    public int age;
    public double height;
    public void info()
    {
        System.out.println("我的年龄是："+age+",我的身高是："+height);
    }
}

public class Reference {
    public static void main(String[] args) {
        Person[] students=new Person[2];
        Person Zhang=new Person();
        Zhang.age=15;
        Zhang.height=158;
        Person lee =new Person();
        lee.age=16;
        lee.height=161;
        students[0]=Zhang;
        students[1]=lee;
        Zhang.info();
        students[1].info();
        lee.info();
        students[0].info();

    }

}
