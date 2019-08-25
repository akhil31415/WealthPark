package com.employee.repo;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.employee.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	List<Employee> findAll() throws DataAccessException; 

	//Employee findById(long id)throws DataAccessException;

	Employee save(Employee employee) throws DataAccessException;
	
	//void delete(long id) throws DataAccessException;
	
	//Page<Employee> findAll(Pageable pageable) throws DataAccessException;

}
