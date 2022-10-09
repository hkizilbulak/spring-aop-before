package com.hkizilbulak.springaopbefore.service;

import com.hkizilbulak.springaopbefore.dao.EmployeeDao;
import com.hkizilbulak.springaopbefore.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }
}
