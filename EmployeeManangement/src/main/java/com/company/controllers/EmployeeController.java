package com.company.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.beans.Employee;
import com.company.beans.ManageEmployee;

@Controller
public class EmployeeController {
	
	@RequestMapping(method = RequestMethod.GET, value="/list/AllEmployees")
	
	@ResponseBody
	  public List<Employee> getAllEmpRecords() {
	  return ManageEmployee.getInstance().getAllEmpRecords();
	  }
	
	@RequestMapping(method = RequestMethod.POST, value="/register/employee")
	
	@ResponseBody
	  public Employee registerEmployee(@RequestBody Employee employee) {
	  //System.out.println("Start registerEmployee");	         
	  ManageEmployee.getInstance().add(employee);
	  //System.out.println("Employee registration successful!");	
	  Employee emp= new Employee();
	  emp.setName(employee.getName());
	  emp.setDept(employee.getDept());
	  emp.setEmpid(employee.getEmpid());
	  emp.setStatus("Registered");
	  return emp;
	}
}
