package com.example.mpesademo.dtos.stk_push;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StkPushResponse {
    @JsonProperty("MerchantRequestID")
    public String merchantRequestID;
    @JsonProperty("CheckoutRequestID")
    public String checkoutRequestID;
    @JsonProperty("ResponseCode")
    public String responseCode;
    @JsonProperty("ResponseDescription")
    public String responseDescription;
    @JsonProperty("CustomerMessage")
    public String customerMessage;
}
