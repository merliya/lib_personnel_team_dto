package com.jbhunt.personnel.team.dto;

import java.util.List;

import lombok.Data;

@Data
public class TeamSearchDTO {
	
	private List<Integer> taskGroupIDs;
	private List<String> personIDs;
	private List<String> roleCodes;
	private List<String> teamLeaderPersonIDs;
	private String searchCriteria; 
	private boolean activeTeamsOnly;
	private boolean inActiveTeamsOnly;
}
