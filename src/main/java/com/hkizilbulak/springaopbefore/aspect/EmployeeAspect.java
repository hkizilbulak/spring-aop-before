package com.hkizilbulak.springaopbefore.aspect;

import com.hkizilbulak.springaopbefore.entity.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {

    @Before(value = "execution(* com.hkizilbulak.springaopbefore.service.EmployeeService.*(..)) && args(employee)")
    public void beforeAdvice(JoinPoint joinPoint, Employee employee) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with first name - " + employee.getFirstName() + ", second name - " + employee.getLastName() + " and id - " + employee.getId());
    }
}
