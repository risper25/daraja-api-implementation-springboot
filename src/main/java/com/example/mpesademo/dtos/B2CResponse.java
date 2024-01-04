package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class B2CResponse {
    @JsonProperty("ConversationID")
    public String conversationID;
    @JsonProperty("OriginatorConversationID")
    public String originatorConversationID;
    @JsonProperty("ResponseCode")
    public String responseCode;
    @JsonProperty("ResponseDescription")
    public String responseDescription;
}
