package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.constants.CommonConstants;
import com.spring.model.Employee;


@RequestMapping(CommonConstants.COMMON_USER_URL)
@RestController
public class UserController {

	@RequestMapping(value= "/", method = RequestMethod.GET)
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"tanu","shri","tanu@gmail.com"));
		return employeesList;
    }
}
