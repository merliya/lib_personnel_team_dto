package com.jbhunt.personnel.team.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.jbhunt.infrastructure.taskassignment.entity.TaskAssignment;
import com.jbhunt.infrastructure.taskreferencedata.entity.TaskGroup;
import com.jbhunt.personnel.schedule.dto.TaskAssignmentDTO;
import com.jbhunt.personnel.schedule.dto.TeamPersonDTO;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDTO {

	private String createdBy;
	private LocalDateTime createdOn;
	private String updatedBy;
	private LocalDateTime updatedOn;

	private Integer teamID;
	private String teamName;
	private String teamLeaderPersonFirstName;
	private String teamLeaderPersonLastName;
	private String teamLeaderPersonID;
	private String teamLeaderTitle;
	private String TaskGroupName;
	private List<TaskGroup> taskGroups;
	private List<TeamPersonDTO> teamPersonDTOs;
	private List<TaskAssignment> taskAssignments;
	private Set<TaskAssignmentDTO> taskAssignmentDTOs;
	private long teamMemberCount;


	private List<TeamProfileDTO> teamProfileDTOs;
	@JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime teamEffectiveTimestamp;
	@JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime teamExpirationTimestamp;
	private TeamValidationDTO teamValidationDTO;	
	public TeamDTO(){
		
	}
	public TeamDTO(String teamName,Integer teamID,String teamLeaderPersonID,Long teamMemberCount){
		this.teamName=teamName;
		this.teamID=teamID;
		this.teamLeaderPersonID=teamLeaderPersonID;
		this.teamMemberCount=teamMemberCount;
	}
}
