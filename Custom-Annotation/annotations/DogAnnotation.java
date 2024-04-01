package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD})// Applicable only for the feilds
@Retention(RetentionPolicy.RUNTIME)
public @interface DogAnnotation {
}
