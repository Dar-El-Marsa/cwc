package com.esprit.cwc.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.esprit.cwc.entities.Employee;

@Stateless
public class EmployeesServicesImpl implements EmployeesServices {

	@PersistenceContext(unitName="cwc")
	EntityManager manager;
	
	@Override
	public Employee findById(Employee emp) {
		return manager.find(Employee.class, emp.getId());
		
	}

}
