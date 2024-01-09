package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InitialTransactionStatusRequest {

    @JsonProperty("TransactionID")
    public String transaction_ID;




}

