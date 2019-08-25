package com.company.beans;

import java.util.ArrayList;
import java.util.List;

public class ManageEmployee {

	private List<Employee> empRecords;
	private static ManageEmployee empReg = null;

	private ManageEmployee() {
		empRecords = new ArrayList<Employee>();
	}

	public static ManageEmployee getInstance() {
		if (empReg == null) {
			empReg = new ManageEmployee();
			return empReg;
		} else {
			return empReg;
		}
	}

	public String add(Employee emp) {
		empRecords.add(emp);
		return "Employee Added";
	}

	public String upDateEmployee(Employee employee) {
		boolean flag = false;
		int i;
		for (i = 0; i < empRecords.size(); i++) {
			Employee emp = empRecords.get(i);

			if (employee.getLastname() != null && employee.getLastname() != null) {
				if (employee.getLastname() == emp.getLastname() && employee.getLastname() == emp.getLastname()) {
					flag = true;
					break;
				}
			}

			if (flag) {
				empRecords.set(i, employee);
				return "Update successful";
			}
			return "Update unsuccessful!";
		}
	}

	public String deleteEmployee(Employee employee) {
		boolean flag = false;
		int i;
		for (i = 0; i < empRecords.size(); i++) {
			Employee emp = empRecords.get(i);

			if (employee.getLastname() != null && employee.getLastname() != null) {
				if (employee.getLastname() == emp.getLastname() && employee.getLastname() == emp.getLastname()) {
					flag = true;
					break;
				}
			}
		}
		return "Delete un-successful";
	}

	public List<Employee> getAllEmpRecords() {
		return empRecords;
	}

	public Employee getTheEmployee(String empId) {
		for (int i = 0; i < empRecords.size(); i++) {
			Employee emp = empRecords.get(i);
			if (emp.getEmpid() == empId) {
				return emp;
			}
		}
		return null;
	}

}
