package Java.month5.day29;

public class JavaArray {
    public static void main(String[] args) {
        Man[] arrS={
                new Man(12,"xiaoW"),
                new Man(13,"xiaoL")
        };
        System.out.println(arrS[0].getAge());
    }

}

class Man
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

    public Man(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

}
