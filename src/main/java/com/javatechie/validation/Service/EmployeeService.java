package com.javatechie.validation.Service;

import com.javatechie.validation.Dto.Employee;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
public class EmployeeService {

    public Employee addNewEmployee(Employee employee) {
        employee.setId(new Random().nextInt(68736432));
        return employee;
    }

    public Employee employeedob(Employee employee) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "16/08/1997";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        employee.setDob(localDate);
        return employee;
    }
    public Employee employeeSalary(Employee employee){
        return employee;
    }
}


