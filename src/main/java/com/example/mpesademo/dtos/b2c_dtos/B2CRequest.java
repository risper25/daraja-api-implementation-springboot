package com.example.mpesademo.dtos.b2c_dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class B2CRequest {
    @JsonProperty("OriginatorConversationID")
    public String originatorConversationID;
    @JsonProperty("InitiatorName")
    public String initiatorName;
    @JsonProperty("SecurityCredential")
    public String securityCredential;
    @JsonProperty("CommandID")
    public String commandID;
    @JsonProperty("Amount")
    public String amount;
    @JsonProperty("PartyA")
    public String partyA;
    @JsonProperty("PartyB")
    public String partyB;
    @JsonProperty("Remarks")
    public String remarks;
    @JsonProperty("QueueTimeOutURL")
    public String queueTimeOutURL;
    @JsonProperty("ResultURL")
    public String resultURL;
    @JsonProperty("Occassion")
    public String occassion;
}
