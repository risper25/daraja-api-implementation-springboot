package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionStatusAsyncResponse {
    @JsonProperty("Result")
    public ResultTransactionStatus resultTS;
}
