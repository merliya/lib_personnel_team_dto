package com.jbhunt.personnel.team.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jbhunt.infrastructure.exception.dto.MessageType;
import com.jbhunt.infrastructure.exception.dto.ValidationErrorDTO;

import lombok.Data;
@Data
public class TeamValidationDTO {
    private Map<String, ValidationErrorDTO> errors;

    public TeamValidationDTO() {
        errors = new HashMap<>();
    }

    @JsonAnySetter
    public void addError(MessageType errorType, @JsonProperty("code") String key, List<String> params) {
        errors.put(key, new ValidationErrorDTO(errorType, key, params));
    }
}
