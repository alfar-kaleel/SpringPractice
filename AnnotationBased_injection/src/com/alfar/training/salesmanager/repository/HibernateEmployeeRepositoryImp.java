package com.alfar.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alfar.training.salesmanager.model.Employee;


@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImp implements EmployeeRepository {
	
	
	public List<Employee> getAllEmployees(){

	List<Employee> employees = new ArrayList <>();
	
	Employee employee = new Employee();
	
	employee.setEmployeeName("Alfar");
	
	employee.setEmployeeLocation("Badulla");
	
	employees.add(employee);
	
    return employees;
	
	}
	
}
