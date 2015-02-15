package com.esprit.cwc.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Trainer extends Employee {
	
	private Collection<TrainingSession>tSessions;
	
	@OneToMany(mappedBy="trainer")
	public Collection<TrainingSession> gettSessions() {return tSessions;}
	public void settSessions(Collection<TrainingSession> tSessions) {this.tSessions = tSessions;}
	
}
