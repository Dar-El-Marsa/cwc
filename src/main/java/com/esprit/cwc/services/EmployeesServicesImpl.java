package com.esprit.cwc.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import com.esprit.cwc.entities.Employee;

@Stateless
public class EmployeesServicesImpl implements EmployeesServices {

	@PersistenceContext(unitName="cwc")
	EntityManager manager;
	
	@Override
	public Employee findById(int id) {
		return manager.find(Employee.class, id);
		
	}

	@Override
	public boolean add(Employee employee) {
		try {
			manager.persist(employee);
			return true;
		} catch (Exception e) {
			return false;
		}	
	}

	@Override
	public boolean remove(Employee employee) {
		try {
			manager.remove(manager.merge(employee));
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean update(Employee employee) {
		try {
			manager.merge(employee);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public List<Employee> findAll() {
		Query query = manager.createQuery("select u from Employee u");
		return query.getResultList();
	}

}
