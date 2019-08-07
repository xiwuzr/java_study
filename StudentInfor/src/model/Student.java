package model;

public class Student {
    private String id;
    private String pwd;
    private String name;
    private int math;
    private int English;
    private int sum;

    public Student(String id, String name,int math, int english) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.math = math;
        English = english;
        sum=math+English;
    }

    public Student(String id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public Student() {
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return English;
    }

    public int getSum() {
        return sum;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEnglish(int english) {
        English = english;
    }

    //总成绩
    public void setSum(int sum) {
        this.sum = sum;
    }
}
