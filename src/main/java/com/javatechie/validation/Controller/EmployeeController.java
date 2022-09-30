package com.javatechie.validation.Controller;

import com.javatechie.validation.Dto.Employee;
import com.javatechie.validation.Service.EmployeeService;
import com.javatechie.validation.ValidationApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
public class EmployeeController {
    static Logger logger= LogManager.getLogger(ValidationApplication.class);
    private EmployeeService service;

    @GetMapping("/tester")
    public String testing(){
        logger.info("Controller is executing.......");
        return "Logging is done!!!";
    }
    @PostMapping("/employees")
    public Employee addNewEmployeeToSystem(@RequestBody @Valid Employee employee){

        return service.addNewEmployee(employee);
    }

    @PostMapping("/empDob")
    public Employee employeeDOB(@RequestBody @Valid Employee employee){

        return service.employeedob(employee);
    }
    @PostMapping("/empSalary")
    public Employee employeeSalary(@RequestBody @Valid Employee employee){

        return service.employeedob(employee);
    }
}
