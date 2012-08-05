package org.fuin.opa;

import java.util.List;

public class Task implements Entity {

	String name;
	
	int estimatedEffortPD;
	
	int restEffortPD;
	
	TeamMember assignedTo;
	
	List<Activity> activities;
	
}
