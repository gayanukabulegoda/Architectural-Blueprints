package lk.ijse.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @GetMapping
    public String getEmployee() {
        return "Employee: employee-1, employee-2, employee-3";
    }
}