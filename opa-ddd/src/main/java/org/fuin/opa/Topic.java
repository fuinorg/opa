package org.fuin.opa;

import java.util.List;

public class Topic implements Entity {

	String name;
	
	// TODO: Either child topics OR tasks are allowed 
	
	List<Topic> childTopics;
	
	List<Task> tasks;
	
}
