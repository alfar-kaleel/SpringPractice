package com.alfar.training.salesmanager.repository;

import java.util.List;

import com.alfar.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}