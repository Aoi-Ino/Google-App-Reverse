package y7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    int objectTypeIndication() default -1;

    int[] tags();
}
