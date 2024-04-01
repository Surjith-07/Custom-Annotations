package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})//Applicable for an both method as well as class
@Retention(RetentionPolicy.RUNTIME)//During the Runtime
public @interface CatAnnotation {
}
