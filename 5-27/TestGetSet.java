package Java.month5.day27;

public class TestGetSet {
    public static void main(String[] args) {
        Student xiaoWang=new Student();
        xiaoWang.setAge(90);
        System.out.println(xiaoWang.getAge());
    }
}

class Student
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
}
