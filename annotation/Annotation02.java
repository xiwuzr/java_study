package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.TYPE})//这个注释只能用于方法或类的定义前
public @interface Annotation02 {
}
