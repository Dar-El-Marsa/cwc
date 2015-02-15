package com.esprit.cwc.entities;

import java.io.File;
import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TrainingSession
 *
 */
@Entity
@Table(name="t_trainingSession")

public class TrainingSession implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private int id;
	private Trainer trainer;
	private String title;
	private String area;
	private String description;
	private File attachment;
	
	private Collection<Skill>Skills;
	private Collection<Employee>employees;
	
	
	public TrainingSession() {super();}  
	
	
	@ManyToMany
	public Collection<Employee> getEmployees() {return employees;}
	public void setEmployees(Collection<Employee> employees) {this.employees = employees;}
	
	
	@ManyToMany(mappedBy="tSessions")
	public Collection<Skill> getSkills() {return Skills;}
	public void setSkills(Collection<Skill> skills) {Skills = skills;}
	 
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}   
	
	@ManyToOne
	public Trainer getTrainer() {return this.trainer;}
	public void setTrainer(Trainer trainer) {this.trainer = trainer;}   
	
	public String getTitle() {return this.title;}
	public void setTitle(String title) {this.title = title;}   
	
	public String getArea() {return this.area;}
	public void setArea(String area) {this.area = area;}   
	
	public String getDescription() {return this.description;}
	public void setDescription(String description) {this.description = description;}   
	
	public File getAttachment() {return this.attachment;}
	public void setAttachment(File attachment) {this.attachment = attachment;}   
   
}