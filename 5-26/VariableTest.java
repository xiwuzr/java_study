package Java.month5.day26;

/**
 *
 * variable测试
 * 王佳豪
 */
public class VariableTest {
    public static void main(String[] args) {

        Student xiaoW=new Student();
        Student.name="sss";
        System.out.println(xiaoW.name+xiaoW.age);
        System.out.println(Student.name);
        Student.print();
        xiaoW.print();

    }

}

class Student
{
   int age;
   //可以使用类名调用，可以使用对象调用。
   static String name;
   static void print()
   {
       System.out.println("松溪");
   }
}

