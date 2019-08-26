package com.employee.controller;

import com.employee.domain.Employee;
import com.employee.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController{

@Autowired
EmployeeService service;


@RequestMapping(method = RequestMethod.GET, value="/listall" )
public Page<Employee> getAllEmployees(Pageable pageable) {
    return service.listEmployee(pageable);
  }

@RequestMapping(method = RequestMethod.GET, value="/list/{id}" )
public Employee getTheEmployees(@PathVariable(value = "id") long empId) {
    return service.returnEmployee(empId);
  }

@RequestMapping(method = RequestMethod.POST, value="/create")
public String createNewEmployee(@RequestBody Employee emp) {
  return service.createEmployee(emp);
  }

@RequestMapping(method = RequestMethod.PUT, value="/update/{id}")
public String updateEmployee(@PathVariable(value = "id") long empId, @RequestBody Employee emp){
    if(emp!=null){
    emp.setEmpNo(empId);
    }
    return service.updateEmployee(emp);
  }

@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
public String deleteEmployee(@PathVariable(value = "id") long empId){
    return service.deleteEmployee(empId);
    }
}