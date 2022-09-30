package com.javatechie.validation.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeDOBValidator.class)
public @interface ValidationDOB {
    public String message() default "Invalid DOB: It should be before 2000";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
