package com.esprit.cwc.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reward
 *
 */
@Entity

public class Reward implements Serializable {

	private int id;
	private Rewards reward;
	private static final long serialVersionUID = 1L;

	public Reward() {
		super();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}
	
	public Rewards getReward() {return this.reward;}
	public void setReward(Rewards reward) {this.reward = reward;}
     
}
