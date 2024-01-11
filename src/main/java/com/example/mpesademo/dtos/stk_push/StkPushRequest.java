package com.example.mpesademo.dtos.stk_push;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StkPushRequest {
    @JsonProperty("BusinessShortCode")
    public String businessShortCode;
    @JsonProperty("Password")
    public String password;
    @JsonProperty("Timestamp")
    public String timestamp;
    @JsonProperty("TransactionType")
    public String transactionType;
    @JsonProperty("Amount")
    public String amount;
    @JsonProperty("PartyA")
    public String partyA;
    @JsonProperty("PartyB")
    public String partyB;
    @JsonProperty("PhoneNumber")
    public String phoneNumber;
    @JsonProperty("CallBackURL")
    public String callBackURL;
    @JsonProperty("AccountReference")
    public String accountReference;
    @JsonProperty("TransactionDesc")
    public String transactionDesc;
}
