package com.example.mpesademo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
@ConfigurationProperties(prefix = "mpesa.daraja")
public class MpesaConfiguration {
    private String basic_auth;
    private String outh_endpoint;
    private int shortCode;
    private String responseType;
    private String confirmationURL;
    private String validationURL;
    private String mediaType;
    private String register_url_endpoint;
    private String simulateC2B_endpoint;
    private String b2c_transaction_endpoint;
    private String b2c_result_url;
    private String b2c_queue_timeout_url;
    private String b2c_initiator_name;
    private String b2c_initiator_password;
    private String b2c_security_credential;
    private String b2c_originator_conversation_ID;
    private String b2c_partyA;
    private String transaction_status_endpoint;
    private String transaction_status_result_url;
    private String transaction_status_queue_timeout_url;


}
