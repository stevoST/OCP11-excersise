package programmer2.chapter13annotations.question23;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Plumber {
    String value() default "Mario";
}
