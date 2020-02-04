package com.alfar.training.salesmanager.service;

import java.util.List;

import com.alfar.training.salesmanager.model.Employee;
import com.alfar.training.salesmanager.repository.EmployeeRepository;
import com.alfar.training.salesmanager.repository.HibernateEmployeeRepositoryImp;

public class EmployeeServiceImp implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImp();
	
	EmployeeRepository employeeRepository;
	
	
	
	public EmployeeServiceImp (EmployeeRepository employeeRepository) {
		
		
		this.employeeRepository = employeeRepository;
		
	}
	
	public void setEmployeeRepository(EmployeeRepository emprep) {
		
		this.employeeRepository = emprep;
		
	}
	
	public List<Employee> getAllEmployees(){
		
		
		
		return employeeRepository.getAllEmployees();
	}

}
