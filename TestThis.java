public class TestThis {
    int age;
   int Height;
    TestThis(int a)
    {
        age=a;
    }
    TestThis(int a,int b)
    {
        this(a);
        TestThis xx=new TestThis();
        //xx.TestThis(a);

        Height=b;
    }

    TestThis(){}

    public static void main(String[] args) {

        TestThis XiaoW=new TestThis(1,4);
        TestThis XiaoZ=new TestThis(8,77);
//       XiaoW.age=8;
//       XiaoW.Height=99;
//        XiaoZ.age=9;
//        XiaoZ.Height=8;
        System.out.println("W "+XiaoW.age);


        System.out.println(XiaoZ.Height);



       // XiaoW.Print();

    }
    void Print()
    {
        System.out.println(age);
        System.out.println(Height);
        //System.out.println(c);
    }
}
