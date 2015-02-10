package com.esprit.cwc.entities;

import java.io.File;
import java.io.Serializable;
import java.lang.String;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="t_task")
public class Task implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int id;
	private Project project;
	private String description;
	private File attachement;
	private Date deadLine;
	private Date startDate;
	private State state;
	
	private Collection<TaskSkills>taskSkills;
	private Employee employee;
	
	public Task() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}    
		
	public String getDescription() {return this.description;}
	public void setDescription(String description) {this.description = description;}   
	
	public File getAttachement() {return this.attachement;}
	public void setAttachement(File attachement) {this.attachement = attachement;}   
	
	public Date getDeadLine() {return this.deadLine;}
	public void setDeadLine(Date deadLine) {this.deadLine = deadLine;}   
	
	public Date getStartDate() {return this.startDate;}
	public void setStartDate(Date startDate) {this.startDate = startDate;}

	
	@ManyToOne
	public Project getProject() {return project;}
	public void setProject(Project project) {this.project = project;}
	
	
	@ManyToMany(mappedBy="tasks")
	public Collection<TaskSkills> getTaskSkills() {return taskSkills;}
	public void setTaskSkills(Collection<TaskSkills> taskSkills) {this.taskSkills = taskSkills;}

	
	@ManyToOne
	public Employee getEmployee() {return employee;}
	public void setEmployee(Employee employee) {this.employee = employee;}

	public State getState() {return state;}
	public void setState(State state) {this.state = state;}   
		
}
