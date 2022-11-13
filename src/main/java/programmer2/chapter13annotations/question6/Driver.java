package programmer2.chapter13annotations.question6;

public @interface Driver {
    int[] directions();
    String name() default "";
}
