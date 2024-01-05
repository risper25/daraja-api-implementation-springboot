package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReferenceDataTS {
    @JsonProperty("ReferenceItem")
    public ReferenceItemTS referenceItem_ts;
}
