package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReferenceItem {
    @JsonProperty("Key")
    public String key;
    @JsonProperty("Value")
    public String value;
}
