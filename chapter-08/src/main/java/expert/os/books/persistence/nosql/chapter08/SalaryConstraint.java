package expert.os.books.persistence.nosql.chapter08;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = SalaryValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SalaryConstraint {

    String message() default "Invalid salary";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
