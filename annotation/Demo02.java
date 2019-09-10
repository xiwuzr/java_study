package annotation;
//@Annotation01只能修饰方法
public class Demo02 {
    @Annotation01
    void test(){

    }
}
@Annotation02
class Demo02_2{
    @Annotation02
    void test(){

    }
}

@Annotation03(value="",id=5)
class Semo02_3{

}