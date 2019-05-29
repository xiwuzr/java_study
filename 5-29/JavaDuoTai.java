package Java.month5.day29;

public class JavaDuoTai {
    public static void main(String[] args) {
        Father xiaoM=new Father();
        JavaDuoTai cc=new JavaDuoTai();
        cc.doit(xiaoM);
        Child xiaoW=new Child();
        cc.doit(xiaoW);

        Student xiaoL=new Student();
        cc.doit(xiaoL);

    }
    void doit(Father a)
    {
        a.life();
    }
}


class Father
{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void life()
    {
        System.out.println("work!!!!!!!!!!");
    }
}
class Child extends Father
{
    public void life()
    {
        System.out.println("study********");
    }
}

class Student extends Father{
    public void life(){
        System.out.println("Home^^^^^^^");
    }
}
