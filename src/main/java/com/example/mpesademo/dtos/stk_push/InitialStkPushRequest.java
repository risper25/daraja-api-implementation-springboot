package com.example.mpesademo.dtos.stk_push;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InitialStkPushRequest {
    @JsonProperty("BusinessShortCode")
    public int businessShortCode;

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
    @JsonProperty("AccountReference")
    public String accountReference;
    @JsonProperty("TransactionDesc")
    public String transactionDesc;
//"BusinessShortCode":,"TransactionType":,"Amount":,"PartyA":,"PartyB":,"PhoneNumber":,"AccountReference":,"TransactionDesc":


}
