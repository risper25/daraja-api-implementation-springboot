package com.example.mpesademo.dtos.stk_push.stk_results;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StkCallback {
    @JsonProperty("MerchantRequestID")
    public String merchantRequestID;
    @JsonProperty("CheckoutRequestID")
    public String checkoutRequestID;
    @JsonProperty("ResultCode")
    public int resultCode;
    @JsonProperty("ResultDesc")
    public String resultDesc;
    @JsonProperty("CallbackMetadata")
    public CallbackMetadata callbackMetadata;
}
