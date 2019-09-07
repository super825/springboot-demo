package com.ada.springboot.service;

import org.springframework.stereotype.Service;

import com.ada.springboot.beans.Department;
import com.ada.springboot.beans.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployee() {
        return new Employee(1, "jack", "jack@ada.com", new Department(1001, "软件部"));
    }

}
