package com.employee.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.domain.Employee;
import com.employee.repo.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Employee createEmployee(String firstName, String lastName, Date birthDate, String address, String boss,
			double salary) {

		Employee emp = new Employee();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setAddress(address);
		emp.setBirthDate(birthDate);
		emp.setBoss(boss);
		emp.setSalary(salary);
		return employeeRepo.save(emp);
	}
	
	public Iterable<Employee> listEmployee(){
		return employeeRepo.findAll();
	}
	
	public long totalEmployee() {
		return employeeRepo.count();
	}

}
