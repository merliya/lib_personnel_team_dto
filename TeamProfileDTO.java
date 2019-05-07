package com.jbhunt.personnel.team.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jbhunt.personnel.schedule.dto.TaskAssignmentResponsibilityGroupDTO;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamProfileDTO {
	
	private String userID;
	
	private String personEmployeeID;

    private String firstName;

    private String lastName;
    
    private String preferredName;
    
    private String teamName;

    private String title;
    
    private Integer taskAssignmentID;

	private String taskAssignmentName;

	private Integer taskGroupID;

	private String taskGroupName;
	
	private String roleTypeCode;
	
	private List<TaskAssignmentResponsibilityGroupDTO> taskAssignmentResponsibilityGroupDTOs = new ArrayList<>();
	
	public TeamProfileDTO(){
		
	}
	public TeamProfileDTO(String userID,String personEmployeeID,String firstName,String lastName,String preferredName,String title,
			Integer taskAssignmentID,String taskAssignmentName,Integer taskGroupID,String taskGroupName,String roleTypeCode,String teamName){
		this.userID=userID;
		this.personEmployeeID=personEmployeeID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.preferredName=preferredName;
		this.title=title;
		this.taskAssignmentID=taskAssignmentID;
		this.taskAssignmentName=taskAssignmentName;
		this.taskGroupID=taskGroupID;
		this.taskGroupName=taskGroupName;
		this.roleTypeCode=roleTypeCode;
		this.teamName=teamName;
	}
}
