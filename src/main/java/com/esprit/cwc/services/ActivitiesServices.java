package com.esprit.cwc.services;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.cwc.entities.Activity;
import com.esprit.cwc.entities.Employee;


@Remote
public interface ActivitiesServices {
	
	public Activity findById(int id);
	public boolean add(Activity activity);
	public boolean remove(Activity activity);
	public boolean update(Activity activity);
	public boolean assignEmlpoyees(Activity activity, Employee empl);
	public List<Activity> findAll();
}
