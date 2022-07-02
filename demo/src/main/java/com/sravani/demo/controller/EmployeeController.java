package com.sravani.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sravani.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/demo")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"sravani","y","srrrravaniy@gmail.com"));
		return employeesList;
    }

}
