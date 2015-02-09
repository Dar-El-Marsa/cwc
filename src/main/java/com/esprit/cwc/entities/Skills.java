package com.esprit.cwc.entities;

import java.util.Enumeration;
import java.util.Vector;

public class Skills {
	Enumeration <String> All;
	Vector <String> skillsTypes = new Vector<String>();
	
	Enumeration<String> getSkills(){
		skillsTypes.add("JAVA SE");
		skillsTypes.add("JAVA EE");
		skillsTypes.add("WILDFLY");
		skillsTypes.add("C");
		skillsTypes.add("C++");
		All = skillsTypes.elements();
		return All;
	}
	
	void addSkill(String skill){
		skillsTypes.add(skill);
		
	}
}
