package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionStatusRequest {

    @JsonProperty("Initiator")
    public String initiator;
    @JsonProperty("SecurityCredential")
    public String securityCredential;
    @JsonProperty("CommandID")
    public String command_ID;
    @JsonProperty("TransactionID")
    public String transaction_ID;

    @JsonProperty("PartyA")
    public String partyA;
    @JsonProperty("IdentifierType")
    public String identifierType;
    @JsonProperty("ResultURL")
    public String resultURL;
    @JsonProperty("QueueTimeOutURL")
    public String queueTimeOutURL;
    @JsonProperty("Remarks")
    public String remarks;
    @JsonProperty("Occasion")
    public String occasion;

}
