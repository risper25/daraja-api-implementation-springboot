package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InitialB2CTransactionRequest {
    //
    @JsonProperty("CommandID")
    public String commandID;
    @JsonProperty("Amount")
    public String amount;
    @JsonProperty("PartyB")
    public String partyB;
    @JsonProperty("Remarks")
    public String remarks;
    @JsonProperty("Occassion")
    public String occassion;

}
