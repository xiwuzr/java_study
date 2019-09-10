package annotation;

public @interface Annotation03 {
    String value();
    int id() default -1;
}
