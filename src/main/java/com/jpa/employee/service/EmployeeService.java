package com.jpa.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.employee.dao.EmployeeDao;
import com.jpa.employee.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	
	public Employee createEmployee(Employee employee)
	{
		return employeeDao.save(employee);
	}
	public List<Employee> getEmployeeInfoByLastName(String lastName)
	{ 
		return employeeDao.findByLastNameEmployeeInfo(lastName);
	}
	public List<Employee> getEmployeeInfoByFirstNameAndEmail(String firstName,String email)
	{
		return employeeDao.findByFirstNameAndEmail(firstName,email);
	}
}
