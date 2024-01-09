package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionStatusRequest {

    @JsonProperty("Initiator")
    public String initiator;
    @JsonProperty("SecurityCredential")
    public String securityCredential;
    @JsonProperty("CommandID")
    public String command_ID;
    @JsonProperty("TransactionID")
    public String transaction_ID;

    @JsonProperty("PartyA")
    public String partyA;
    @JsonProperty("IdentifierType")
    public String identifierType;
    @JsonProperty("ResultURL")
    public String resultURL;
    @JsonProperty("QueueTimeOutURL")
    public String queueTimeOutURL;
    @JsonProperty("Remarks")
    public String remarks;
    @JsonProperty("Occasion")
    public String occasion;
    /* "Initiator": "testapi",
    "SecurityCredential": "I6cy6v3j92Ay6rscL47JzXncMOPmKkVCf26rXblj0IZw6yfA/ziVNDmZKas67PaA1JE5WSTkcUTta++uIvO4KYGpzHL/BWUrMc8jh91YxKst0Dm0jrfkpQSd1N/9nwGtpZLfRGm4HjC85zH52LBNrGCRObyAsXQHDfb85cw3dl4a1Iyu1irpoQZYyb1um914gNiymHeyIwDW8WxAABgSygY1t1/6eo02df/b9Un3ZOsP5FhOzbc/0sXVSBQ4HbDhUlUGAADvC9KGZv/PrbVxk3vmmIWObo7/pnP/xkGBxOjTUIJV+E3X8hzV6YXxUgGK/r4dgShBd4+1f+faiUeR/g==",
    "CommandID": "TransactionStatusQuery",
    "TransactionID": "OEI2AK4Q16",
    "PartyA": 600996,
    "IdentifierType": 4,
    "ResultURL": "https://mydomain.com/TransactionStatus/result/",
    "QueueTimeOutURL": "https://mydomain.com/TransactionStatus/queue/",
    "Remarks": "ff",
    "Occassion": "ff",*/
}
