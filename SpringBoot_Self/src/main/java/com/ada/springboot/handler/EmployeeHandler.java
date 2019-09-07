package com.ada.springboot.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.springboot.beans.Department;
import com.ada.springboot.beans.Employee;
import com.ada.springboot.service.EmployeeService;

/**
 * @RestController = @Controller + @ResponseBody
 */
@RestController
//@Controller
public class EmployeeHandler {
    
    @Autowired
    private EmployeeService employeeService;

//    @ResponseBody
    @RequestMapping("/getEmp")
    public Object getEmployee() {
        Map<String, Object> map = new HashMap<>();
        Employee employee = employeeService.getEmployee();
        map.put("emp", employee);
        return map;
    }
}
