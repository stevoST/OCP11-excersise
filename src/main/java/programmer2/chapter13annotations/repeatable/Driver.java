package programmer2.chapter13annotations.repeatable;

import java.lang.annotation.Repeatable;

@Repeatable(Drivers.class)
public @interface Driver {
    int[] directions();
    String name() default "";
}
