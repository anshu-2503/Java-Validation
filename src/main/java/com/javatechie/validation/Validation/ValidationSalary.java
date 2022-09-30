package com.javatechie.validation.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Min;
import java.lang.annotation.*;


@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeSalaryValidator.class)
public @interface ValidationSalary {
    String message() default "invalid number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
