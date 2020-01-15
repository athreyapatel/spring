package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Employee;

public interface EmployeeDao {
	void addEmployee(Employee c);
	Employee getEmployee(int id);
	List<Employee> getEmployees();
}