package com.javatechie.validation.Validation;

import com.javatechie.validation.Dto.Employee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import java.util.Set;

public class EmployeeSalaryValidator implements ConstraintValidator<ValidationSalary,Integer> {

    @Override
    public boolean isValid(Integer salary, ConstraintValidatorContext constraintValidatorContext) {
    if(salary>0)
        return true;

        return false;
    }
}
