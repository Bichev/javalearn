package skillport.javasix.annotatiohallo;

import java.lang.annotation.*;

@Documented //generated in JavaDoc
@Inherited
@Target ({ElementType.METHOD, ElementType.CONSTRUCTOR})
//@Retention(RetentionPolicy.RUNTIME)
public @interface Complete {
	boolean isComplete() default false;
	int value() default 5;

}


