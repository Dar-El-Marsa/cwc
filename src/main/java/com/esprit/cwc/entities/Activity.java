package com.esprit.cwc.entities;


import java.io.File;
import java.io.Serializable;
import java.lang.String;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Activity
 *
 */
@Entity
@Table(name="t_activity")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Activity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String description;
	private String type;
	private File attachement;
	private Date startDate;
	private Date endDate;
	
	private Collection<Employee> employees;
	

	public Activity() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}  
	
	
	public String getTitle() {return this.title;}
	public void setTitle(String title) {this.title = title;}   
	
	
	public String getDescription() {return this.description;}
	public void setDescription(String description) {this.description = description;}   
	
	
	public File getAttachement() {return this.attachement;}
	public void setAttachement(File attachement) {this.attachement = attachement;}
	
	
	public Date getStartDate() {return this.startDate;}
	public void setStartDate(Date startDate) {this.startDate = startDate;}   
	
	
	public Date getEndDate() {return this.endDate;}
	public void setEndDate(Date endDate) {this.endDate = endDate;}
	
	
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	
	@ManyToMany
	public Collection<Employee> getEmployees() {return employees;}
	public void setEmployees(Collection<Employee> employees) {this.employees = employees;}
  
	
}