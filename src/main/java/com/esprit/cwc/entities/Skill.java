package com.esprit.cwc.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Skill
 *
 */
@Entity

public class Skill implements Serializable {

	
	private int id;
	private Skills skill;
	private int level;
	private static final long serialVersionUID = 1L;
	
	private Collection<Employee> employees;
	private Collection<TrainingSession> tSessions;
	
	public Skill() {
		super();
	}   
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}  
	
	
	public int getLevel() {return this.level;}
	public void setLevel(int level) {this.level = level;}
	
	
	public Skills getSkill() {return skill;}
	public void setSkill(Skills skill) {this.skill = skill;}
	
	@ManyToMany
	public Collection<Employee> getEmployees() {return employees;}
	public void setEmployees(Collection<Employee> employees) {this.employees = employees;}
	
	@ManyToMany
	public Collection<TrainingSession> gettSessions() {return tSessions;}
	public void settSessions(Collection<TrainingSession> tSessions) {this.tSessions = tSessions;} 
	
	
}
