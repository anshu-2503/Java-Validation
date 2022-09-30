package com.javatechie.validation.Validation;

import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)
public @interface ValidationEmployeeType {

    public String message() default "Invalid EmployeeType: It should be either Permanent or Vendor";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
