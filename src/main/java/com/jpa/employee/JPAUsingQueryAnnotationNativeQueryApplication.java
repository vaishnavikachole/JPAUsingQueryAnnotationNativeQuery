package com.jpa.employee;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.employee.entities.Employee;
import com.jpa.employee.service.EmployeeService;

@SpringBootApplication
public class JPAUsingQueryAnnotationNativeQueryApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(JPAUsingQueryAnnotationNativeQueryApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//createEmployee();
		getEmployeeInfoByLastName();
		getEmployeeInfoByFirstNameAndEmail();
		
	}
	private void getEmployeeInfoByLastName()
	{
		List<Employee> employeeList = employeeService.getEmployeeInfoByLastName("ingole");
		employeeList.forEach(System.out::println);
	}
	
	private void createEmployee()
	{
		Employee employee = new Employee("shifali","dixit","shifali98@gmail.com",new Date());
		Employee employeeinfo = employeeService.createEmployee(employee);
		System.out.println(employeeinfo);
	}
	private void getEmployeeInfoByFirstNameAndEmail()
	{
		List<Employee> employees=employeeService.getEmployeeInfoByFirstNameAndEmail("riya","riya2022@gmail.com");
		employees.forEach(System.out::println);
	}
	

}
