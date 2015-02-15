package com.esprit.cwc.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import com.esprit.cwc.entities.Activity;
import com.esprit.cwc.entities.Employee;
import com.esprit.cwc.services.ActivitiesServices;

@Stateless
public class ActivitiesServiceImpl implements ActivitiesServices {
	@PersistenceContext(unitName="cwc")
	EntityManager manager;
	
	@Override
	public boolean add(Activity activity) {
		try {
			manager.persist(activity);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	
		
	}

	@Override
	public boolean remove(Activity activity) {
		try {			
			manager.remove(manager.merge(activity));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
			
		

	@Override
	public boolean update(Activity activity) {
		try {
			manager.merge(activity);//persist, merge and findBy return a manager entity (attached)	
		return true;
		} catch (Exception e) {
			return false;
		}
		
		
	}

	@Override
	public boolean assignEmlpoyees(Activity activity, Employee empl) {
		try {

		      Activity mac=findById(activity.getId());
			  //gestion des 2 bouts (ou par une methode addEmployee(Employee e ){this.employees.add(e);e.getActivities().add(this);} dans l'entité Activity)
		      mac.getEmployees().add(empl);
			  empl.getActivities().add(mac);
			  manager.merge(mac);
			  return true;
			
		} catch (Exception e) {
			return false;
		}
		  
	}

	@Override
	public List<Activity> findAll() {
		Query query = manager.createQuery("SELECT u FROM Activity u");
		return query.getResultList();
	}

	@Override
	public Activity findById(int id) {
		return manager.find(Activity.class,id);
		
	}

}
