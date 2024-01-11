package com.example.mpesademo.dtos.stk_push.stk_results;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value")
    public Object value;
}
