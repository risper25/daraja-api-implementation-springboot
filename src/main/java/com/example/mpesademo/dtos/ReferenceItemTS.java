package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReferenceItemTS {
    @JsonProperty("Key")
    public String key;
}
