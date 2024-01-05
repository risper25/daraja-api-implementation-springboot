package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultTransactionStatus {
    @JsonProperty("ConversationID")
    public String conversationID;
    @JsonProperty("OriginatorConversationID")
    public String originatorConversationID;
    @JsonProperty("ReferenceData")
    public ReferenceDataTS referenceData_ts;
    @JsonProperty("ResultCode")
    public int resultCode;
    @JsonProperty("ResultDesc")
    public String resultDesc;
    @JsonProperty("ResultParameters")
    public ResultParameters resultParameters;
    @JsonProperty("ResultType")
    public int resultType;
    @JsonProperty("TransactionID")
    public String transactionID;
}
