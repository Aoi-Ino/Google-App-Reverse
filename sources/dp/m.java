package dp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface m {
    String[] attributes() default {};

    String[] elements() default {};
}
