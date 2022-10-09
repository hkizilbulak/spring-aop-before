package com.hkizilbulak.springaopbefore.controller;

import com.hkizilbulak.springaopbefore.entity.Employee;
import com.hkizilbulak.springaopbefore.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.save(employee);
        return ResponseEntity.ok(savedEmployee);
    }
}
