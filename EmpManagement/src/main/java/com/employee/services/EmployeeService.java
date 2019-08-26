package com.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	public String createEmployee(Employee emp) {
        Employee respEmployee= new Employee();
		if(emp!=null){
		    respEmployee= employeeRepo.save(emp);
            return respEmployee.toString()+" created!";
        }
        return "Employee not created!";
	}

	public Page<Employee> listEmployee(Pageable pageable){
		return employeeRepo.findAll(pageable);
	}

    public Employee returnEmployee(long empid){
        return employeeRepo.findById(empid);
    }
	public long totalEmployee() {
		return employeeRepo.count();
	}

    public String updateEmployee(Employee empl){
        Employee emp= employeeRepo.findById(empl.getEmpId());
        if(emp!=null){
            if(empl.getFirstName()!=null)
                emp.setFirstName(empl.getFirstName());
            if(empl.getLastName()!=null)
                emp.setLastName(empl.getLastName());
            if(empl.getBirthDate()!=null)
                emp.setBirthDate(empl.getBirthDate());
            if(empl.getAddress()!=null)
                emp.setAddress(empl.getAddress());
            if(empl.getBoss()!=null)
                emp.setBoss(empl.getBoss());
            emp.setSalary(empl.getSalary());

            return employeeRepo.save(emp).toString()+" updated!";
        }
        else
            return "Employee doesn't exist!";
    }

    public String deleteEmployee(long id){
         Employee emp= employeeRepo.findById(id);
        if(emp!=null){
            employeeRepo.delete(emp);
            return "Employee with id "+id+" deleted!";
        }
        else return "Employee doesn't exist!";
    }

}
