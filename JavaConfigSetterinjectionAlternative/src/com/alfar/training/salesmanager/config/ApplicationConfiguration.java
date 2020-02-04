package com.alfar.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.alfar.training.salesmanager.repository.EmployeeRepository;
import com.alfar.training.salesmanager.repository.HibernateEmployeeRepositoryImp;
import com.alfar.training.salesmanager.service.EmployeeService;
import com.alfar.training.salesmanager.service.EmployeeServiceImp;

@Configuration
@ComponentScan("com.alfar")
public class ApplicationConfiguration {
	
	
	@Bean(name = "employeeService")
	public EmployeeService getEmployeeservice() {
		
		EmployeeServiceImp employeeService = new EmployeeServiceImp();
		
		//employeeService.setEmployeeRepository(getEmployeeRepository());
		
		return employeeService;
		
	}
	
	/*
	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository(){
			
		
		return new HibernateEmployeeRepositoryImp();
			
			
			
	}
	
	*/
	
	

}
