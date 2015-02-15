package com.esprit.cwc.services;

import javax.ejb.Remote;

import com.esprit.cwc.entities.Employee;


@Remote
public interface EmployeesServices {
	public Employee findById(Employee emp);
}
