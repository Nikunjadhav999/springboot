package com.wipro.springboot.usecase1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springboot.usecase1.entity.Employee;
import com.wipro.springboot.usecase1.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee savedemp=empRepo.save(employee);
		return savedemp;
	}
    
	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		List<Employee> allemps=empRepo.findAll();
		return allemps;
	}

	@Override
	public Employee updateEmpById(int id, Employee employee) {
		// TODO Auto-generated method stub
		Employee emp=empRepo.findById(id).get();
		System.out.println("Current employee details : "+emp);
		emp.setSalary(employee.getSalary());
		emp.setDesiganation(employee.getDesiganation());
		//save emp
		Employee updatedEmp=empRepo.save(emp);
		return updatedEmp;
	}

}
