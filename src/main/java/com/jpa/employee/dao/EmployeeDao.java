package com.jpa.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.employee.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>
{
	@Query(value="select * from employee_table where last_name=?1",nativeQuery = true)
	List<Employee> findByLastNameEmployeeInfo(String lastName);

	@Query(value="select * from employee_table where first_name=?1 and employee_email_id=?2",nativeQuery = true)
	List<Employee> findByFirstNameAndEmail(String firstName, String email);
}
