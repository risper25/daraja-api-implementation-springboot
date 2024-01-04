package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Result {
    @JsonProperty("ResultType")
    public int resultType;
    @JsonProperty("ResultCode")
    public int resultCode;
    @JsonProperty("ResultDesc")
    public String resultDesc;
    @JsonProperty("OriginatorConversationID")
    public String originatorConversationID;
    @JsonProperty("ConversationID")
    public String conversationID;
    @JsonProperty("TransactionID")
    public String transactionID;
    @JsonProperty("ResultParameters")
    public ResultParameters resultParameters;
    @JsonProperty("ReferenceData")
    public ReferenceData referenceData;
}
