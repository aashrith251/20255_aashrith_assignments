package com.sonata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.DAOimpl.EmployeeImpl;
import com.sonata.Model.Employee;

import java.util.List;

@RestController
public class JdbcController {
	@Autowired
	private EmployeeImpl empService;
	@GetMapping(value="/emp")
	public List<Employee>getEmp()
	{
		return empService.getAllEmployee();
	}
}
