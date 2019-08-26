package com.employee.repo;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.employee.domain.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{

	Employee findById(long id)throws DataAccessException;

	Page<Employee> findAll(Pageable pageable) throws DataAccessException;

	Page<Employee> findByFirstName(@Param("fname")String name, Pageable pageable) throws DataAccessException;

}
