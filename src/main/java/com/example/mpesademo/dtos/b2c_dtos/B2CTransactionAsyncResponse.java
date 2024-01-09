package com.example.mpesademo.dtos.b2c_dtos;

import com.example.mpesademo.dtos.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class B2CTransactionAsyncResponse {
    @JsonProperty("Result")
    public Result result;
}
