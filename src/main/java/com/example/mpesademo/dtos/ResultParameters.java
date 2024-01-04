package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
@Data
public class ResultParameters {
    @JsonProperty("ResultParameter")
    public ArrayList<ResultParameter> resultParameter;
}
