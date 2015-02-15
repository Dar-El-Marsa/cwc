package com.esprit.cwc.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.inject.spi.ProcessAnnotatedType;
import javax.persistence.*;



	@Entity
	@Table(name = "t_team")
	public class Team implements Serializable {
		
	private static final long serialVersionUID = 1L;
		
		
	private int id;
    private Project project;
	private TeamManager teamManager;
	
	private Collection<Employee>employees;
	

	public Team() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}

	@OneToOne
	public TeamManager getTeamManager() {return this.teamManager;}
	public void setTeamManager(TeamManager teamManager) {this.teamManager = teamManager;}

	
	@OneToMany(mappedBy="team")
	public Collection<Employee> getEmployees() {return employees;}
	public void setEmployees(Collection<Employee> employees) {this.employees = employees;}

	
	@OneToOne(mappedBy="team")
	public Project getProject() {return project;}
	public void setProject(Project project) {this.project = project;}
	
	
	


}
