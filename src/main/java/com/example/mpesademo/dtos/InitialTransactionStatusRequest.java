package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InitialTransactionStatusRequest {
    @JsonProperty("Command ID")
    public String command_ID;
    @JsonProperty("Transaction ID")
    public String transaction_ID;

    @JsonProperty("PartyA")
    public String partyA;
    @JsonProperty("IdentifierType")
    public String identifierType;

    @JsonProperty("Remarks")
    public String remarks;
    @JsonProperty("Occasion")
    public String occasion;
}

