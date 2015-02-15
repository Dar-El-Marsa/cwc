package com.esprit.cwc.services;

import java.util.List;

import javax.ejb.Remote;
import com.esprit.cwc.entities.Employee;


@Remote
public interface EmployeesServices {
	public Employee findById(int id);
	public boolean add(Employee employee);
	public boolean remove(Employee employee);
	public boolean update(Employee employee);
	public List<Employee> findAll();
}
