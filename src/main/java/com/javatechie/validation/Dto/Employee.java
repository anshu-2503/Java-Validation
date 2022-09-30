package com.javatechie.validation.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.javatechie.validation.Validation.EmployeeDOBValidator;
import com.javatechie.validation.Validation.ValidationDOB;
import com.javatechie.validation.Validation.ValidationEmployeeType;
import com.javatechie.validation.Validation.ValidationSalary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {
    private int Id;
    @NotBlank(message = "firstname can't be empty")
    private String firstName;
    @NotBlank(message = "lastname can't be empty")
    private String lastName;
    @Past(message="start shouldn't be before current date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;
    @ValidationDOB
    //@JsonDeserialize(using= EmployeeDOBValidator.JsonDateDeserializer.class)
    private LocalDate dob;
    @NotEmpty(message = "department shouldn't be null")
    @NotNull(message = "department shouldn't be empty")
    private String dept;
    @Email(message = "invalid email id")
    private String email;
    @ValidationSalary
    private int salary;
    @ValidationEmployeeType
    private String employeeType;
}
