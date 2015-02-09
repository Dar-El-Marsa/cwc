package com.esprit.cwc.entities;

import java.util.Enumeration;
import java.util.Vector;

public class Rewards {
	Enumeration <String> All;
	Vector <String> rewardsTypes = new Vector<String>();
	
	Enumeration<String> getRewards(){
		rewardsTypes.add("Week-end");
		rewardsTypes.add("Money");
		rewardsTypes.add("Premium wage");
		All = rewardsTypes.elements();
		return All;
	}
 	
}
