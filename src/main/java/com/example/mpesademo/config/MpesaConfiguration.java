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

}
