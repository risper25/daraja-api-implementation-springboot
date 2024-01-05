package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionStatusSyncResponse {
    @JsonProperty("OriginatorConversationID")
    public String originatorConversationID;
    @JsonProperty("ConversationID")
    public String conversationID;
    @JsonProperty("ResponseCode")
    public String responseCode;
    @JsonProperty("ResponseDescription")
    public String responseDescription;
}
