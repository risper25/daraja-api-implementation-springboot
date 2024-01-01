package com.example.mpesademo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.SneakyThrows;

@Data
public class AccessTokenResponse {
    @JsonProperty("access_token")
    private String access_token;

    @JsonProperty("expires_in")
    private String expiresIn;

    @SneakyThrows
    @Override
    public String toString(){
        return new ObjectMapper().writeValueAsString(this);
    }

}
