package com.alfar.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.alfar.training.salesmanager.model.Employee;




@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImp implements EmployeeRepository {
	
	
	@Value("${name}")
	private String Name;
	
	@Value("${city}")
	private String Location;
	
	
	public List<Employee> getAllEmployees(){

	List<Employee> employees = new ArrayList <>();
	
	Employee employee = new Employee();
	
	employee.setEmployeeName(Name);
	
	employee.setEmployeeLocation(Location);
	
	employees.add(employee);
	
    return employees;
	
	}
	
}
