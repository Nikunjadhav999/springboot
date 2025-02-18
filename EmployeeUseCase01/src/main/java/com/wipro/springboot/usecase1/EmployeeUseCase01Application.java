package com.wipro.springboot.usecase1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.springboot.usecase1.entity.Employee;
import com.wipro.springboot.usecase1.service.EmployeeService;

@SpringBootApplication
public class EmployeeUseCase01Application implements CommandLineRunner{

	@Autowired
	EmployeeService employeeService;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeUseCase01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.setDesiganation("Developer");
		emp1.setName("Nikunj");
		emp1.setSalary(27000);
		
		//save employee emp
		Employee savedemp1=employeeService.saveEmployee(emp1);
		System.out.println("saved emp details : "+savedemp1);
		
		Employee emp2=new Employee();
		emp2.setDesiganation("Tester");
		emp2.setName("Ram");
		emp2.setSalary(56000);
		
		//save employee emp
		Employee savedemp2=employeeService.saveEmployee(emp2);
		System.out.println("saved emp details : "+savedemp2);
		
		//get employee details
		List<Employee> allempList=employeeService.getAllEmps();	
		System.out.println("All employee details Fetched : ");
		for(Employee e:allempList) {
			System.out.println(e);
		}
		//update emp
		Employee newEmp=new Employee();
		newEmp.setDesiganation("Tester");
		newEmp.setSalary(45000);

		Employee updatedEmp=employeeService.updateEmpById(1, newEmp);
		System.out.println("Update employee details : "+updatedEmp);
		
	}

}
