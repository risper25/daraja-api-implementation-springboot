package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResultParameter {
    @JsonProperty("Key")
    public String key;
    @JsonProperty("Value")
    public Object value;
}
