package com.company.beans;

import java.util.ArrayList;
import java.util.List;

public class ManageEmployee {
	
	private List<Employee> empRecords;
	private static ManageEmployee empReg = null;

	private ManageEmployee(){
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

	public String upDateStudent(Employee std) {
		for (int i = 0; i < empRecords.size(); i++) {
			Employee emp = empRecords.get(i);
			if (emp.getEmpid()==std.getEmpid()) {
				empRecords.set(i, std);// update the new record
				return "Update successful";
			}
		}
		return "Update unsuccessful!";
	}

	public String deleteStudent(int empId) {
		for (int i = 0; i < empRecords.size(); i++) {
			Employee stdn = empRecords.get(i);
			if (stdn.getEmpid()==empId) {
				empRecords.remove(i);// update the new record
				return "Delete successful";
			}
		}
		return "Delete un-successful";
	}

	public List<Employee> getAllEmpRecords() {
		return empRecords;
	}
	
	public Employee getEmpRecordbyId(int empId) {
		for (int i = 0; i < empRecords.size(); i++) {
			Employee emp = empRecords.get(i);
			if (emp.getEmpid()==empId) {				
				return emp;
			}
		}
		return null;
	}

}
