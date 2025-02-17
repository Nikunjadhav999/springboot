package com.wipro.springboot.usecase1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.springboot.usecase1.entity.Employee;
@Service
public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmps();
	Employee updateEmpById(int id,Employee employee);

}
