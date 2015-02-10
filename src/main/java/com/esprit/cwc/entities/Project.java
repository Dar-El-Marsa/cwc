package com.esprit.cwc.entities;

import java.io.File;
import java.io.Serializable;
import java.lang.String;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity
@Table(name="t_project")

public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private int id;
	private String titre;
	private String description;
	private File attachement;
	private Date deadLine;
	private Date creationDate;
	private Date startDate;
	private Team team;
	private State state;
	private Collection<Task> tasks;

	public Project() {
		super();
	}  
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}   
	
	
	public String getTitre() {return this.titre;}
	public void setTitre(String titre) {this.titre = titre;}   
	
	
	public String getDescription() {return this.description;}
	public void setDescription(String description) {this.description = description;}
	
	
	public Date getDeadLine() {return deadLine;}
	public void setDeadLine(Date deadLine) {this.deadLine = deadLine;}
	
	
	public Date getCreationDate() {return creationDate;}
	public void setCreationDate(Date creationDate) {this.creationDate = creationDate;}
	
	
	public Date getStartDate() {return startDate;}
	public void setStartDate(Date startDate) {this.startDate = startDate;}
	
	
	public File getAttachement() {return attachement;}
	public void setAttachement(File attachement) {this.attachement = attachement;}

	
	@OneToOne
	public Team getTeam() {return team;}
	public void setTeam(Team team) {this.team = team;}
	
	@OneToMany(mappedBy="project")
	public Collection<Task> getTasks() {return tasks;}
	public void setTasks(Collection<Task> tasks) {this.tasks = tasks;}

	@Enumerated(EnumType.STRING)
	public State getState() {return state;}
	public void setState(State state) {this.state = state;}

	
}