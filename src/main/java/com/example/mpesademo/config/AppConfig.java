package com.example.mpesademo.config;

import com.example.mpesademo.dtos.AcknowledgeResponse;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient();
    }
    @Bean
    public AcknowledgeResponse getAknowledgeResponse(){
        AcknowledgeResponse acknowledgeResponse =new AcknowledgeResponse();
        acknowledgeResponse.setMessage("success");
        return acknowledgeResponse;
    }
}
