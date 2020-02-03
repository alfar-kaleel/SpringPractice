package com.alfar.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfar.training.salesmanager.model.Employee;
import com.alfar.training.salesmanager.repository.EmployeeRepository;
import com.alfar.training.salesmanager.repository.HibernateEmployeeRepositoryImp;


@Service("employeeService")
public class EmployeeServiceImp implements EmployeeService {
	
	//EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImp();
	
	
	EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImp() {
		
		System.out.println("Default constructor is executed");
	}
	
	
	
	@Autowired
	public EmployeeServiceImp (EmployeeRepository employeeRepository) {
		
		System.out.println("Overloaded constructor is executed");
		this.employeeRepository = employeeRepository;
		
	}
	
	
	public void setEmployeeRepository(EmployeeRepository emprep) {
		
		System.out.println("setter is executed");
		this.employeeRepository = emprep;
		
	}
	
	public List<Employee> getAllEmployees(){
		
		
		
		return employeeRepository.getAllEmployees();
	}

}
