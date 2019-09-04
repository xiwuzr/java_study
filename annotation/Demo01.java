package annotation;

import java.util.*;

//修饰类或者方法，表示类或方法过时
@Deprecated
public class Demo01 extends Object {
    //只能修饰重写方法
    @Override
    public String toString(){
        return "";
    }
    @Deprecated
    public  void ccc()
    {

    }


}

@SuppressWarnings(value="unchecked")
class test01{
    public static void main(String[] args) {
        //过时的方法
        Demo01 a=new Demo01();
        a.ccc();
        ArrayList<Demo01> list=new ArrayList();
        //list.add(25);
    }
}
