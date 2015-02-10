package com.esprit.cwc.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class TeamManager extends Employee {
	
	private Team team;

	@OneToOne(mappedBy="teamManager")
	public Team getTeam() {return team;}
	public void setTeam(Team team) {this.team = team;}
	
	

}
