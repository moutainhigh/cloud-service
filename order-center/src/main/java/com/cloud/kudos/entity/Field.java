package com.cloud.kudos.entity;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
public class Field {

    @JsonProperty("Applicant")
    private Applicant applicant;
    @JsonProperty("@key")
    private String key;
}