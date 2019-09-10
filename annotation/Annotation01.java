package annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value= ElementType.METHOD)//这个注释只能用于方法定义前
public @interface Annotation01 {
}

