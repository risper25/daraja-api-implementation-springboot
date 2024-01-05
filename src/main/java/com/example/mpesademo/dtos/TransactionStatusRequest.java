package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionStatusRequest {
    @JsonProperty("Initiator")
    public String initiator;
    @JsonProperty("SecurityCredential")
    public String securityCredential;
    @JsonProperty("Command ID")
    public String command_ID;
    @JsonProperty("Transaction ID")
    public String transaction_ID;
    @JsonProperty("OriginatorConversationID")
    public String originatorConversationID;
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
