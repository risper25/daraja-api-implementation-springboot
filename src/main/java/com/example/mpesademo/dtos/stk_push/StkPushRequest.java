package com.example.mpesademo.dtos.stk_push;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StkPushRequest {
    @JsonProperty("BusinessShortCode")
    public int businessShortCode;
    @JsonProperty("Password")
    public String password;
    @JsonProperty("Timestamp")
    public String timestamp;
    @JsonProperty("TransactionType")
    public String transactionType;
    @JsonProperty("Amount")
    public int amount;
    @JsonProperty("PartyA")
    public long partyA;
    @JsonProperty("PartyB")
    public int partyB;
    @JsonProperty("PhoneNumber")
    public long phoneNumber;
    @JsonProperty("CallBackURL")
    public String callBackURL;
    @JsonProperty("AccountReference")
    public String accountReference;
    @JsonProperty("TransactionDesc")
    public String transactionDesc;
}