package com.alfar.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfar.training.salesmanager.model.Employee;
import com.alfar.training.salesmanager.repository.EmployeeRepository;
import com.alfar.training.salesmanager.repository.HibernateEmployeeRepositoryImp;



 public class EmployeeServiceImp implements EmployeeService {
	
	
	
	
	EmployeeRepository employeeRepository;
	
	/*
	public EmployeeServiceImp() {
		
		System.out.println("Default constructor executed");
	}
	*/
	
	
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		
		
		this.employeeRepository = employeeRepository;
		System.out.println("Overload constructor executed");
	}
	
	
	
	public EmployeeRepository getEmployeeRepository() {
		
		
		return employeeRepository;
	}
	

	public void setEmployeeRepository(EmployeeRepository emprep) {
		
		
		this.employeeRepository = emprep;
		System.out.println("Setter Exceuted");
		
	}
	
	
	
	public List<Employee> getAllEmployees(){
		
		
		
		return employeeRepository.getAllEmployees();
	}

}
