package com.esprit.cwc.entities;

import com.esprit.cwc.entities.Task;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TaskSkills
 *
 */
@Entity
@Table(name="t_taskSkills")

public class TaskSkills implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private Skill skill;
	private int requiredLevel;
	private Collection<Task> tasks;

	public TaskSkills() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
   
	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}   
	public int getRequiredLevel() {
		return this.requiredLevel;
	}

	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}
	@ManyToMany
	public Collection<Task> getTasks() {return tasks;}
	public void setTasks(Collection<Task> tasks) {this.tasks = tasks;}
 	
}

