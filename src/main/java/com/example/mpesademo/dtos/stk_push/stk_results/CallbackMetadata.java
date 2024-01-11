package com.example.mpesademo.dtos.stk_push.stk_results;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CallbackMetadata {
    @JsonProperty("Item")
    public ArrayList<Item> item;
}
