package com.esprit.cwc.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public class Employee implements Serializable {
	

	private static final long serialVersionUID = 1L;
	//attributs
	private int id;
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private float salary;
	private int cin;
	private String email;
	private String adress;
	private int tel;
	private int registrationNum;
	
	private Team team;
	private Collection<Reward> rewards;
	private Collection<Skill> skills;
	private Collection<TrainingSession>tSessions;
	private Collection<Activity>activities;
	private Collection<Task> tasks;
	
	
	public Employee() {
		super();
	} 
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}   
	
	public String getFirstName() {return this.firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}   
	
	public String getLastName() {return this.lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}   
	
	public String getLogin() {return this.login;}
	public void setLogin(String login) {this.login = login;}   
	
	public String getPassword() {return this.password;}
	public void setPassword(String password) {this.password = password;}   
	
	public float getSalary() {return this.salary;}
	public void setSalary(float salary) {this.salary = salary;}
	
	public int getCin() {return this.cin;}
	public void setCin(int cin) {this.cin = cin;}   
	
	public String getEmail() {return this.email;}
	public void setEmail(String email) {this.email = email;}
	
	public String getAdress() {return this.adress;}
	public void setAdress(String adress) {this.adress = adress;}   
	
	public int getTel() {return this.tel;}
	public void setTel(int tel) {this.tel = tel;}   
	
	public int getRegistrationNum() {return this.registrationNum;}
	public void setRegistrationNum(int registrationNum) {this.registrationNum = registrationNum;}
	
	@ManyToMany
	public Collection<Reward> getRewards() {return rewards;}
	public void setRewards(Collection<Reward> rewards) {this.rewards = rewards;}
	
	@ManyToMany(mappedBy="employees")
	public Collection<Skill> getSkills() {return skills;}
	public void setSkills(Collection<Skill> skills) {this.skills = skills;}
	
	@ManyToMany(mappedBy="employees")
	public Collection<TrainingSession> gettSessions() {return tSessions;}
	public void settSessions(Collection<TrainingSession> tSessions) {this.tSessions = tSessions;}

	@ManyToMany(mappedBy="employees")
	public Collection<Activity> getActivities() {return activities;}
	public void setActivities(Collection<Activity> activities) {this.activities = activities;}

	
	@ManyToOne
	public Team getTeam() {return team;}
	public void setTeam(Team team) {this.team = team;}

	@OneToMany(mappedBy="employee")
	public Collection<Task> getTasks() {return tasks;}
	public void setTasks(Collection<Task> tasks) {this.tasks = tasks;}
	
}
