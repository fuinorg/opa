package org.fuin.opa;

import java.util.List;

public class Team implements Entity {

	String name;
	
	List<Team> childTeams;
	
	List<TeamRole> teamRoles;
	
	Person lead;
	
	List<Topic> topics;
	
}
