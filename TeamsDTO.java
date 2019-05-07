package com.jbhunt.personnel.team.dto;

import java.time.LocalDateTime;
import java.util.Set;

import com.jbhunt.infrastructure.taskreferencedata.dto.TaskGroupDTO;

import lombok.Data;

@Data
public class TeamsDTO {
    private Integer teamID;
    private String teamName;
    private String TaskGroupName;
    private Set<TaskGroupDTO> taskGroupDTOs;
    private long teamMemberCount;
    private String teamLeaderPersonID;
    private String teamLeaderTitle;
    private String teamLeaderPersonFirstName;
    private String teamLeaderPersonLastName;
    private LocalDateTime effectiveTimeStamp;
    private LocalDateTime expirationTimeStamp;
    private String taskGroupsString;
    public TeamsDTO( String teamName, Integer teamID,String teamLeaderPersonID,LocalDateTime effectiveTimeStamp,LocalDateTime expirationTimeStamp,long teamMemberCount) {
        super();
        this.teamID = teamID;
        this.teamName = teamName;
        this.teamMemberCount = teamMemberCount;
        this.teamLeaderPersonID = teamLeaderPersonID;
        this.effectiveTimeStamp=effectiveTimeStamp;
        this.expirationTimeStamp=expirationTimeStamp;
    }

}
